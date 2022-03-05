package mk.finki.ukim.example.bazikosarkarskafed.model.views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "clubplayers", schema = "kosarkarskafederacija")
public class ClubPlayers {
    @Id
    @Column(name = "embg", length = 13)
    private String embg;

    @Column(name = "id_klub")
    private Integer idKlub;

    @Column(name = "klub", length = 50)
    private String klub;

    @Column(name = "ime", length = 20)
    private String ime;

    @Column(name = "prezime", length = 20)
    private String prezime;

    @Column(name = "pozicija", length = 2)
    private String pozicija;

    @Column(name = "broj_na_dres")
    private Integer brojNaDres;

    public Integer getBrojNaDres() {
        return brojNaDres;
    }

    public String getPozicija() {
        return pozicija;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getKlub() {
        return klub;
    }

    public Integer getIdKlub() {
        return idKlub;
    }

    public String getEmbg() {
        return embg;
    }
}