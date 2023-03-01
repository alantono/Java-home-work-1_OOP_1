package Unit;
import java.lang.reflect.Constructor;

import javax.management.ConstructorParameters;

public class Characters {

    protected String name;
    protected Integer hp_real;
    protected Integer hp_max = 100;
    protected Integer attack;


    public Characters(String name, int hp_real, int hp_max, int attack) {
        this.name = name;
        this.hp_real = hp_real;
        this.hp_max = hp_max;
        this.attack = attack;

    }
    public Integer getHp_real() {
        return hp_real;
    }

    public Integer getAttack() {
        return attack;
    }

 }
