package lt.karolis.BattleGame.chars.heroes;

import lt.karolis.BattleGame.chars.Character;

public class Enemy extends Character {
    public Enemy(Integer id, String name, double health, int damage, int defence, int experience, int level) {
        super(id, name, health, damage, defence, experience, level);
    }
}