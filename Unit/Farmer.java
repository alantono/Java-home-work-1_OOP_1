package Unit;
public class Farmer extends Characters {

    // кормит
    protected Integer feed;
  
    public Farmer(String name, int hp_real, int hp_max, int attack) {
        super(name, hp_real, hp_max, attack);
    }

    public Integer getFeed() {
        return feed;
    }
    @Override
    public Integer getHp_real() {
        return hp_real;
    }
}
