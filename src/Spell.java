/**
 * Spells for the sorcerer class
 */
public class Spell {

    /**
     * Mana cost of the spell.
     */
    private int manaCost;

    /**
     * Name of the spell
     */
    private String spellName;

    /**
     * Constructor
     */
    public Spell(int manaCost, String spellName) {
        this.manaCost = manaCost;
        this.spellName = spellName;
    }
}
