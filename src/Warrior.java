/**
 * The Warrior class
 */
public class Warrior extends Player {

    // Warrior base stats
    public static final int WARRIOR_BASE_STR = 20;
    public static final int WARRIOR_BASE_DEX = 15;
    public static final int WARRIOR_BASE_INT = 5;
    public static final int WARRIOR_BASE_VIT = 20;
    public static final double WARRIOR_CRIT_CHANCE = 0.05;
    public static final double WARRIOR_CRIT_DAMAGE = 2.0;

    // Warrior stat gains
    public static final int WARRIOR_STR_GAIN = 4;
    public static final int WARRIOR_DEX_GAIN = 2;
    public static final int WARRIOR_INT_GAIN = 1;
    public static final int WARRIOR_VIT_GAIN = 3;

    /**
     * Sets base stats
     */
    public Warrior() {
        // Sets base stats
        this.strength = WARRIOR_BASE_STR;
        this.dexterity = WARRIOR_BASE_DEX;
        this.intelligence = WARRIOR_BASE_INT;
        this.vitality = WARRIOR_BASE_VIT;

        // Calculate stats
        calcStats();
    }

    /**
     * Increases stats when leveling up.
     */
    public void levelUp() {
        this.strength += WARRIOR_STR_GAIN;
        this.dexterity += WARRIOR_DEX_GAIN;
        this.intelligence += WARRIOR_INT_GAIN;
        this.vitality += WARRIOR_VIT_GAIN;
    }

}
