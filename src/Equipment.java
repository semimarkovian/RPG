import java.io.Serializable;

/***
 * Includes Weapon, ChestArmor, Helmet, and Amulet
 * 
 */
public class Equipment implements Serializable {
    /**
     * Name of equipment
     */
    protected String equipmentName;

    /**
     * Default constructor
     */
    public Equipment() {

    }

    /**
     * @param equipmentName Name of equipment
     */
	public Equipment(String equipmentName) {
		this.equipmentName = equipmentName;
	}

    public String getEquipmentName() {
        return equipmentName;
    }
}
