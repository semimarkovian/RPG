import java.io.Serializable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Used by warriors. Increases damage and crit damage.
 */
public class Sword extends Weapon implements Serializable {

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

    /**
     * Loads sword from csv file
     * @param scanner The Scanner object
     */
    public Sword(Scanner scanner) {
        scanner.useDelimiter(",");
        while(scanner.hasNext()) {
            System.out.println(scanner.next()+"|");
        }
    }
}
