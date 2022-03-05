package mk.finki.ukim.example.bazikosarkarskafed.model.views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "delegation", schema = "kosarkarskafederacija")
public class Delegation {
    @Id
    @Column(name = "embg", length = 13)
    private String embg;

    @Column(name = "ime", length = 20)
    private String ime;

    @Column(name = "prezime", length = 20)
    private String prezime;

    @Column(name = "delegat_nivo")
    private Integer delegatNivo;

    public Integer getDelegatNivo() {
        return delegatNivo;
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