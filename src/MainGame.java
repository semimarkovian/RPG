import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/***
 * @author owner
 * The main class
 */
public class MainGame implements Serializable {

    // Save directory
    public static String SAVE_DIRECTORY = "E:\\java\\RPG\\save";

    // Determines if game continues
    static boolean keepPlaying = true;

	/***
	 * Starts the game
	 * @param args Command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Initialize JFrame stuff
		JFrame frame = new JFrame();
		// Introduce the game
        String initialOptions[] = {"New Game", "Load Game", "Quit"};
		int initialChoice = JOptionPane.showOptionDialog(frame, "Welcome to RPG!", "Choose an option",
                                                        0,
                                                        JOptionPane.QUESTION_MESSAGE,
                                                        null,
                                                        initialOptions,
                                                        "New Game");

        // Quit game
        if(initialChoice == 2) {
            quitGame();
        }

        // Load game
        if(initialChoice == 1) {
//            try {
//
//            }
//            catch(IOException i) {
//                i.printStackTrace();
//            }
            quitGame();
        }

		// Ask what character the player wants
		String characterOptions[] = {"Warrior", "Rogue", "Sorcerer"};
		int characterClass = JOptionPane.showOptionDialog(frame, "What type of character would you like?",
				                                          "Choose a class.",
				                                          0,
				                                          JOptionPane.QUESTION_MESSAGE,
				                                          null,
				                                          characterOptions,
				                                          "Warrior");


        // Ask for character name
        String playerName = JOptionPane.showInputDialog(frame, "What is your name?");
				                     
		// Create the character
		Player player;
		switch(characterClass) {
			case 0: // Warrior
				player = new Warrior(playerName);
				break;
			case 1: // Rogue
				player = new Rogue(playerName);
				break;
			case 2: // Sorcerer
				player = new Sorcerer(playerName);
				break;
            default: // Use warrior by default
                player = new Warrior(playerName);
                break;
		}


        // Main loop
        while(keepPlaying) {
            mainMenu(player);
        }

        // End game
		quitGame();
	}
	
	/***
	 * Displays the main menu
	 */
	public static void mainMenu(Player player) {

        // Action options
        String actionOptions[] = {"Fight", "Rest", "Save", "View Stats", "View Spells", "Equipment", "Inventory",
                                  "Quit"};

        // Prompt action from user
		int action = JOptionPane.showOptionDialog(null, "What would you like to do?",
                                                  "Main Menu",
                                                  0,
                                                  JOptionPane.QUESTION_MESSAGE,
                                                  null,
                                                  actionOptions,
                                                  "View Stats");

        switch(action) {
            case 0: // Fight
                Battle battle = new Battle(player);
                battle.fight(player);
                break;
            case 1: // Rest
                break;
            case 2: // Save
//                try {
//                    //FileOutputStream fileOut = newFileOutputStream(SAVE_DIRECTORY + "\\");
//                }
//                catch(IOException i) {
//                    i.printStackTrace();
//                }
                break;
            case 3: // View Stats
                playerStats(player);
                break;
            case 4: // View spells
                if(!(player instanceof Sorcerer)) {
                    JOptionPane.showMessageDialog(null, "You aren't a sorcerer, you have no spells!");
                }
                else {
                    // Display spells here
                    String spellString = "";
                    for(Spell s : ((Sorcerer)player).getSpells()) {
                        spellString += s.getSpellName() + ": Level " + s.getSpellLevel() +", " +
                                s.getMinDamage() + "-" + s.getMaxDamage() + " damage, " + s.getManaCost() + " mana.";
                    }
                    JOptionPane.showMessageDialog(null, spellString);
                }
                break;
            case 5: // Equipment
                break;
            case 6: // Inventory
                break;
            case 7: // Quit
                quitGame();
        }

        mainMenu(player);
	}

    /**
     * Displays player stats
     */
    public static void playerStats(Player player) {
        // Show crit as percent
        NumberFormat percentFormat = NumberFormat.getPercentInstance();


        String statsString = "";
        statsString += "Name: " + player.getName() + "\n";
        statsString += "Level: " + player.getLevel() + "\n";
        statsString += "Life: " + player.getLife() + "/" + player.getMaxLife() + "\n";
        statsString += "Mana: " + player.getMana() + "/" + player.getMaxMana() + "\n";
        statsString += "Experience: " + player.getExp() + "\n";
        statsString += "Gold: " + player.getGold() + "\n";
        statsString += "Strength: " + player.getStrength() + "\n";
        statsString += "Dexterity: " + player.getDexterity() + "\n";
        statsString += "Intelligence: " + player.getIntelligence() + "\n";
        statsString += "Vitality: " + player.getVitality() + "\n";
        statsString += "Attack Rating: " + player.getAttackRating() + "\n";
        statsString += "Defense Rating: " + player.getDefenseRating() + "\n";
        statsString += "Armor: " + player.getArmor() + "\n";
        statsString += "Magic Resist: " + player.getMagicResist() + "\n";
        statsString += "Crit Chance: " + percentFormat.format(player.getCritChance()) + "\n";
        statsString += "Crit Damage: " + percentFormat.format(player.getCritDamage()) + "\n";

        JOptionPane.showMessageDialog(null, statsString);
    }
	
	/***
	 * Ends the game
	 */
	public static void quitGame() {
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "Thanks for playing!");
		System.exit(0);
	}
}

