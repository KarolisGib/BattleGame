package lt.karolis.BattleGame.chars.heroes;

import lt.karolis.BattleGame.chars.Character;

public class Hero extends Character {
    public Hero(Integer id, String name, double health, int damage, int defence, int experience, int level) {
        super(id, name, health, damage, defence, experience, level);
    }
}