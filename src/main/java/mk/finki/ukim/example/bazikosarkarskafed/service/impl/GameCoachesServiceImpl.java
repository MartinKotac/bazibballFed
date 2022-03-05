package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GameCoaches;
import mk.finki.ukim.example.bazikosarkarskafed.repository.GameCoachesRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.GameCoachesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameCoachesServiceImpl implements GameCoachesService {
    private final GameCoachesRepository gameCoachesRepository;

    public GameCoachesServiceImpl(GameCoachesRepository gameCoachesRepository) {
        this.gameCoachesRepository = gameCoachesRepository;
    }

    @Override
    public List<GameCoaches> listAll() {
        return gameCoachesRepository.findAll();
    }

    @Override
    public List<GameCoaches> listByGameId(int id) {
        return gameCoachesRepository.findByGameId(id);
    }
}
