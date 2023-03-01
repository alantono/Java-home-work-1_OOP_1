package Unit;
public class Sniper extends Characters {

    // Броня, Ущерб (Повреждение), Расстояние 
    protected Integer defense;
    protected Integer damage;
    protected Integer distance;


    public Sniper(String name, int hp_real, int hp_max, int attack) {
        super(name, hp_real, hp_max, attack);
    }

    public Integer getDefense() {
        return defense;
    }
    public Integer getDamage() {
        return damage;
    }
    public Integer getDistance() {
        return distance;
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

