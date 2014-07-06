package rpg;


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
	private int strength;
    /**
     * Dexterity affects damage, accuracy, and evasion
     */
	private int dexterity;
    /**
     * Intelligence affects spell damage, MP, and magic resist
     */
	private int intelligence;
    /**
     * Vitality affects life
     */
	private int vitality;
    /**
     * Life is based on vitality and other things
     */
	private int life;
    /**
     * Accuracy is based on dexterity and other things
     */
	private int attackRating;
    /**
     * Evasion rating is based on dexterity and other things
     */
	private int evasionRating;
    /**
     * Armor decreases physical damage
     */
	private int armor;
    /**
     * Magic resist decreases magic damage
     */
	private int magicResist;
    /**
     * Base damage
     */
	private int baseDamage;
    /**
     * Base crit chance
     */
    private double critChance;
    /**
     * base crit damage
     */
    private double critDamage;
    /**
     * Experience points
     */
	private int exp;
    /**
     * Character level
     */
	private int level;
    /**
     * Amount of gold the character has
     */
	private int gold;
    /**
     * The classes are Warrior, Rogue, and Sorcerer
     */
	private String characterClass;
    /**
     * Player's inventory
     */
	private Item[] inventory;
    /**
     * Player's equipped items
     */
	private Equipment[] equipped;
    /**
     * Player's equippable items
     */
	private Equipment[] equippable;

    /**
     * Constructor
     * @param characterClass Warrior, Rogue, or Sorcerer
     */
	public Player(String characterClass) {
		// Set exp and level to 0 and 1
		this.exp = 0;
		this.level = 1;
		
		// Starting gold
		this.gold = Constants.STARTING_GOLD;
		
		this.characterClass = characterClass;
		// Warrior base stats
		if(this.characterClass == "Warrior") {
			this.strength = Constants.WARRIOR_STR;
			this.dexterity = Constants.WARRIOR_DEX;
			this.intelligence = Constants.WARRIOR_INT;
			this.vitality = Constants.WARRIOR_VIT;
		}
		// Rogue base stats
		else if(this.characterClass == "Rogue") {
			this.strength = Constants.ROGUE_STR;
			this.dexterity = Constants.ROGUE_DEX;
			this.intelligence = Constants.ROGUE_INT;
			this.vitality = Constants.ROGUE_VIT;
		}
		// Sorcerer base stats
		else if(this.characterClass == "Sorcerer") {
			this.strength = Constants.SORCERER_STR;
			this.dexterity = Constants.SORCERER_DEX;
			this.intelligence = Constants.SORCERER_INT;
			this.vitality = Constants.SORCERER_VIT;
		}
		
		// Calculate stats
		calcStats();
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
	 * This method increases stats when you level up.
	 */
	public void levelUp() {

		if(characterClass == "Warrior") {
            this.strength += Constants.WARRIOR_STR_GAIN;
            this.dexterity += Constants.WARRIOR_DEX_GAIN;
            this.intelligence += Constants.WARRIOR_INT_GAIN;
            this.vitality += Constants.WARRIOR_VIT_GAIN;
        }
		else if (characterClass == "Rogue") {
            strength += Constants.ROGUE_STR_GAIN;
            dexterity += Constants.ROGUE_DEX_GAIN;
            intelligence += Constants.ROGUE_INT_GAIN;
            vitality += Constants.ROGUE_VIT_GAIN;
        }
        else {
			this.strength += Constants.SORCERER_STR_GAIN;
			this.dexterity += Constants.SORCERER_DEX_GAIN;
			this.intelligence += Constants.SORCERER_INT_GAIN;
			this.vitality += Constants.SORCERER_VIT_GAIN;
		}
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