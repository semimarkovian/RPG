import javax.swing.*;

/***
 * @author owner
 * The main class
 */
public class MainGame {

	/***
	 * Starts the game
	 * @param args Command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Initialize JFrame stuff
		JFrame frame = new JFrame();
		// Introduce the game
		JOptionPane.showMessageDialog(frame, "Welcome to my game!");
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
		}
		
		quitGame();
	}
	
	/***
	 * Displays the main menu
	 */
	public static void mainMenu() {
		
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

