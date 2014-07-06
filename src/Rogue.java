/**
 * The Rogue class
 */
public class Rogue extends Player {

    // Rogue constants
    public static final int ROGUE_BASE_STR = 15;
    public static final int ROGUE_BASE_DEX = 20;
    public static final int ROGUE_BASE_INT = 10;
    public static final int ROGUE_BASE_VIT = 10;
    public static final double ROGUE_BASE_CRIT_CHANCE = 0.1;
    public static final double ROGUE_BASE_CRIT_DAMAGE = 1.5;

    // Rogue stat gains
    public static final int ROGUE_STR_GAIN = 2;
    public static final int ROGUE_DEX_GAIN = 4;
    public static final int ROGUE_INT_GAIN = 1;
    public static final int ROGUE_VIT_GAIN = 2;

    /**
     * Sets base stats
     */
    public Rogue() {
        this.strength = ROGUE_BASE_STR;
        this.dexterity = ROGUE_BASE_DEX;
        this.intelligence = ROGUE_BASE_INT;
        this.vitality = ROGUE_BASE_VIT;

        // Calculate stats
        calcStats();
    }

    /**
     * Increases stats when leveling up.
     */
    public void levelUp() {
        this.level++;
        strength += ROGUE_STR_GAIN;
        dexterity += ROGUE_DEX_GAIN;
        intelligence += ROGUE_INT_GAIN;
        vitality += ROGUE_VIT_GAIN;
    }

}
