import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Methods {

    private static final DecimalFormat df = new DecimalFormat("0.0");
    static int counter = 0;
    static Random random = new Random();

    static void info(Hero hero, Enemy enemy) {
        System.out.println(hero.name + " health is: " + hero.health);
        System.out.println(enemy.name + " health is: " + enemy.health);
        System.out.println();
    }

    static void fight(Hero hero, Enemy enemy, ArrayList<Integer> heroChoice, ArrayList<Integer> enemyChoice) {
        info(hero, enemy);
        int heroDamage = heroChoice.get(random.nextInt(heroChoice.size()));
        int enemyDamage = enemyChoice.get(random.nextInt(enemyChoice.size()));
        while (hero.health > 0 && enemy.health > 0) {
            counter++;
            System.out.println(heroDamage);
            System.out.println(enemyDamage);
            double heroHealth = (hero.health -= (enemyDamage - (enemyDamage * hero.defence)));
            double enemyHealth = (enemy.health -= (heroDamage - (heroDamage * enemy.defence)));
            System.out.println(hero.name + " health is: " + df.format(heroHealth));
            System.out.println(enemy.name + " health is: " + df.format(enemyHealth));
            System.out.println();
        }
        result(hero, enemy);
    }

    static void result(Hero hero, Enemy enemy) {
        if (hero.health == enemy.health) {
            System.out.println("Battle took " + counter + " rounds and ended up in tie");
        } else if (hero.health > enemy.health) {
            System.out.println("Battle took " + counter + " rounds and " + hero.name + " won");
        } else {
            System.out.println("Battle took " + counter + " rounds and " + enemy.name + " won");
        }
    }
}