package mk.finki.ukim.example.bazikosarkarskafed.model.views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Immutable
@Table(name = "games", schema = "kosarkarskafederacija")
public class Games {
    @Id
    @Column(name = "id_natprevar")
    private Integer idNatprevar;

    @Column(name = "domakin", length = 50)
    private String domakin;

    @Column(name = "domakinid")
    private Integer domakinid;

    @Column(name = "gostin", length = 50)
    private String gostin;

    @Column(name = "gostinid")
    private Integer gostinid;

    @Column(name = "datum_na_odrzuvanje")
    private LocalDate datumNaOdrzuvanje;

    @Column(name = "rezultat", length = 100)
    private String rezultat;

    @Column(name = "ime", length = 20)
    private String ime;

    @Column(name = "prezime", length = 20)
    private String prezime;

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getRezultat() {
        return rezultat;
    }

    public LocalDate getDatumNaOdrzuvanje() {
        return datumNaOdrzuvanje;
    }

    public Integer getGostinid() {
        return gostinid;
    }

    public String getGostin() {
        return gostin;
    }

    public Integer getDomakinid() {
        return domakinid;
    }

    public String getDomakin() {
        return domakin;
    }

    public Integer getIdNatprevar() {
        return idNatprevar;
    }
}