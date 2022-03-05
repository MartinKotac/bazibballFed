package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "trener", schema = "kosarkarskafederacija")
public class Trener {
    @Id
    @Column(name = "embg", nullable = false, length = 13)
    private String id;

    @Column(name = "tip_na_trener", length = 20)
    private String tipNaTrener;

    @ManyToOne
    @JoinColumn(name = "id_klub")
    private Klub idKlub;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name="embg")
    private Chovek chovek;


}