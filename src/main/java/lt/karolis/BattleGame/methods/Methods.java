package lt.karolis.BattleGame.methods;

import lt.karolis.BattleGame.chars.heroes.Enemy;
import lt.karolis.BattleGame.chars.heroes.Hero;
import lt.karolis.BattleGame.shield.Shield;
import lt.karolis.BattleGame.weapon.Sword.Sword;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Methods {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    static int counter = 0;

    static Random random = new Random();

    static Enemy enemyChoice;

    static Sword heroWeapon;
    static Sword enemyWeapon;

    static double heroDefence;
    static double enemyDefence;

    static double heroHit;
    static double enemyHit;

    static double heroHealth;
    static double enemyHealth;


    static void choices(Hero hero, ArrayList<Enemy> enemies,
                        ArrayList<Sword> swords, ArrayList<Shield> shields) {

        //Pagal zaidejo lvl parenkamas priesas
        switch (hero.getLevel()) {
            case 3:
                choiceByLevel(hero, enemies, swords);
            case 2:
                choiceByLevel(hero, enemies, swords);
            case 1:
                choiceByLevel(hero, enemies, swords);
        }

        // Apskaiciuojamas zaidejo ir prieso defence lygis,
        heroDefence = ((shields.get(random.nextInt(shields.size())).getDefence()
                + hero.getDefence()) / 100) / 2;
        enemyDefence = ((shields.get(random.nextInt(shields.size())).getDefence()
                + enemyChoice.getDefence()) / 100) / 2;
    }

    private static void choiceByLevel(Hero hero, ArrayList<Enemy> enemies,
                                      ArrayList<Sword> swords) {
        enemyChoice = enemies.get(hero.getLevel() - 1);
        heroWeapon = swords.get(hero.getLevel() - 1);
        enemyWeapon = swords.get(hero.getLevel() - 1);
    }


    public static void fight(Hero hero, ArrayList<Enemy> enemies,
                             ArrayList<Sword> swords, ArrayList<Shield> shields, Scanner scanner) {

        choices(hero, enemies, swords, shields);
        enemyHealth = enemyChoice.getHealth();
        while (hero.getHealth() > 0 && enemyHealth > 0) {

            int heroWeaponDamage = heroWeapon.getDamage() + hero.getDamage();
            int enemyWeaponDamage = enemyWeapon.getDamage() + enemyChoice.getDamage();

            heroHit = (heroWeaponDamage - (heroWeaponDamage * enemyDefence));
            enemyHit = (enemyWeaponDamage - (enemyWeaponDamage * heroDefence));

            info();

            try {
                switch (scanner.nextInt()) {
                    case 1:
                        counter++;

                        heroHealth = hero.getHealth();
                        heroHealth -= enemyHit;
                        hero.setHealth(heroHealth);

                        enemyHealth -= heroHit;

                        System.out.println(hero.getName() + " hit " + enemyChoice.getName() + " with "
                                + df.format(heroHit) + " damage and left him with "
                                + df.format(enemyHealth) + " health");
                        System.out.println(enemyChoice.getName() + " hit " + hero.getName() + " with "
                                + df.format(enemyHit) + " damage and left him with "
                                + df.format(heroHealth) + " health");
                        break;
                    case 2:
                        counter++;
                        heroHealth = hero.getHealth();
                        heroHealth += 30;
                        hero.setHealth(heroHealth);

                        System.out.println(hero.getName() + " replenished health to " + df.format(heroHealth));

                        heroHealth = hero.getHealth();
                        heroHealth -= enemyHit;
                        hero.setHealth(heroHealth);

                        System.out.println(enemyChoice.getName() + " hit " + hero.getName() +
                                " with " + df.format(enemyHit) + " damage and left him with "
                                + df.format(heroHealth) + " health");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                System.out.println();
                scanner.nextLine();
            }
        }
        result(hero);
    }

    static void heroLevelCalculation(Hero hero) {
        int heroExperience = hero.getExperience();
        heroExperience += enemyChoice.getExperience();
        hero.setExperience(heroExperience);
        int levelUpExperience = (hero.getLevel() + (hero.getLevel() + 1)) * 30;

        if (hero.getExperience() >= levelUpExperience) {
            int heroLevel = hero.getLevel();
            heroLevel++;
            hero.setLevel(heroLevel);
            levelUpExperience = (hero.getLevel() + (hero.getLevel() + 1)) * 30;
            hero.setExperience(0);
        }
        System.out.println();
        System.out.println("Required exp to the next level: " + levelUpExperience);
        System.out.println("Current " + hero.getName() + " exp is: " + hero.getExperience());
        System.out.println("Current " + hero.getName() + " level is: " + hero.getLevel());
        System.out.println();
    }

    static void result(Hero hero) {
        if (hero.getHealth() == enemyHealth) {
            System.out.println("Battle took " + counter + " rounds and ended up in tie");
        } else if (hero.getHealth() > enemyHealth) {
            System.out.println("Battle took " + counter + " rounds and " + hero.getName() + " won");
            heroLevelCalculation(hero);
            counter = 0;
        } else {
            System.out.println("Battle took " + counter + " rounds and " + enemyChoice.getName() + " won");
        }
    }

    public static void info() {
        System.out.println("1. Hit");
        System.out.println("2. Get health");
    }
}