/**
 * Used by warriors. Increases damage and crit damage.
 */
public class Sword extends Weapon {

    /**
     * Increase in crit damage
     */
    protected double critDamage;

    /**
     * Increase in strength
     */
    protected double strength;


    /**
     * @param minDamage Min damage of sword
     * @param maxDamage Max damage of sword
     * @param critDamage Increase in crit damage
     * @param strength Increase in strength
     * @param weaponName Name of weapon
     */
    public Sword(int minDamage, int maxDamage, double critDamage, int strength, String weaponName) {
        super(minDamage, maxDamage, weaponName);
        this.critDamage = critDamage;
        this.strength = strength;
    }
}
