import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();

        Hero hero = new Hero();
        hero.name = "Hero";
        hero.health = 100;
        hero.damage = 1;
        hero.defence = (rnd.nextDouble(51) / 2) / 100;

        Enemy enemy = new Enemy();
        enemy.name = "Enemy";
        enemy.health = 100;
        enemy.damage = 1;
        enemy.defence = (rnd.nextDouble(51) / 2) / 100;

        Sword rustySword = new Sword();
        rustySword.name = "Sword";
        rustySword.damage = 5;

        Sword sword = new Sword();
        sword.name = "Sword";
        sword.damage = 8;

        Sword enhancedSword = new Sword();
        enhancedSword.name = "Sword";
        enhancedSword.damage = 15;

        ArrayList<Integer> heroChoice = new ArrayList<>();
        heroChoice.add(hero.damage);
        heroChoice.add(rustySword.damage);
        heroChoice.add(sword.damage);
        heroChoice.add(enhancedSword.damage);

        ArrayList<Integer> enemyChoice = new ArrayList<>();
        enemyChoice.add(enemy.damage);
        enemyChoice.add(rustySword.damage);
        enemyChoice.add(sword.damage);
        enemyChoice.add(enhancedSword.damage);

        Methods.fight(hero, enemy,  heroChoice, enemyChoice);
    }
}