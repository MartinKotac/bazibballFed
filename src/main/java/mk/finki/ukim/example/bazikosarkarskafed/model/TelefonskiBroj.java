package mk.finki.ukim.example.bazikosarkarskafed.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "telefonski_broj", schema = "kosarkarskafederacija")
public class TelefonskiBroj {
    @EmbeddedId
    private TelefonskiBrojId id;

    public TelefonskiBrojId getId() {
        return id;
    }

    public void setId(TelefonskiBrojId id) {
        this.id = id;
    }
}