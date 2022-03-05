package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GameRefs;
import mk.finki.ukim.example.bazikosarkarskafed.repository.GameRefsRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.GameRefsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameRefsServiceImpl implements GameRefsService {
    private final GameRefsRepository gameRefsRepository;

    public GameRefsServiceImpl(GameRefsRepository gameRefsRepository) {
        this.gameRefsRepository = gameRefsRepository;
    }

    @Override
    public List<GameRefs> listByGameId(int id) {
        return gameRefsRepository.findByGameId(id);
    }
}
