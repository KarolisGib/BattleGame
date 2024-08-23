package lt.karolis.BattleGame.service;

import lt.karolis.BattleGame.chars.Character;
import lt.karolis.BattleGame.repositories.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }


    public List<Character> getALlCharacters() {
        return characterRepository.findAll();
    }
}
