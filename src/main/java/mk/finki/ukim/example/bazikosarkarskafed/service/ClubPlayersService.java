package mk.finki.ukim.example.bazikosarkarskafed.service;


import mk.finki.ukim.example.bazikosarkarskafed.model.views.ClubPlayers;

import java.util.List;

public interface ClubPlayersService {
 List<ClubPlayers> listAll();
 List<ClubPlayers> listAllByClubId(int id);
}
