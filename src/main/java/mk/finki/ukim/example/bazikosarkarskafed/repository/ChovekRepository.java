package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.Chovek;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChovekRepository extends JpaRepository<Chovek, String> {
}