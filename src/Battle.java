import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;
import java.math.*;
import java.util.Iterator;

/***
 * This class represents a battle
 *
 */
public class Battle implements Serializable {

    /**
     * Gold bounty from monsters
     */
    protected int goldBounty;

    /**
     * Exp bounty from monsters
     */
    protected int expBounty;

    /**
     * The monsters in the battle
     */
    private ArrayList<Monster> monsters;

    /**
     * Constructor
     *
     * @param player The player object
     */
    public Battle(Player player) {
        monsters = new ArrayList<Monster>();
        goldBounty = 0;
        expBounty = 0;
    }

    // Generate the monsters
    public ArrayList<Monster> generateMonsters() {
        // Add monsters
        monsters.add(new Slime());
        // Compute exp and gold bounties
        for(Monster m : monsters) {
            expBounty += m.expBounty;
            goldBounty += m.goldBounty;
        }
        return monsters;
    }

    /**
     * Begin the battle
     */
    public void fight(Player player) {

        // Add monsters to the battle
        monsters = generateMonsters();

        // Intro message
        String introMessage = "Battle begins! You have encountered:\n";
        for (Monster m : monsters) {
            introMessage += m.getMonsterType() + "\n";
        }
        JOptionPane.showMessageDialog(null, introMessage);

        // While monsters are still alive
        while (!monsters.isEmpty()) {

            playerTurn(player, monsters);
            monsterTurn(player, monsters);


        }
    }

    /**
     * Determine the amount of damage dealt
     */
    public int playerDamageDealt(Player player, Monster monster) {
        return player.baseDamage;
    }

    /**
     * Player acts
     */
    public void playerTurn(Player player, ArrayList<Monster> monsters) {

        // Prompt action from user
        String actionOptions[] = {"Attack", "Cast Spell", "Use Item", "Run"};
        int action = JOptionPane.showOptionDialog(null, "What would you like to do?",
                "Battle",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                actionOptions,
                "Attack");

        // Take player action
        switch (action) {
            case 0: // Attack
                int target = -1;
                while(target < 0 || target >= monsters.size()) {
                    target = Integer.parseInt(JOptionPane.showInputDialog("Which monster would you like to attack?" +
                            " (0-" +  (monsters.size()-1) +")"));
                }
                // Target monster
                Monster targetMonster = monsters.get(target);

                // Determine the amount of damage dealt
                int damage = playerDamageDealt(player, monsters.get(target));
                // If damage is positive, deal damage to monster
                if(damage > 0) {
                    int targetMonsterLife = targetMonster.getLife();
                    targetMonster.setLife(targetMonsterLife - damage);
                }
                break;
            case 1: // Cast Spell
                if(!(player instanceof Sorcerer)) {
                    JOptionPane.showMessageDialog(null, "You aren't a sorcerer, you have no spells!");
                    playerTurn(player, monsters);
                }
                else {
                    ((Sorcerer) player).displaySpells();
                }
                break;
            case 2: // Use Item
                MainGame.inventoryScreen(player);
                break;
            case 3: // Run
                if (Math.random() > 0.25) {
                    JOptionPane.showMessageDialog(null, "You escaped!");
                    for (Monster m : monsters) {
                        monsters.remove(m);
                    }
                }
                    else {
                        JOptionPane.showMessageDialog(null, "You failed to escape!");
                    }
                break;
                }

            // Check if monsters are dead
            Iterator<Monster> iter = monsters.iterator();
            while(iter.hasNext()) {
                if(iter.next().getLife() <= 0) {
                    iter.remove();
                }
            }

            // Check if battle is over.
            if(monsters.isEmpty()) {
                playerWon(player);
            }
        }


    /**
     * Monsters act
     */
    public void monsterTurn(Player player, ArrayList<Monster> monsters) {
        // Have each monster take its action
        for(Monster m : monsters) {
            m.attacks(player);
            // Check if player is dead
            if(player.getLife() <= 0) {
                // Get player's choice
                String deathOptions[] = {"New Game", "Load Game", "Quit"};
                int choice = JOptionPane.showOptionDialog(null, "You have died!", "Choose an option",
                        0,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        deathOptions,
                        "Quit");
                switch(choice) {
                    case 0: // New game
                        player = null;
                        MainGame.main(null);
                        break;
                    case 1: // Load game
                        MainGame.loadGame();
                        break;
                    case 2: // Quit
                        MainGame.quitGame();
                        break;
                }
            }
        }

    }

    /**
     * Called when player wins
     * @param player The player object
     */
    public void playerWon(Player player) {
        JOptionPane.showMessageDialog(null, "You won! You received:\n" + expBounty + " experience\n" +
         goldBounty + " gold.");
        player.setExp(player.getExp() + expBounty);
        // Check if player leveled up
        if(player.getExp() > Player.LEVEL_EXP[player.getLevel()]) {
            player.levelUp();
        }

        player.setGold(player.getGold() + goldBounty);
    }
}