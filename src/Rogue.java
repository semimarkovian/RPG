import java.io.Serializable;

/**
 * The Rogue class
 */
public class Rogue extends Player implements Serializable {

    // Rogue constants
    public static final int ROGUE_BASE_STR = 2;
    public static final int ROGUE_BASE_DEX = 5;
    public static final int ROGUE_BASE_INT = 1;
    public static final int ROGUE_BASE_VIT = 4;
    public static final double ROGUE_BASE_CRIT_CHANCE = 0.1;
    public static final double ROGUE_BASE_CRIT_DAMAGE = 1.5;

    // Rogue stat gains
    public static final int ROGUE_STR_GAIN = 2;
    public static final int ROGUE_DEX_GAIN = 4;
    public static final int ROGUE_INT_GAIN = 1;
    public static final int ROGUE_VIT_GAIN = 2;

    // Rogue starting weapon
    public static final int ROGUE_STARTING_WEAPON_MIN_DAMAGE = 1;
    public static final int ROGUE_STARTING_WEAPON_MAX_DAMAGE = 2;
    public static final int ROGUE_STARTING_WEAPON_DEXTERITY = 3;
    public static final double ROGUE_STARTING_WEAPON_CRIT_CHANCE = 0.05;
    public static final String ROGUE_STARING_WEAPON_NAME = "Wooden Bow";

    /**
     * Sets base stats
     */
    public Rogue(String playerName) {
        // Call super constructor
        super();

        // Initialize stats
        this.name = playerName;
        this.strength = ROGUE_BASE_STR;
        this.dexterity = ROGUE_BASE_DEX;
        this.intelligence = ROGUE_BASE_INT;
        this.vitality = ROGUE_BASE_VIT;
        this.critChance = ROGUE_BASE_CRIT_CHANCE;
        this.critDamage = ROGUE_BASE_CRIT_DAMAGE;
        this.characterClass = "Rogue";

        // Calculate stats
        calcStats();

        // Set life and mana to full
        life = maxLife;
        mana = maxMana;

        Bow startingBow = new Bow(ROGUE_STARTING_WEAPON_MIN_DAMAGE, ROGUE_STARTING_WEAPON_MAX_DAMAGE,
                ROGUE_STARTING_WEAPON_CRIT_CHANCE, ROGUE_STARTING_WEAPON_DEXTERITY, ROGUE_STARING_WEAPON_NAME);
        this.equipment.add(startingBow);
        this.equippedWeapon = startingBow;

        // Start with a few health potions
        this.inventory.add(new Potion(5, 0));
        this.inventory.add(new Potion(5, 0));
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
