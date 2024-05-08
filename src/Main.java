import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();

        Hero hero = new Hero();
        hero.name = "Hero";
        hero.health = 100;
        hero.damage = (rnd.nextInt(2) + 1);
        hero.defence = (rnd.nextInt(51));

        Enemy enemy = new Enemy();
        enemy.name = "Enemy";
        enemy.health = 100;
        enemy.damage = (rnd.nextInt(2) + 1);
        enemy.defence = (rnd.nextInt(51));

        Sword rustySword = new Sword();
        rustySword.name = "Rusty sword";
        rustySword.damage = (rnd.nextInt(2) + 8); // 8-9

        Sword sword = new Sword();
        sword.name = "Sword";
        sword.damage = (rnd.nextInt(2) + 11); // 11-12

        Sword enhancedSword = new Sword();
        enhancedSword.name = "Enhanced sword";
        enhancedSword.damage = (rnd.nextInt(2) + 14); // 14-15

        Shield rustyShield = new Shield();
        rustyShield.name = "Rusty shield";
        rustyShield.defence = 40;

        Shield shield = new Shield();
        shield.name = "Shield";
        shield.defence = 45;

        Shield enhancedShield = new Shield();
        enhancedShield.name = "Enhanced shield";
        enhancedShield.defence = 50;

        ArrayList<Integer> heroAttackChoice = new ArrayList<>();
        heroAttackChoice.add(rustySword.damage + hero.damage);
        heroAttackChoice.add(sword.damage + hero.damage);
        heroAttackChoice.add(enhancedSword.damage + hero.damage);

        ArrayList<Integer> enemyAttackChoice = new ArrayList<>();
        enemyAttackChoice.add(rustySword.damage + enemy.damage);
        enemyAttackChoice.add(sword.damage + enemy.damage);
        enemyAttackChoice.add(enhancedSword.damage + enemy.damage);

        ArrayList<Double> heroDefenceChoice = new ArrayList<>();
        heroDefenceChoice.add(((rustyShield.defence + hero.defence) / 2) / 100);
        heroDefenceChoice.add(((shield.defence + hero.defence) / 2) / 100);
        heroDefenceChoice.add(((enhancedShield.defence + hero.defence) / 2) / 100);

        ArrayList<Double> enemyDefenceChoice = new ArrayList<>();
        enemyDefenceChoice.add(((rustyShield.defence + enemy.defence) / 2) / 100);
        enemyDefenceChoice.add(((shield.defence + enemy.defence) / 2) / 100);
        enemyDefenceChoice.add(((enhancedShield.defence + enemy.defence) / 2) / 100);

        Methods.fight(hero, enemy, heroAttackChoice, enemyAttackChoice,
                heroDefenceChoice, enemyDefenceChoice);
    }
}