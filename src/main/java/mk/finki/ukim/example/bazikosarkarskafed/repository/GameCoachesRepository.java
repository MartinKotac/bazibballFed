package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GameCoaches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameCoachesRepository extends JpaRepository<GameCoaches, Integer> {
    @Query(value = "select * from gamecoaches where id_natprevar=?1", nativeQuery = true)
    List<GameCoaches> findByGameId(int id);
}