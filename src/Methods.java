import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Methods {

    private static final DecimalFormat df = new DecimalFormat("0.0");
    static int counter = 0;
    static Random random = new Random();
    static double heroHit;
    static double enemyHit;
    static double heroHealth;
    static double enemyHealth;

    static void info(Hero hero, Enemy enemy) {
        System.out.println(hero.name + " health is: " + hero.health);
        System.out.println(enemy.name + " health is: " + enemy.health);
        System.out.println();
    }

    static void choices(Hero hero, Enemy enemy,
                        ArrayList<Sword> heroAttackChoice, ArrayList<Sword> enemyAttackChoice,
                        ArrayList<Shield> heroDefenceChoice, ArrayList<Shield> enemyDefenceChoice) {
        int heroDamage = heroAttackChoice.get(random.nextInt(heroAttackChoice.size())).damage
                + hero.damage;
        int enemyDamage = enemyAttackChoice.get(random.nextInt(enemyAttackChoice.size())).damage
                + enemy.damage;
        double heroDefence = ((heroDefenceChoice.get(random.nextInt(heroDefenceChoice.size())).defence
                + hero.defence) / 100) / 2;
        double enemyDefence = ((enemyDefenceChoice.get(random.nextInt(enemyDefenceChoice.size())).defence
                + enemy.defence) / 100) / 2;
        heroHit = (heroDamage - (heroDamage * enemyDefence));
        enemyHit = (enemyDamage - (enemyDamage * heroDefence));
    }

    static void fight(Hero hero, Enemy enemy,
                      ArrayList<Sword> heroAttackChoice, ArrayList<Sword> enemyAttackChoice,
                      ArrayList<Shield> heroDefenceChoice, ArrayList<Shield> enemyDefenceChoice) {
        info(hero, enemy);
        choices(hero, enemy, heroAttackChoice, enemyAttackChoice, heroDefenceChoice, enemyDefenceChoice);
        while (hero.health > 0 && enemy.health > 0) {
            counter++;
            heroHealth = (hero.health -= enemyHit);
            enemyHealth = (enemy.health -= heroHit);
            System.out.println(hero.name + " hit " + enemy.name + " with " + df.format(heroHit) +
                    " damage and left him with " + df.format(enemyHealth) + " health");
            System.out.println(enemy.name + " hit " + hero.name + " with " + df.format(enemyHit) +
                    " damage and left him with " + df.format(heroHealth) + " health");
            System.out.println();
        }
        result(hero, enemy);
    }

    static void result(Hero hero, Enemy enemy) {
        if (heroHealth == enemyHealth) {
            System.out.println("Battle took " + counter + " rounds and ended up in tie");
        } else if (heroHealth > enemyHealth) {
            System.out.println("Battle took " + counter + " rounds and " + hero.name + " won");
        } else {
            System.out.println("Battle took " + counter + " rounds and " + enemy.name + " won");
        }
    }
}