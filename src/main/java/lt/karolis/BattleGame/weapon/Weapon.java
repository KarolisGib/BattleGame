package lt.karolis.BattleGame.weapon;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;

@Entity
@Table(name = "weapon")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Weapon {

    @Id
    private Integer id;

    private String name;

    private Integer damage;

}