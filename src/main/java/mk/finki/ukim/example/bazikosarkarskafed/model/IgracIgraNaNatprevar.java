package mk.finki.ukim.example.bazikosarkarskafed.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Getter
@Setter
@Entity
@Table(name = "igrac_igra_na_natprevar", schema = "kosarkarskafederacija")
public class IgracIgraNaNatprevar {
    @EmbeddedId
    private IgracIgraNaNatprevarId id;

    @Column(name = "minutaza", length = 5)
    private String minutaza;


}