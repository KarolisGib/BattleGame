import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Methods {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    static int counter = 0;

    static Random random = new Random();

    static double heroHealth;
    static double enemyHealth;

    static Sword heroWeapon;
    static Sword enemyWeapon;

    static double heroDefence;
    static double enemyDefence;

    static void info(Hero hero, Enemy enemy) {
        System.out.println(hero.getName() + " health is: " + hero.getHealth());
        System.out.println(enemy.getName() + " health is: " + enemy.getHealth());
        System.out.println();
    }

    static void choices(Hero hero, Enemy enemy,
                        ArrayList<Sword> attackChoice, ArrayList<Shield> defenceChoice) {

        heroWeapon = attackChoice.get(random.nextInt(attackChoice.size()));
        enemyWeapon = attackChoice.get(random.nextInt(attackChoice.size()));

        heroDefence = ((defenceChoice.get(random.nextInt(defenceChoice.size())).getDefence()
                + hero.getDefence()) / 100) / 2;
        enemyDefence = ((defenceChoice.get(random.nextInt(defenceChoice.size())).getDefence()
                + enemy.getDefence()) / 100) / 2;
    }

    static void fight(Hero hero, Enemy enemy,
                      ArrayList<Sword> attackChoice, ArrayList<Shield> defenceChoice) {
        info(hero, enemy);
        choices(hero, enemy, attackChoice, defenceChoice);
        while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
            counter++;

            int heroWeaponDamage = heroWeapon.getDamage().get(random.nextInt(3)) +
                    hero.getDamage();
            int enemyWeaponDamage = enemyWeapon.getDamage().get(random.nextInt(3)) +
                    enemy.getDamage();

            double heroHit = (heroWeaponDamage - (heroWeaponDamage * enemyDefence));
            double enemyHit = (enemyWeaponDamage - (enemyWeaponDamage * heroDefence));

            heroHealth = (hero.health -= enemyHit);
            enemyHealth = (enemy.health -= heroHit);

            System.out.println(hero.getName() + " hit " + enemy.getName() + " with " + df.format(heroHit) +
                    " damage and left him with " + df.format(enemyHealth) + " health");
            System.out.println(enemy.getName() + " hit " + hero.getName() + " with " + df.format(enemyHit) +
                    " damage and left him with " + df.format(heroHealth) + " health");
            System.out.println();
        }
        result(hero, enemy);
    }

    static void result(Hero hero, Enemy enemy) {
        if (heroHealth == enemyHealth) {
            System.out.println("Battle took " + counter + " rounds and ended up in tie");
        } else if (heroHealth > enemyHealth) {
            System.out.println("Battle took " + counter + " rounds and " + hero.getName() + " won");
        } else {
            System.out.println("Battle took " + counter + " rounds and " + enemy.getName() + " won");
        }
    }
}