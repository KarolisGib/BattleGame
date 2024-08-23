package lt.karolis.BattleGame.repositories;

import lt.karolis.BattleGame.weapon.Weapon;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeaponRepository extends CrudRepository<Weapon, Integer> {

    List<Weapon> findAll();
}
