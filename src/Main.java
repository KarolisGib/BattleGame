import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Hero hero = new Hero();
        hero.name = "Hero";
        hero.health = 100;
        hero.damage = (random.nextInt(2) + 1);
        hero.defence = (random.nextInt(51));

        Enemy enemy = new Enemy();
        enemy.name = "Enemy";
        enemy.health = 100;
        enemy.damage = (random.nextInt(2) + 1);
        enemy.defence = (random.nextInt(51));

        Sword rustySword = new Sword();
        rustySword.name = "Rusty sword";
        rustySword.damage = (random.nextInt(2) + 8); // 8-9

        Sword sword = new Sword();
        sword.name = "Sword";
        sword.damage = (random.nextInt(2) + 11); // 11-12

        Sword enhancedSword = new Sword();
        enhancedSword.name = "Enhanced sword";
        enhancedSword.damage = (random.nextInt(2) + 14); // 14-15

        Shield rustyShield = new Shield();
        rustyShield.name = "Rusty shield";
        rustyShield.defence = 40;

        Shield shield = new Shield();
        shield.name = "Shield";
        shield.defence = 45;

        Shield enhancedShield = new Shield();
        enhancedShield.name = "Enhanced shield";
        enhancedShield.defence = 50;

        ArrayList<Sword> heroAttackChoice = new ArrayList<>();
        heroAttackChoice.add(rustySword);
        heroAttackChoice.add(sword);
        heroAttackChoice.add(enhancedSword);

        ArrayList<Sword> enemyAttackChoice = new ArrayList<>();
        enemyAttackChoice.add(rustySword);
        enemyAttackChoice.add(sword);
        enemyAttackChoice.add(enhancedSword);

        ArrayList<Shield> heroDefenceChoice = new ArrayList<>();
        heroDefenceChoice.add(rustyShield);
        heroDefenceChoice.add(shield);
        heroDefenceChoice.add(enhancedShield);

        ArrayList<Shield> enemyDefenceChoice = new ArrayList<>();
        enemyDefenceChoice.add(rustyShield);
        enemyDefenceChoice.add(shield);
        enemyDefenceChoice.add(enhancedShield);

        Methods.fight(hero, enemy,
                heroAttackChoice, enemyAttackChoice,
                heroDefenceChoice, enemyDefenceChoice);
    }
}