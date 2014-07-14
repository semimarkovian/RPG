import java.io.Serializable;

/***
 * This class stores information about enemies.
 *
 */
public class Monster implements Serializable {

    /**
     *  The type of monster
     */
	private String monsterType;
    /**
     *  The monster's life
     */
    protected int life;
    /**
     *  The monster's armor
     */
    protected int armor;
    /**
     *  The monster's magic resist
     */
    protected int magicResist;
    /**
     *  The monster's base damage
     */
    protected int baseDamage;
    /**
     * The monster's accuracy rating
     */
    protected int accuracyRating;
    /**
     * The monster's defense rating
     */
    protected int defenseRating;
    /**
     * The monster's damage type
     */
	protected String damageType;
    /**
     * The monster's exp bounty
     */
    protected int expBounty;
    /**
     * The monster's gold bounty
     */
    protected int goldBounty;

    /**
     * Default constructor
     */
    public Monster() {

    }

    /**
     * @param monsterType The type of monster (name)
     * @param life The monster's life
     * @param armor The monster's armor
     * @param magicResist The monster's magic resist
     * @param baseDamage The monster's base damage
     * @param accuracyRating The monster's accuracy rating
     * @param defenseRating The monster's defense rating
     * @param damageType The monster's damage type (physical or magical)
     */
	public Monster(String monsterType, int life, int armor, int magicResist, int baseDamage, int accuracyRating,
                   int defenseRating, String damageType, int expBounty, int goldBounty) {
		this.monsterType = monsterType;
        this.life = life;
        this.armor = armor;
        this.magicResist = magicResist;
        this.baseDamage = baseDamage;
        this.accuracyRating = accuracyRating;
        this.defenseRating = defenseRating;
        this.damageType = damageType;
        this.expBounty = expBounty;
        this.goldBounty = goldBounty;
	}

    /**
     * The action the monster takes in battle
     */
    public void attacks(Player player) {

    }

    public String getMonsterType() {
        return monsterType;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicResist() {
        return magicResist;
    }

    public void setMagicResist(int magicResist) {
        this.magicResist = magicResist;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAccuracyRating() {
        return accuracyRating;
    }

    public void setAccuracyRating(int accuracyRating) {
        this.accuracyRating = accuracyRating;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public void setDefenseRating(int defenseRating) {
        this.defenseRating = defenseRating;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }


}
