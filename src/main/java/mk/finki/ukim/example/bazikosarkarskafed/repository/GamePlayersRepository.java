package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GamePlayers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GamePlayersRepository extends JpaRepository<GamePlayers, Integer> {
        @Query(value = "select * from GamePlayers where id_natprevar = ?1", nativeQuery = true)
        List<GamePlayers> findByGameId(int id);
}