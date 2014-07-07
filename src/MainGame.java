import javax.swing.*;
import java.text.NumberFormat;

/***
 * @author owner
 * The main class
 */
public class MainGame {

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

        if(initialChoice == 2) {
            quitGame();
        }

        if(initialChoice == 1) {
            JOptionPane.showMessageDialog(frame, "Haven't implemented this yet!");
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
				                     
		// Create the character
		Player player;
		switch(characterClass) {
			case 0:
				player = new Warrior();
				break;
			case 1:
				player = new Rogue();
				break;
			case 2:
				player = new Sorcerer();
				break;
            default:
                player = new Warrior();
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
        String actionOptions[] = {"Fight", "Rest", "Save", "View Stats", "Inventory", "Quit"};

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
                break;
            case 1: // Rest
                break;
            case 2: // Save
                break;
            case 3: // View Stats
                playerStats(player);
                break;
            case 4: // Inventory
                break;
            case 5: // Quit
                keepPlaying = false;
                break;
        }

	}

    /**
     * Displays player stats
     */
    public static void playerStats(Player player) {
        // Show crit as percent
        NumberFormat percentFormat = NumberFormat.getPercentInstance();


        String statsString = "";
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
        statsString += "Evasion Rating: " + player.getEvasionRating() + "\n";
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

