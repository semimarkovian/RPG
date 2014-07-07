import java.util.ArrayList;
import javax.swing.*;
import java.math.*;

/***
 * This class represents a battle
 *
 */
public class Battle {

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
    }

    /**
     * Begin the battle
     */
    public void fight(Player player) {

        // Add monsters to the battle
        monsters.add(new Slime());

        // Intro message
        String introMessage = "Battle begins! You have encountered:\n";
        for (Monster m : monsters) {
            introMessage += m.getMonsterType();
        }
        JOptionPane.showMessageDialog(null, introMessage);

        // While monsters are still alive
        while (!monsters.isEmpty()) {

            playerTurn(player);
            monsterTurn();


        }
    }

    /**
     * Player acts
     */
    public void playerTurn(Player player) {
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
                break;
            case 1: // Cast Spell
                if(!(player instanceof Sorcerer)) {
                    JOptionPane.showMessageDialog(null, "You aren't a sorcerer, you have no spells!");
                    playerTurn(player);
                }
                else {

                }
                break;
            case 2: // Use Item
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
        }


    /**
     * Monsters act
     */
    public void monsterTurn() {
        for(Monster m : monsters) {
            m.attacks();
        }
    }
}