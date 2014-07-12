import java.io.Serializable;

/**
 * This class is for healing potions
 */
public class Potion extends Item implements Serializable {

    /**
     * Amount that the potion heals
     */
    private int healAmount;

	public Potion(int healAmount) {
        this.healAmount = healAmount;
	}
}
