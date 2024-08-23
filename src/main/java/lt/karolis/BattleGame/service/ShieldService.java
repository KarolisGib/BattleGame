package lt.karolis.BattleGame.service;

import lt.karolis.BattleGame.shield.Shield;
import lt.karolis.BattleGame.repositories.ShieldRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShieldService {

    private final ShieldRepository shieldRepository;


    public ShieldService(ShieldRepository shieldRepository) {
        this.shieldRepository = shieldRepository;
    }

    public List<Shield> getAllShields() {
        return shieldRepository.findAll();
    }
}
