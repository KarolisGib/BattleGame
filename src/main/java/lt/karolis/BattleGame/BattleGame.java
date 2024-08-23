package lt.karolis.BattleGame;

import lt.karolis.BattleGame.chars.heroes.Enemy;
import lt.karolis.BattleGame.chars.heroes.Hero;
import lt.karolis.BattleGame.methods.Methods;
import lt.karolis.BattleGame.shield.Shield;
import lt.karolis.BattleGame.weapon.Sword.Sword;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class BattleGame {

    public static void main(String[] args) {
        SpringApplication.run(BattleGame.class, args);

        Scanner scanner = new Scanner(System.in);

        Hero hero = new Hero(1, "Hero", 100, 3, 15, 0, 1);

        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy(2, "Weak enemy", 90, 3, 6, 10, 1));
        enemies.add(new Enemy(3, "Enemy", 95, 3, 8, 20, 2));
        enemies.add(new Enemy(4, "Strong enemy", 100, 3, 10, 30, 3));

        ArrayList<Sword> swords = new ArrayList<>();
        swords.add(new Sword(1, "Rusty sword", 9));
        swords.add(new Sword(2, "Sword", 13));
        swords.add(new Sword(3, "Enhanced sword", 17));

        ArrayList<Shield> shields = new ArrayList<>();
        shields.add(new Shield(1, "Rusty shield", 40));
        shields.add(new Shield(2, "Shield", 45));
        shields.add(new Shield(3, "Enhanced shield", 50));

        while (true) {
            info();

            try {
                switch (scanner.nextInt()) {
                    case 1:
                        Methods.fight(hero, enemies, swords, shields, scanner);
                        break;
                    case 2:
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                System.out.println();
                scanner.nextLine();
            }
        }

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