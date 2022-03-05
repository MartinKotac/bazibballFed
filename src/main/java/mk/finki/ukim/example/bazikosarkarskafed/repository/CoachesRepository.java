package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.Coaches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachesRepository extends JpaRepository<Coaches, String> {
}