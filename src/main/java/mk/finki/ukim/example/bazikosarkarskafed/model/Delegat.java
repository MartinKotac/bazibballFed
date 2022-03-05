package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "delegat", schema = "kosarkarskafederacija")
public class Delegat {
    @Id
    @Column(name = "embg", nullable = false, length = 13)
    private String id;

    @Column(name = "delegat_nivo", nullable = false)
    private Integer delegatNivo;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name="embg")
    private Chovek chovek;

    public Delegat() {
    }

    public Delegat(String id, Integer delegatNivo, Chovek chovek) {
        this.id = id;
        this.delegatNivo = delegatNivo;
        this.chovek = chovek;
    }
}