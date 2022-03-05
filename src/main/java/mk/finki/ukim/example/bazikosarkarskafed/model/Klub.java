package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "klub")
public class Klub  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_klub", nullable = false)
    private Integer id1;

    @Column(name = "ime", nullable = false, length = 50)
    private String ime;

    @Column(name = "adresa", length = 50)
    private String adresa;

    @Column(name = "sponzor", length = 50)
    private String sponzor;

    @Column(name = "domasenteren", length = 50)
    private String domasenteren;

    @Column(name="poeni")
    private Integer poeni;

    public Klub(String ime, String adresa, String sponzor, String domasenteren) {
        this.ime = ime;
        this.adresa = adresa;
        this.sponzor = sponzor;
        this.domasenteren = domasenteren;
        poeni=0;
    }

    public Klub() {

    }
}