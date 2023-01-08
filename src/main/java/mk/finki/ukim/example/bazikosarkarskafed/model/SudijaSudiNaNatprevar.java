package mk.finki.ukim.example.bazikosarkarskafed.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "sudija_sudi_na_natprevar", schema = "kosarkarskafederacija")
public class SudijaSudiNaNatprevar {
    @EmbeddedId
    private SudijaSudiNaNatprevarId id;

    public SudijaSudiNaNatprevarId getId() {
        return id;
    }

    public void setId(SudijaSudiNaNatprevarId id) {
        this.id = id;
    }


}