package lt.karolis.BattleGame.chars;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "character")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    private double health;

    private int damage;

    private int defence;

    private int experience;

    private int level;
}