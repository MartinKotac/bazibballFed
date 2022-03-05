package mk.finki.ukim.example.bazikosarkarskafed.model.views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "coaches", schema = "kosarkarskafederacija")
public class Coaches {
    @Id
    @Column(name = "embg", length = 13)
    private String embg;

    @Column(name = "ime", length = 20)
    private String ime;

    @Column(name = "prezime", length = 20)
    private String prezime;

    @Column(name = "tip_na_trener", length = 20)
    private String tipNaTrener;

    @Column(name = "imeklub", length = 50)
    private String imeklub;

    public String getImeklub() {
        return imeklub;
    }

    public String getTipNaTrener() {
        return tipNaTrener;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getEmbg() {
        return embg;
    }
}