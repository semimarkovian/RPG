import java.io.Serializable;

/***
 * Consumable items
 *
 */
public class Item implements Serializable {
    /**
     * Item type
     */
    protected String itemType;

    /**
     * Constructor
     */
	public Item(String itemType) {
		this.itemType = itemType;
	}
}
