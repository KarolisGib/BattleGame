import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Hero hero = new Hero("Hero", 100, (random.nextInt(2) + 1), (random.nextInt(51)), 0, 1);
        Enemy enemy = new Enemy("Enemy", 100, (random.nextInt(2) + 1), (random.nextInt(51)), 10, 1);

        Sword rustySword = new Sword("Rusty sword", new ArrayList<>(Arrays.asList(7, 8, 9)));
        Sword sword = new Sword("Sword", new ArrayList<>(Arrays.asList(11, 12, 13)));
        Sword enhancedSword = new Sword("Enhanced sword", new ArrayList<>(Arrays.asList(15, 16, 17)));

        Shield rustyShield = new Shield("Rusty shield", 40);
        Shield shield = new Shield("Shield", 45);
        Shield enhancedShield = new Shield("Enhanced shield", 50);

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

        //(lastLevel + currentLevel) * 30
    }
}