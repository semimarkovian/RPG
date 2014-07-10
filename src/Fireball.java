/**
 * The fireball spell!
 */
public class Fireball extends Spell {
    /**
     * Base mana 2, base damage 3-4
     */
    public Fireball() {
        super(2, "Fireball", 3, 4);

    }

    /**
     * Mana increases by 1 per spell level
     * Damage increases by 1-2 per spell level
     */
    public void levelUp() {
        this.manaCost++;
        this.minDamage += 1;
        this.maxDamage += 2;
    }
}
