import java.text.DecimalFormat;

public class Methods {

    private static final DecimalFormat df = new DecimalFormat("0.0");
    static int counter = 0;

    static void info(Hero hero, Enemy enemy) {
        System.out.println(hero.name + " health is: " + hero.health);
        System.out.println(hero.name + " damage is: " + hero.damage);
        System.out.println(enemy.name + " health is: " + enemy.health);
        System.out.println(enemy.name + " damage is: " + enemy.damage);
        System.out.println();
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

    static void fight(Hero hero, Enemy enemy) {
        info(hero, enemy);
        while (hero.health > 0 && enemy.health > 0) {
            counter++;
            double heroHealth = (hero.health -= (enemy.damage - (enemy.damage * hero.defence)));
            double enemyHealth = (enemy.health -= (hero.damage - (hero.damage * enemy.defence)));
            System.out.println(hero.name + " health is: " + df.format(heroHealth));
            System.out.println(enemy.name + " health is: " + df.format(enemyHealth));
            System.out.println();
        }
        result(hero, enemy);
    }
}