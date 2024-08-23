package lt.karolis.BattleGame.shield;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "shield")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shield {

    @Id
    private Integer id;

    private String name;

    private double defence;
}