import java.util.ArrayList;

public class Weapon {

    private String name;

    private ArrayList<Integer> damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getDamage() {
        return damage;
    }

    public void setDamage(ArrayList<Integer> damage) {
        this.damage = damage;
    }

    public Weapon(String name, ArrayList<Integer> damage) {
        this.name = name;
        this.damage = damage;
    }
}