package lt.karolis.BattleGame.service;

import lt.karolis.BattleGame.repositories.WeaponRepository;
import lt.karolis.BattleGame.weapon.Weapon;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponService {

    private final WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    public List<Weapon> getAllWeapons() {
        return weaponRepository.findAll();
    }
}
