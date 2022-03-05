package mk.finki.ukim.example.bazikosarkarskafed.model.views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Immutable
@Table(name = "winners", schema = "kosarkarskafederacija")
public class Winners {
    @Id
    @Column(name = "klubid")
    private Integer klubid;

    @Column(name = "datum_na_odrzuvanje")
    private LocalDate datumNaOdrzuvanje;

    public LocalDate getDatumNaOdrzuvanje() {
        return datumNaOdrzuvanje;
    }

    public Integer getKlubid() {
        return klubid;
    }
}