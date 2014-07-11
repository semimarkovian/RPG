/**
 * Provides magic resist and stuff.
 */
public class Amulet extends Equipment {

    /**
     * Plus to magic resist
     */
    protected int magicResist;

    /**
     * Constructor
     */
    public Amulet(int magicResist, String equipmentName) {
        super(equipmentName);
        this.magicResist = magicResist;
    }

    public int getMagicResist() {
        return magicResist;
    }
}
