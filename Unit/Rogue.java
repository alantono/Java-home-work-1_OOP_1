package Unit;
public class Rogue extends Characters {

    // Броня, Ущерб (Повреждение)
    protected Integer defense;
    protected Integer damage;

    public Rogue(String name, int hp_real, int hp_max, int attack) {
        super(name, hp_real, hp_max, attack);
    }
    public Integer getDefense() {
        return defense;
    }
    public Integer getDamage() {
        return damage;
    }

    @Override
    public Integer getAttack() {
        return attack;
    }
    @Override
    public Integer getHp_real() {
        return hp_real;
    }

    
}