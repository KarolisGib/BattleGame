public class Character {

    private String name;

    double health;

    private int damage;

    private int defence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Character(String name, double health, int damage, int defence) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defence = defence;
    }
}