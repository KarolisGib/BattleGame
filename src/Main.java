import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        Hero hero = new Hero("Hero", 100, (random.nextInt(2) + 1),
                (15), 0, 1);

        Enemy weakEnemy = new Enemy("Weak enemy", 85, (random.nextInt(2) + 1),
                (6), 10, 1);
        Enemy enemy = new Enemy("Enemy", 90, (random.nextInt(2) + 1),
                (8), 20, 2);
        Enemy strongEnemy = new Enemy("Strong enemy", 95, (random.nextInt(2) + 1),
                (10), 30, 3);

        Sword rustySword = new Sword("Rusty sword", new ArrayList<>(Arrays.asList(7, 8, 9)));
        Sword sword = new Sword("Sword", new ArrayList<>(Arrays.asList(11, 12, 13)));
        Sword enhancedSword = new Sword("Enhanced sword", new ArrayList<>(Arrays.asList(15, 16, 17)));

        Shield rustyShield = new Shield("Rusty shield", 40);
        Shield shield = new Shield("Shield", 45);
        Shield enhancedShield = new Shield("Enhanced shield", 50);

        ArrayList<Enemy> enemyList = new ArrayList<>();
        enemyList.add(weakEnemy);
        enemyList.add(enemy);
        enemyList.add(strongEnemy);

        ArrayList<Sword> attackChoice = new ArrayList<>();
        attackChoice.add(rustySword);
        attackChoice.add(sword);
        attackChoice.add(enhancedSword);

        ArrayList<Shield> defenceChoice = new ArrayList<>();
        defenceChoice.add(rustyShield);
        defenceChoice.add(shield);
        defenceChoice.add(enhancedShield);

        while (true) {
            info();
            int options = sc.nextInt();
            switch (options) {
                case 1:
                    Methods.fight(hero, enemyList, attackChoice, defenceChoice);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }

//        Methods.choices(hero, enemyList, attackChoice, defenceChoice);

        //experience calculation baseXp * (levelToGet ^ factor)
        // baseXp - constant that decides how much xp you need to go up lvl
        //levelToGet - level you are aiming for. at 1 lvl this will be lvl 2
        //factor is another constant that decides how much of an increase of xp you need for each lvl

        //(lastLevel + currentLevel) * 30
    }

    public static void info() {
        System.out.println("1. Fight");
        System.out.println("2. Exit");
    }
}