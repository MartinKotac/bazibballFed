package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "chovek", schema = "kosarkarskafederacija")
public class Chovek {
    @Id
    @Column(name = "embg", nullable = false, length = 13)
    private String id;

    @Column(name = "ime", length = 20)
    private String ime;

    @Column(name = "prezime", length = 20)
    private String prezime;

    public Chovek(String id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Chovek() {
    }
}