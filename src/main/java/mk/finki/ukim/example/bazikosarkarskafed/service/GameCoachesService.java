package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GameCoaches;

import java.util.List;

public interface GameCoachesService {
    List<GameCoaches> listAll();
    List<GameCoaches> listByGameId(int id);
}
