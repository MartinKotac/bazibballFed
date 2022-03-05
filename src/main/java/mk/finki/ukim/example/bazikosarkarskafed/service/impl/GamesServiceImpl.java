package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.Games;
import mk.finki.ukim.example.bazikosarkarskafed.repository.GamesRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.GamesService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GamesServiceImpl implements GamesService {
    private final GamesRepository gamesRepository;

    public GamesServiceImpl(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

    @Override
    public List<Games> listAll() {
       return gamesRepository.findAll();
    }
}
