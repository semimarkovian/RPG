/**
 * The Warrior class
 */
public class Warrior extends Player {

    // Warrior base stats
    public static final int WARRIOR_BASE_STR = 20;
    public static final int WARRIOR_BASE_DEX = 15;
    public static final int WARRIOR_BASE_INT = 5;
    public static final int WARRIOR_BASE_VIT = 20;
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
        this.name = playerName;
        this.strength = WARRIOR_BASE_STR;
        this.dexterity = WARRIOR_BASE_DEX;
        this.intelligence = WARRIOR_BASE_INT;
        this.vitality = WARRIOR_BASE_VIT;
        this.critChance = WARRIOR_BASE_CRIT_CHANCE;
        this.critDamage = WARRIOR_BASE_CRIT_DAMAGE;

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
