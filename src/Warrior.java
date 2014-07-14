import java.io.Serializable;

/**
 * The Warrior class
 */
public class Warrior extends Player implements Serializable {

    // Warrior base stats
    public static final int WARRIOR_BASE_STR = 5;
    public static final int WARRIOR_BASE_DEX = 2;
    public static final int WARRIOR_BASE_INT = 1;
    public static final int WARRIOR_BASE_VIT = 10;
    public static final double WARRIOR_BASE_CRIT_CHANCE = 0.05;
    public static final double WARRIOR_BASE_CRIT_DAMAGE = 2.0;

    // Warrior stat gains
    public static final int WARRIOR_STR_GAIN = 4;
    public static final int WARRIOR_DEX_GAIN = 2;
    public static final int WARRIOR_INT_GAIN = 1;
    public static final int WARRIOR_VIT_GAIN = 3;

    // Warrior starting weapon
    public static final int WARRIOR_STARTING_WEAPON_MIN_DAMAGE = 1;
    public static final int WARRIOR_STARTING_WEAPON_MAX_DAMAGE = 3;
    public static final double WARRIOR_STARTING_WEAPON_CRIT_DAMAGE = 0;
    public static final int WARRIOR_STARTING_WEAPON_STRENGTH = 0;
    public static final String WARRIOR_STARING_WEAPON_NAME = "Wooden Sword";

    /**
     * Sets base stats
     */
    public Warrior(String playerName) {
        // Call super constructor
        super();

        // Initialize stats
        this.name = playerName;
        this.strength = WARRIOR_BASE_STR;
        this.dexterity = WARRIOR_BASE_DEX;
        this.intelligence = WARRIOR_BASE_INT;
        this.vitality = WARRIOR_BASE_VIT;
        this.critChance = WARRIOR_BASE_CRIT_CHANCE;
        this.critDamage = WARRIOR_BASE_CRIT_DAMAGE;
        this.characterClass = "Warrior";

        // Calculate stats
        calcStats();

        // Set life and mana to full
        life = maxLife;
        mana = maxMana;

        // Starting weapon
        Sword startingSword = new Sword(WARRIOR_STARTING_WEAPON_MIN_DAMAGE, WARRIOR_STARTING_WEAPON_MAX_DAMAGE,
                WARRIOR_STARTING_WEAPON_CRIT_DAMAGE, WARRIOR_STARTING_WEAPON_STRENGTH, WARRIOR_STARING_WEAPON_NAME);
        this.equipment.add(startingSword);
        this.equippedWeapon = startingSword;

        // Start with a few health potions
        this.inventory.add(new Potion(5, 0));
        this.inventory.add(new Potion(5, 0));

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
