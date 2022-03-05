package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "igrac", schema = "kosarkarskafederacija")
public class Igrac {
    @Id
    @Column(name = "embg", nullable = false, length = 13)
    private String id;

    @Column(name = "broj_na_dres")
    private Integer brojNaDres;

    @Column(name = "pozicija", length = 2)
    private String pozicija;

    @ManyToOne
    @JoinColumn(name = "id_klub")
    private Klub idKlub;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "embg")
    private Chovek chovek;

    public Igrac() {
    }

    public Igrac(String id, Integer brojNaDres, String pozicija, Klub idKlub, Chovek chovek) {
        this.id = id;
        this.brojNaDres = brojNaDres;
        this.pozicija = pozicija;
        this.idKlub = idKlub;
        this.chovek = chovek;
    }
}