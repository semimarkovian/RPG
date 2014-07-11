/**
 * The lightning bolt spell
 */
public class LightningBolt extends Spell {

    /**
     * Base mana cost
     */
    public static final int LIGHTNINGBOLT_BASE_MANA_COST = 3;
    /**
     * Base min damage
     */
    public static final int LIGHTNINGBOLT_BASE_MIN_DAMAGE = 1;
    /**
     * Base max damage
     */
    public static final int LIGHTNINGBOLT_BASE_MAX_DAMAGE = 8;
    /**
     * Plus to min damage with level up
     */
    public static final int LIGHTNINGBOLT_PLUS_MIN_DAMAGE = 0;
    /**
     * Plus to max damage with level up
     */
    public static final int LIGHTNINGBOLT_PLUS_MAX_DAMAGE = 3;
    /**
     * Plus to mana cost with level up
     */
    public static final int LIGHTNINGBOLT_PLUS_MANA_COST = 2;

    /**
     * Constructor
     */
    public LightningBolt() {
        super(LIGHTNINGBOLT_BASE_MANA_COST, "Lightning Bolt", LIGHTNINGBOLT_BASE_MIN_DAMAGE,
                LIGHTNINGBOLT_BASE_MAX_DAMAGE);
    }

    /**
     * Level up the spell
     */
    public void levelUp() {
        this.manaCost += LIGHTNINGBOLT_PLUS_MANA_COST;
        this.minDamage += LIGHTNINGBOLT_PLUS_MIN_DAMAGE;
        this.maxDamage += LIGHTNINGBOLT_PLUS_MAX_DAMAGE;
        this.spellLevel++;
    }
}
