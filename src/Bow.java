import java.io.Serializable;

/**
 * Used by Rogues. Increases accuracy and crit chance.
 */
public class Bow extends Weapon implements Serializable {

    /**
     * Crit chance increase
     */
    protected double critChance;

    /**
     * Increase in dexterity
     */
    protected double dexterity;

    /**
     * @param minDamage Min damage of weapon
     * @param maxDamage Max damage of weapon
     * @param critChance Crit chance increase
     * @param dexterity Increase in dexterity
     * @param weaponName Name of weapon
     */
    public Bow(int minDamage, int maxDamage, double critChance, int dexterity, String weaponName) {
        super(minDamage, maxDamage, weaponName);
        this.critChance = critChance;
        this.dexterity = dexterity;
    }
}
