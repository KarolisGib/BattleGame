import java.util.ArrayList;
import java.util.Arrays;
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
        rustySword.damage = new ArrayList<>(Arrays.asList(7, 8, 9)); // 8-9

        Sword sword = new Sword();
        sword.name = "Sword";
        sword.damage = new ArrayList<>(Arrays.asList(11, 12, 13)); // 11-12

        Sword enhancedSword = new Sword();
        enhancedSword.name = "Enhanced sword";
        enhancedSword.damage = new ArrayList<>(Arrays.asList(15, 16, 17)); // 14-15

        Shield rustyShield = new Shield();
        rustyShield.name = "Rusty shield";
        rustyShield.defence = 40;

        Shield shield = new Shield();
        shield.name = "Shield";
        shield.defence = 45;

        Shield enhancedShield = new Shield();
        enhancedShield.name = "Enhanced shield";
        enhancedShield.defence = 50;

        ArrayList<Sword> attackChoice = new ArrayList<>();
        attackChoice.add(rustySword);
        attackChoice.add(sword);
        attackChoice.add(enhancedSword);

        ArrayList<Shield> defenceChoice = new ArrayList<>();
        defenceChoice.add(rustyShield);
        defenceChoice.add(shield);
        defenceChoice.add(enhancedShield);

        Methods.fight(hero, enemy,
                attackChoice, defenceChoice);

        //experience calculation baseXp * (levelToGet ^ factor)
        // baseXp - constant that decides how much xp you need to go up lvl
        //levelToGet - level you are aiming for. at 1 lvl this will be lvl 2
        //factor is another constant that decides how much of an increase of xp you need for each lvl
    }
}