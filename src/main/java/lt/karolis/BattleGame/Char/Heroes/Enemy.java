package lt.karolis.BattleGame.Char.Heroes;

import lt.karolis.BattleGame.Char.Character;

public class Enemy extends Character {
    public Enemy(String name, double health, int damage, int defence, int experience, int level) {
        super(name, health, damage, defence, experience, level);
    }
}