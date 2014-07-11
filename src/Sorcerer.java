import java.util.ArrayList;

/**
 * The sorcerer class
 */
public class Sorcerer extends Player {

    // Sorcerer constants
    public static final int SORCERER_BASE_STR = 10;
    public static final int SORCERER_BASE_DEX = 10;
    public static final int SORCERER_BASE_INT = 25;
    public static final int SORCERER_BASE_VIT = 10;
    public static final double SORCERER_BASE_CRIT_CHANCE = 0;
    public static final double SORCERER_BASE_CRIT_DAMAGE = 0;
    public static final double SORCERER_BASE_DOUBLE_CHANCE = 0.01;

    // Sorcerer stat gains
    public static final int SORCERER_STR_GAIN = 1;
    public static final int SORCERER_DEX_GAIN = 1;
    public static final int SORCERER_INT_GAIN = 4;
    public static final int SORCERER_VIT_GAIN = 2;

    // Sorcerer starting weapon
    public static final int SORCERER_STARTING_WEAPON_MIN_DAMAGE = 1;
    public static final int SORCERER_STARTING_WEAPON_MAX_DAMAGE = 2;
    public static final int SORCERER_STARTING_WEAPON_INTELLIGENCE = 3;
    public static final String SORCERER_STARING_WEAPON_NAME = "Wooden Staff";

    /**
     * Sorcerer has chance to double-cast
     */
    private double doubleChance;

    /**
     * Sorcerer's spells
     */
    protected ArrayList<Spell> spells;

    /**
     * Sets base stats
     */
    public Sorcerer(String playerName) {
        // Base stats
        this.name = playerName;
        this.strength = SORCERER_BASE_STR;
        this.dexterity = SORCERER_BASE_DEX;
        this.intelligence = SORCERER_BASE_INT;
        this.vitality = SORCERER_BASE_VIT;
        this.critChance = SORCERER_BASE_CRIT_CHANCE;
        this.critDamage = SORCERER_BASE_CRIT_DAMAGE;
        this.doubleChance = SORCERER_BASE_DOUBLE_CHANCE;

        // Calculate stats
        calcStats();

        // Set life and mana to full
        life = maxLife;
        mana = maxMana;

        // Set up spell list - start with Magic Missile
        this.spells = new ArrayList<Spell>();
        this.spells.add(new MagicMissile());

        // Starting weapon
        Staff startingStaff = new Staff(SORCERER_STARTING_WEAPON_MIN_DAMAGE, SORCERER_STARTING_WEAPON_MAX_DAMAGE,
                SORCERER_BASE_INT, SORCERER_STARING_WEAPON_NAME);
    }

    /**
     * Increases stats when leveling up.
     */
    public void levelUp() {
        this.level++;
        this.strength += SORCERER_STR_GAIN;
        this.dexterity +=SORCERER_DEX_GAIN;
        this.intelligence += SORCERER_INT_GAIN;
        this.vitality += SORCERER_VIT_GAIN;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }
}
