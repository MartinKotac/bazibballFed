package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.ClubPlayers;
import mk.finki.ukim.example.bazikosarkarskafed.repository.ClubPlayersRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.ClubPlayersService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubPlayersServiceImpl implements ClubPlayersService {
   private final ClubPlayersRepository clubPlayersRepository;

    public ClubPlayersServiceImpl(ClubPlayersRepository clubPlayersRepository) {
        this.clubPlayersRepository = clubPlayersRepository;
    }
    @Override
    public List<ClubPlayers> listAll(){
        return clubPlayersRepository.findAll();
    }

    @Override
    public List<ClubPlayers> listAllByClubId(int klubId) {
        return clubPlayersRepository.findById(klubId).stream().collect(Collectors.toList());
    }

}
