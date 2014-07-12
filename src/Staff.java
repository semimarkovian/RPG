import java.io.Serializable;

/**
 * Used by Sorcerers. Increases intelligence
 */
public class Staff extends Weapon implements Serializable {
    /**
     * Plus to intelligence
     */
    protected int intelligence;

    /**
     * Constructor
     */
    public Staff(int minDamage, int maxDamage, int intelligence, String weaponName) {
        super(minDamage, maxDamage, weaponName);
        this.intelligence = intelligence;
    }
}
