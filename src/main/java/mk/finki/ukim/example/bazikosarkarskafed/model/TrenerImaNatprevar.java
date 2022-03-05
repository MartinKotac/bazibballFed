package mk.finki.ukim.example.bazikosarkarskafed.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trener_ima_natprevar", schema = "kosarkarskafederacija")
public class TrenerImaNatprevar {
    @EmbeddedId
    private TrenerImaNatprevarId id;

    public TrenerImaNatprevarId getId() {
        return id;
    }

    public void setId(TrenerImaNatprevarId id) {
        this.id = id;
    }
}