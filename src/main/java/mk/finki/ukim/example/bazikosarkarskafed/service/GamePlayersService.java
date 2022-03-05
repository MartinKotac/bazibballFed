package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GamePlayers;

import java.util.List;

public interface GamePlayersService {
    List<GamePlayers> listAll();
    List<GamePlayers> listByGameId(int id);
}
