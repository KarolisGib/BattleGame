package lt.karolis.BattleGame.Char;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Character {

    private String name;

    public double health;

    private int damage;

    private int defence;

    private int experience;

    private int level;

    public int setExperience(int experience) {
        this.experience = experience;
        return experience;
    }
}