/**
 * Created by owner on 7/7/2014.
 */
public class Slime extends Monster {
    // Slime stats
    public static final String SLIME_MONSTER_TYPE = "Slime";
    public static final int SLIME_LIFE = 2;
    public static final int SLIME_ARMOR = 0;
    public static final int SLIME_MAGIC_RESIST = 0;
    public static final int SLIME_BASE_DAMAGE = 1;
    public static final int SLIME_ACCURACY_RATING = 100;
    public static final int SLIME_DEFENSE_RATING = 2;
    public static final String SLIME_DAMAGE_TYPE = "Physical";

    public Slime() {
        super(SLIME_MONSTER_TYPE, SLIME_LIFE, SLIME_ARMOR, SLIME_MAGIC_RESIST, SLIME_BASE_DAMAGE,
               SLIME_ACCURACY_RATING, SLIME_DEFENSE_RATING, SLIME_DAMAGE_TYPE);
    }
}
