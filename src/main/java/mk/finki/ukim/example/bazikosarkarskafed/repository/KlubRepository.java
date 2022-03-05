package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.Klub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KlubRepository extends JpaRepository<Klub, Integer> {
    //    @Query(value = "update klub "+
//            "set poeni=poeni+3*(select count(klubId) "+
//            "from winners "+
//            "where klubId=id_klub)", nativeQuery = true)
//    void updateAllClubPoints();
    @Query(value = "select * from klub order by poeni desc", nativeQuery = true)
    List<Klub> showStandings();
}