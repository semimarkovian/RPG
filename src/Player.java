
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
		// Formula for life
		life = 10 + 5*vitality;
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
     */
    public int getLife() {
        return this.life;
    }

    /***
     * Setter for life
     */
    public void setLife(int life) {
        this.life = life;
    }
}