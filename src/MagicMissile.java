import java.io.Serializable;

/**
 * The basic spell of all Sorcerers
 */
public class MagicMissile extends Spell implements Serializable {
    /**
     * Base mana cost
     */
    public static final int MAGICMISSILE_BASE_MANA_COST = 2;
    /**
     * Base min damage
     */
    public static final int MAGICMISSILE_BASE_MIN_DAMAGE = 3;
    /**
     * Base max damage
     */
    public static final int MAGICMISSILE_BASE_MAX_DAMAGE = 4;
    /**
     * Plus to min damage with level up
     */
    public static final int MAGICMISSILE_PLUS_MIN_DAMAGE = 1;
    /**
     * Plus to max damage with level up
     */
    public static final int MAGICMISSILE_PLUS_MAX_DAMAGE = 2;
    /**
     * Plus to mana cost with level up
     */
    public static final int MAGICMISSILE_PLUS_MANA_COST = 0;

    /**
     * Base mana 1, base damage 1-2
     */
    public MagicMissile() {
        super(MAGICMISSILE_BASE_MANA_COST, "Magic Missile", MAGICMISSILE_BASE_MIN_DAMAGE, MAGICMISSILE_BASE_MAX_DAMAGE);
    }

    /**
     * Damage increases by 1-1
     */
    public void levelUp() {
        this.minDamage += MAGICMISSILE_PLUS_MIN_DAMAGE;
        this.maxDamage += MAGICMISSILE_PLUS_MAX_DAMAGE;
        this.spellLevel++;
    }
}
