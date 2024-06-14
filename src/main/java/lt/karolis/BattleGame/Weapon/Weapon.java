package lt.karolis.BattleGame.Weapon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Weapon {

    private String name;

    private ArrayList<Integer> damage;

}