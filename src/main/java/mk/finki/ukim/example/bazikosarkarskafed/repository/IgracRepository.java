package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.Igrac;
import mk.finki.ukim.example.bazikosarkarskafed.model.Klub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface IgracRepository extends JpaRepository<Igrac, String> {
    Igrac findByPozicija(String position);
    @Transactional
    @Modifying
    @Query(value = "insert into igrac(embg, broj_na_dres, pozicija, id_klub) VALUES (?1,?2,?3,?4)",
    nativeQuery = true)
    void insertPlayer(String id, Integer brojNaDres, String pozicija, Integer idKlub);


}