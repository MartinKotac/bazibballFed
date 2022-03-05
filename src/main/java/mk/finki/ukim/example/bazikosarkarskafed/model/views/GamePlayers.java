package mk.finki.ukim.example.bazikosarkarskafed.model.views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Immutable
@Table(name = "gameplayers", schema = "kosarkarskafederacija")
public class GamePlayers {
    @Id
    @Column(name = "gpembg", length = 13)
    private String gpembg;

    @Column(name = "id_natprevar")
    private Integer idNatprevar;

    @Column(name = "statistika", length = 100)
    private String statistika;

    @Column(name = "datum_na_odrzuvanje")
    private LocalDate datumNaOdrzuvanje;

    @Column(name = "ime", length = 20)
    private String ime;

    @Column(name = "prezime", length = 20)
    private String prezime;

    @Column(name = "minutaza", length = 5)
    private String minutaza;

    @Column(name = "broj_na_dres")
    private Integer brojNaDres;

    @Column(name = "pozicija", length = 2)
    private String pozicija;

    @Column(name = "klub", length = 50)
    private String klub;

    public String getKlub() {
        return klub;
    }

    public String getPozicija() {
        return pozicija;
    }

    public Integer getBrojNaDres() {
        return brojNaDres;
    }

    public String getMinutaza() {
        return minutaza;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public LocalDate getDatumNaOdrzuvanje() {
        return datumNaOdrzuvanje;
    }

    public String getStatistika() {
        return statistika;
    }

    public Integer getIdNatprevar() {
        return idNatprevar;
    }

    public String getGpembg() {
        return gpembg;
    }
}