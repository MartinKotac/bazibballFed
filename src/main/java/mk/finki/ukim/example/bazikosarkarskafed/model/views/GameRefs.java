package mk.finki.ukim.example.bazikosarkarskafed.model.views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Immutable
@Table(name = "gamerefs", schema = "kosarkarskafederacija")
public class GameRefs {
    @Id
    @Column(name = "grembg", length = 13)
    private String grembg;

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

    @Column(name = "sudisko_nivo")
    private Integer sudiskoNivo;

    public Integer getSudiskoNivo() {
        return sudiskoNivo;
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

    public String getGrembg() {
        return grembg;
    }
}