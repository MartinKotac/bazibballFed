package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sudija", schema = "kosarkarskafederacija")
public class Sudija {
    @Id
    @Column(name = "embg", nullable = false, length = 13)
    private String id;

    @Column(name = "sudisko_nivo", nullable = false)
    private Integer sudiskoNivo;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name="embg")
    private Chovek chovek;

    public Sudija() {
    }

    public Sudija(String id, Integer sudiskoNivo) {
        this.id = id;
        this.sudiskoNivo = sudiskoNivo;
        this.chovek = chovek;
    }
}