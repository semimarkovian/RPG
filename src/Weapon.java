/****
 * Weapons include swords, staves, and bows
 */
public class Weapon extends Equipment {

    /**
     * Minimum damage of the weapon
     */
    protected int minDamage;

    /**
     * Maximum damage of the weapon
     */
    protected int maxDamage;

    /**
     * Name of weapon
     */
    protected String weaponName;

    /**
     * Default constructor
     */
    public Weapon() {

    }

    /**
     * @param minDamage Minimum damage of the weapon
     * @param maxDamage Maximum damage of the weapon
     */
    public Weapon(int minDamage, int maxDamage, String weaponName) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.weaponName = weaponName;
    }
}
