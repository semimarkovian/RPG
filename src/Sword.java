package rpg;

/**
 * Used by warriors. Increases damage and crit damage.
 */
public class Sword extends Weapon {

    /**
     * Increase in crit damage
     */
    private double critDamage;

    /**
     * Constructor
     */
    public Sword(int minDamage, int maxDamage, double critDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.critDamage = critDamage;
    }
}
