package lt.karolis.BattleGame.controller;

import lt.karolis.BattleGame.service.ShieldService;
import lt.karolis.BattleGame.shield.Shield;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/mapping") //http://localhost:8080/mapping
public class ShieldController {

    private final ShieldService shieldService;

    public ShieldController(ShieldService shieldService) {
        this.shieldService = shieldService;
    }

    @GetMapping(path = "/get/shield/all") //http://localhost:8080/mapping/get/shield/all
    public List<Shield> getAllShields() {
        return shieldService.getAllShields();
    }
}
