package lt.karolis.BattleGame;

import lt.karolis.BattleGame.Char.Heroes.Enemy;
import lt.karolis.BattleGame.Char.Heroes.Hero;
import lt.karolis.BattleGame.Shield.Shield;
import lt.karolis.BattleGame.Weapon.Sword.Sword;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Methods {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    static int counter = 0;

    static Random random = new Random();

    static Enemy enemyChoice;

    static double heroHealth;
    static double enemyHealth;

    static Sword heroWeapon;
    static Sword enemyWeapon;

    static double heroDefence;
    static double enemyDefence;


    static void choices(Hero hero, ArrayList<Enemy> enemyList,
                        ArrayList<Sword> attackChoice, ArrayList<Shield> defenceChoice) {

        switch (hero.getLevel()) {
            case 3:
                enemyChoice = enemyList.get(hero.getLevel() - 1);
                heroWeapon = attackChoice.get(hero.getLevel() - 1);
                enemyWeapon = attackChoice.get(hero.getLevel() - 1);
            case 2:
                enemyChoice = enemyList.get(hero.getLevel() - 1);
                heroWeapon = attackChoice.get(hero.getLevel() - 1);
                enemyWeapon = attackChoice.get(hero.getLevel() - 1);
            case 1:
                enemyChoice = enemyList.get(hero.getLevel() - 1);
                heroWeapon = attackChoice.get(hero.getLevel() - 1);
                enemyWeapon = attackChoice.get(hero.getLevel() - 1);
        }

        heroDefence = ((defenceChoice.get(random.nextInt(defenceChoice.size())).getDefence()
                + hero.getDefence()) / 100) / 2;
        enemyDefence = ((defenceChoice.get(random.nextInt(defenceChoice.size())).getDefence()
                + enemyChoice.getDefence()) / 100) / 2;
    }

    static void fight(Hero hero, ArrayList<Enemy> enemyList,
                      ArrayList<Sword> attackChoice, ArrayList<Shield> defenceChoice) {
        choices(hero, enemyList, attackChoice, defenceChoice);
        while (hero.getHealth() > 0 && enemyChoice.getHealth() > 0) {
            counter++;

            int heroWeaponDamage = heroWeapon.getDamage().get(random.nextInt(3)) +
                    hero.getDamage();
            int enemyWeaponDamage = enemyWeapon.getDamage().get(random.nextInt(3)) +
                    enemyChoice.getDamage();

            double heroHit = (heroWeaponDamage - (heroWeaponDamage * enemyDefence));
            double enemyHit = (enemyWeaponDamage - (enemyWeaponDamage * heroDefence));

            heroHealth = (hero.health -= enemyHit);
            enemyHealth = (enemyChoice.health -= heroHit);

            System.out.println(hero.getName() + " hit " + enemyChoice.getName() + " with " + df.format(heroHit) +
                    " damage and left him with " + df.format(enemyHealth) + " health");
            System.out.println(enemyChoice.getName() + " hit " + hero.getName() + " with " + df.format(enemyHit) +
                    " damage and left him with " + df.format(heroHealth) + " health");
            System.out.println();
        }
        result(hero);
    }

    static void heroLevelCalculation(Hero hero) {
        int currentHeroExp = ;
        int base = 30;
        int nextLevel = hero.getLevel() + 1;
        int levelUpExp = (hero.getLevel() + nextLevel) * base;

        if (currentHeroExp >= levelUpExp) {
            hero.setLevel(+1);
            currentHeroExp = 0;
        }
        System.out.println();
        System.out.println("Required exp to the next level: " + levelUpExp);
        System.out.println("Current " + hero.getName() + " exp is: " + currentHeroExp);
        System.out.println("Current " + hero.getName() + " level is: " + hero.getLevel());
        System.out.println();
    }

    static void result(Hero hero) {
        if (heroHealth == enemyChoice.getHealth()) {
            System.out.println("Battle took " + counter + " rounds and ended up in tie");
        } else if (heroHealth > enemyChoice.getHealth()) {
            System.out.println("Battle took " + counter + " rounds and " + hero.getName() + " won");
            heroLevelCalculation(hero);
            hero.setHealth(100);
            enemyChoice.setHealth(85);
            counter = 0;
        } else {
            System.out.println("Battle took " + counter + " rounds and " + enemyChoice.getName() + " won");
        }
    }
}