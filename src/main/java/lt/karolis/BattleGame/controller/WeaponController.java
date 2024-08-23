package lt.karolis.BattleGame.controller;

import lt.karolis.BattleGame.service.WeaponService;
import lt.karolis.BattleGame.weapon.Weapon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/mapping") //http://localhost:8080/mapping
public class WeaponController {

    private final WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }


    @GetMapping(path = "/get/weapon/all") //http://localhost:8080/mapping/get/weapon/all
    public List<Weapon> getAllWeapons() {
        return weaponService.getAllWeapons();
    }
}
