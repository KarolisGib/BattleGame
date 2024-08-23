package lt.karolis.BattleGame.controller;

import lt.karolis.BattleGame.chars.Character;
import lt.karolis.BattleGame.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/mapping")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping(path = "/get/character/all") //http://localhost:8080/mapping/get/character/all
    public List<Character> getAllCharacters() {
        return characterService.getALlCharacters();
    }
}
