
/***
 * This class stores the attributes, items, etc. of the player
 * @author owner
 */
public class Player {
    // Starting gold
    public static final int STARTING_GOLD = 100;

    // Exp for each level
    public static final int LEVEL1_EXP = 0;
    public static final int LEVEL2_EXP = 10;
    public static final int LEVEL3_EXP = 20;
    public static final int LEVEL4_EXP = 40;
    public static final int LEVEL5_EXP = 80;
    public static final int LEVEL6_EXP = 160;
    public static final int LEVEL7_EXP = 320;
    public static final int LEVEL8_EXP = 640;
    public static final int LEVEL9_EXP = 1280;
    public static final int LEVEL10_EXP = 2560;
    public static final int LEVEL11_EXP = 5120;
    public static final int LEVEL12_EXP = 10240;

    /**
     * Strength affects physical damage and armor
     */
	protected int strength;
    /**
     * Dexterity affects damage, accuracy, and evasion
     */
	protected int dexterity;
    /**
     * Intelligence affects spell damage, MP, and magic resist
     */
	protected int intelligence;
    /**
     * Vitality affects life
     */
	protected int vitality;
    /**
     * Life is based on vitality and other things
     */
	protected int life;
    /**
     * Player's maximum life
     */
    protected int maxLife;
    /**
     * Mana is based on intelligence and other things
     */
    protected int mana;
    /**
     * Player's maximum mana.
     */
    protected int maxMana;
    /**
     * Accuracy is based on dexterity and other things
     */
	protected int attackRating;
    /**
     * Evasion rating is based on dexterity and other things
     */
	protected int evasionRating;
    /**
     * Armor decreases physical damage
     */
	protected int armor;
    /**
     * Magic resist decreases magic damage
     */
	protected int magicResist;
    /**
     * Base damage
     */
	protected int baseDamage;
    /**
     * Base crit chance
     */
    protected double critChance;
    /**
     * base crit damage
     */
    protected double critDamage;
    /**
     * Experience points
     */
	protected int exp;
    /**
     * Character level
     */
	protected int level;
    /**
     * Amount of gold the character has
     */
	protected int gold;
    /**
     * The classes are Warrior, Rogue, and Sorcerer
     */
	protected String characterClass;
    /**
     * Player's inventory
     */
	protected Item[] inventory;
    /**
     * Player's equipped items
     */
	protected Equipment[] equipped;
    /**
     * Player's equippable items
     */
	protected Equipment[] equippable;

    /**
     * Constructor
     */
	public Player() {
		// Set exp and level to 0 and 1
		this.exp = 0;
		this.level = 1;
		
		// Starting gold
		this.gold = STARTING_GOLD;
		
		this.characterClass = characterClass;

	}
	
	/***
	 * This method calculates the derived stats (accuracy, evasion, etc.) from the base stats (str, agi, etc)
	 * 
	 */
	public void calcStats() {
		// Formula for max life
		maxLife = 10 + 5*vitality;
        // Formula for max mana
        maxMana = 20 + 10*intelligence;
		// Formula for attack rating
		attackRating = 100 + 10*dexterity;
		// Formula for evasion rating
		evasionRating = 100 + 5*dexterity;
		// Formula for armor
		armor = 1 + 2*strength;
		// Formula for magic resist
		magicResist = 1 + 2*intelligence;
		// Formula for base damage
		baseDamage = 5 + 2*strength + 1*dexterity;
	}


    /***
     * Getter for life
     * @return The player's current life
     */
    public int getLife() {
        return this.life;
    }

    /***
     * Setter for life
     * @param  life The player's new life
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * Getter for strength
     * @return The player's current strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Setter for strength
     * @param strength The player's new strength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Getter for dexterity
     * @return The player's current dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    /**
     * Getter for intelligence
     * @return The player's current intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    /**
     * Getter for vitality
     * @return The player's current vitality
     */
    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
    /**
     * Getter for mana
     * @return The player's current mana
     */
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    /**
     * Getter for attack rating
     * @return The player's current attack rating
     */
    public int getAttackRating() {
        return attackRating;
    }

    public void setAttackRating(int attackRating) {
        this.attackRating = attackRating;
    }
    /**
     * Getter for evasion rating
     * @return The player's current evasion rating
     */
    public int getEvasionRating() {
        return evasionRating;
    }

    public void setEvasionRating(int evasionRating) {
        this.evasionRating = evasionRating;
    }
    /**
     * Getter for armor
     * @return The player's current armor
     */
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    /**
     * Getter for magic resist
     * @return The player's current magic resist
     */
    public int getMagicResist() {
        return magicResist;
    }

    public void setMagicResist(int magicResist) {
        this.magicResist = magicResist;
    }
    /**
     * Getter for base damage
     * @return The player's current base damage
     */
    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    /**
     * Getter for crit chance
     * @return The player's current crit chance
    */
    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }
    /**
     * Getter for crit damage
     * @return The player's current crit damage
     */
    public double getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(double critDamage) {
        this.critDamage = critDamage;
    }
    /**
     * Getter for experience
     * @return The player's current experience
     */
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    /**
     * Getter for gold
     * @return The player's current gold
     */
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    /**
     * Getter for level
     * @return The player's current level
     */
    public int getLevel() {
        return level;
    }


}