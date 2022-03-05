package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GameRefs;

import java.util.List;

public interface GameRefsService {
    List<GameRefs> listByGameId(int id);
}
