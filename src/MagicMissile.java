/**
 * The basic spell of all Sorcerers
 */
public class MagicMissile extends Spell {
    /**
     * Base mana 1, base damage 1-2
     */
    public MagicMissile() {
        super(1, "Magic Missile", 1, 2);
    }

    /**
     * Damage increases by 1-1
     */
    public void levelUp() {
        this.minDamage++;
        this.maxDamage++;
        this.spellLevel++;
    }
}
