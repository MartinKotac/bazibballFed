package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "natprevar", schema = "kosarkarskafederacija")
public class Natprevar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_natprevar", nullable = false)
    private Integer id;

    @Column(name = "statistika", length = 100)
    private String statistika;

    @Column(name = "datum_na_odrzuvanje")
    private LocalDate datumNaOdrzuvanje;

    @ManyToOne
    @JoinColumn(name = "embg")
    private Delegat embg;

    @ManyToOne
    @JoinColumn(name = "id_klub_domakin")
    private Klub idKlubDomakin;

    @ManyToOne
    @JoinColumn(name = "id_klub_gostin")
    private Klub idKlubGostin;

}