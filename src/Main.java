import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();

        Hero hero = new Hero();
        hero.name = "Hero";
        hero.health = 100;
        hero.damage = rnd.nextInt(6) + 5;

        Enemy enemy = new Enemy();
        enemy.name = "Enemy";
        enemy.health = 100;
        enemy.damage = rnd.nextInt(6) + 5;

        Methods.fight(hero, enemy);
    }
}