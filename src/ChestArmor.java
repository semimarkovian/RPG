/**
 * Provides armor
 */
public class ChestArmor extends Equipment {

    /**
     * Amount of armor provided
     */
    private int armor;

    /**
     * Constructor
     */
    public ChestArmor(int armor, String equipmentName) {
        super(equipmentName);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }
}
