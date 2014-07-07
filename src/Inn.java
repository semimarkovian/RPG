import javax.swing.*;

/**
 * The inn is where the player heals
 */
public class Inn {

    /**
     * Base rate
     */
    private static final int INN_BASE_RATE = 10;

    /**
     * Amount of gold to be healed
     */
    private int rate;

    /**
     * Constructor
     */
    public Inn() {
        this.rate = INN_BASE_RATE;
    }

    /**
     * Called when player stays at inn
     */
    public void stayAt(Player player) {
        // Calculate the rate
        rate = INN_BASE_RATE * player.getLevel();

        // If not enough gold, display error message
        if(player.getGold() < rate) {
            JOptionPane.showMessageDialog(null, "Not enough gold!");
        }

        // If enough gold, subtract gold and heal player
        else {
            player.setGold(player.getGold() - rate);
            player.setLife(player.getMaxLife());
        }
    }

    /**
     * Getter for rate
     * @return The rate of the inn
     */
    public int getRate() {
        return rate;
    }

    /**
     * Setter for rate
     * @param rate The new rate of the inn
     */
    public void setRate(int rate) {
        this.rate = rate;
    }
}
