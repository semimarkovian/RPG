/**
 * Spells for the sorcerer class
 */
public class Spell {

    /**
     * Mana cost of the spell.
     */
    protected int manaCost;

    /**
     * Name of the spell
     */
    private String spellName;

    /**
     * Minimum damage of spell
     */
    protected int minDamage;

    /**
     * Maximum damage of spell
     */
    protected int maxDamage;

    /**
     * Level of spell
     */
    protected int spellLevel;

    /**
     * Default constructor
     */
    public Spell() {

    }

    /**
     * Constructor
     */
    public Spell(int manaCost, String spellName, int minDamage, int maxDamage) {
        this.manaCost = manaCost;
        this.spellName = spellName;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.spellLevel = 1;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getSpellLevel() {
        return spellLevel;
    }
}
