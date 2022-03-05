package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GamePlayers;
import mk.finki.ukim.example.bazikosarkarskafed.repository.GamePlayersRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.GamePlayersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesPlayersServiceImpl implements GamePlayersService {
    private final GamePlayersRepository gamePlayersRepository;

    public GamesPlayersServiceImpl(GamePlayersRepository gamePlayersRepository) {
        this.gamePlayersRepository = gamePlayersRepository;
    }

    @Override
    public List<GamePlayers> listAll() {
        return gamePlayersRepository.findAll();
    }

    @Override
    public List<GamePlayers> listByGameId(int id) {
        return gamePlayersRepository.findByGameId(id);
    }
}
