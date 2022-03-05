package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.Trener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface TrenerRepository extends JpaRepository<Trener, String> {
    @Transactional
    @Modifying
    @Query(value = "insert into trener(embg, tip_na_trener, id_klub) VALUES (?1,?2,?3)",
            nativeQuery = true)
    void insertCoach(String id, String type,Integer idKlub);
}