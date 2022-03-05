package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.ClubPlayers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubPlayersRepository extends JpaRepository<ClubPlayers, Integer> {

}