import java.io.Serializable;

/**
 * This class is for healing potions
 */
public class Potion extends Item implements Serializable {

    /**
     * Amount that the potion restores
     */
    private int healAmount;

    /**
     * Amount of mana that the potion restores
     */
    private int manaAmount;


    /**
     * @param healAmount Amount of life that the potion restores
     * @param manaAmount Amount of mana that the potion restores
     */
	public Potion(int healAmount, int manaAmount) {
        super("Potion");
        this.healAmount = healAmount;
        this.manaAmount = manaAmount;
	}

    public int getHealAmount() {
        return healAmount;
    }

    public int getManaAmount() {
        return manaAmount;
    }
}
