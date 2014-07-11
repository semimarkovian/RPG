/**
 * The fireball spell!
 */
public class Fireball extends Spell {
    /**
     * Base mana cost
     */
    public static final int FIREBALL_BASE_MANA_COST = 2;
    /**
     * Base min damage
     */
    public static final int FIREBALL_BASE_MIN_DAMAGE = 3;
    /**
    * Base max damage
     */
    public static final int FIREBALL_BASE_MAX_DAMAGE = 4;
    /**
     * Plus to min damage with level up
     */
    public static final int FIREBALL_PLUS_MIN_DAMAGE = 1;
    /**
     * Plus to max damage with level up
     */
    public static final int FIREBALL_PLUS_MAX_DAMAGE = 2;
    /**
     * Plus to mana cost with level up
     */
    public static final int FIREBALL_PLUS_MANA_COST = 1;

    /**
     * Constructor
     */
    public Fireball() {
        super(FIREBALL_BASE_MANA_COST, "Fireball", FIREBALL_BASE_MIN_DAMAGE, FIREBALL_BASE_MAX_DAMAGE);

    }

    /**
     * Level up the spell
     */
    public void levelUp() {
        this.manaCost += FIREBALL_PLUS_MANA_COST;
        this.minDamage += FIREBALL_PLUS_MIN_DAMAGE;
        this.maxDamage += FIREBALL_PLUS_MAX_DAMAGE;
        this.spellLevel++;
    }
}
