package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.Sudija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

public interface SudijaRepository extends JpaRepository<Sudija, String> {
    @Transactional
    @Modifying
    @Query(value = "insert into sudija(embg, sudisko_nivo) VALUES (?1,?2)",
            nativeQuery = true)
    void insertRef(String id, Integer level);
}