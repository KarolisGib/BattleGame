import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();

        Hero hero = new Hero();
        hero.name = "Hero";
        hero.health = 100;
        hero.damage = rnd.nextInt(5) + 3;
        hero.defence = (rnd.nextDouble(51) / 2) / 100;

        Enemy enemy = new Enemy();
        enemy.name = "Enemy";
        enemy.health = 100;
        enemy.damage = rnd.nextInt(5) + 3;
        enemy.defence = (rnd.nextDouble(51) / 2) / 100;

        Methods.fight(hero, enemy);
    }
}