package Unit;
public class Wizard extends Characters {

    // магия, лечит, наносит ущерб 

    Integer mana_real;
    Integer mana_max;
    Integer treat;
    Integer damage;

    public Wizard(String name, int hp_real, int hp_max, int attack) {
        super(name, hp_real, hp_max, attack);
    }

    public Integer getMana_real() {
        return mana_real;
    }
    public Integer getTreat() {
        return treat;
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