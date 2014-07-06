package rpg;

public class Potion extends Item {

    /**
     * Amount that the potion heals
     */
    private int healAmount;

	public Potion(int healAmount) {
        this.healAmount = healAmount;
	}
}
