package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.ClubPlayers;
import mk.finki.ukim.example.bazikosarkarskafed.model.views.Games;

import java.util.List;

public interface GamesService {
    List<Games> listAll();
}
