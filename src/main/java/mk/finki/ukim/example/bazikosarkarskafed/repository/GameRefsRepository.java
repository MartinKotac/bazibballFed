package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.GameRefs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRefsRepository extends JpaRepository<GameRefs, Integer> {
    @Query(value = "select * from GameRefs where id_natprevar=?1", nativeQuery = true)
    List<GameRefs> findByGameId(int id);
}