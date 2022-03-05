package mk.finki.ukim.example.bazikosarkarskafed.repository;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.Refs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefsRepository extends JpaRepository<Refs, String> {
}