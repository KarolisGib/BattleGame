package lt.karolis.BattleGame.repositories;

import lt.karolis.BattleGame.chars.Character;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CharacterRepository extends CrudRepository<Character, Integer> {

    List<Character> findAll();
}
