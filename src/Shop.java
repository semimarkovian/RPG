import java.io.Serializable;
import java.util.ArrayList;

/***
 * The shop where you can buy items
 *
 */
public class Shop implements Serializable {

    /**
     * The items the shop has for sale
     */
    ArrayList<Item> shopItems;

    /**
     * The equipement the shop has for sale
     */
    ArrayList<Equipment> equipmentItems;

    /**
     * Constructor
     */
	public Shop() {
		
	}
}
