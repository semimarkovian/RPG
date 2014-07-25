import java.io.Serializable;

/**
 * Created by owner on 7/7/2014.
 */
public class Slime extends Monster implements Serializable {
    // Slime stats
    public static final String SLIME_MONSTER_TYPE = "Slime";
    public static final int SLIME_LIFE = 20;
    public static final int SLIME_ARMOR = 0;
    public static final int SLIME_MAGIC_RESIST = 0;
    public static final int SLIME_BASE_DAMAGE = 1;
    public static final int SLIME_ACCURACY_RATING = 100;
    public static final int SLIME_DEFENSE_RATING = 2;
    public static final String SLIME_DAMAGE_TYPE = "Physical";
    public static final int SLIME_EXP_BOUNTY = 1;
    public static final int SLIME_GOLD_BOUNTY = 1;
    public static final int SLIME_MONSTER_LEVEL = 1;

    public Slime() {
        super(SLIME_MONSTER_TYPE, SLIME_LIFE, SLIME_ARMOR, SLIME_MAGIC_RESIST, SLIME_BASE_DAMAGE,
               SLIME_ACCURACY_RATING, SLIME_DEFENSE_RATING, SLIME_DAMAGE_TYPE, SLIME_EXP_BOUNTY,
                SLIME_GOLD_BOUNTY, SLIME_MONSTER_LEVEL);
    }
}
