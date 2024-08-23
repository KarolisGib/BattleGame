package lt.karolis.BattleGame.repositories;

import lt.karolis.BattleGame.shield.Shield;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShieldRepository extends CrudRepository<Shield, Integer> {

    List<Shield> findAll();
}
