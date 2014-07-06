/**
 * Used by Rogues. Increases accuracy and crit chance.
 */
public class Bow extends Weapon {

    /**
     * Crit chance increase
     */
    private double critChance;

    /**
     * Constructor
     */
    public Bow(int minDamage, int maxDamage, double critChance) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.critChance = critChance;

    }
}
