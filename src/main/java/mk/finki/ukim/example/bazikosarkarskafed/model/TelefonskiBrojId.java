package mk.finki.ukim.example.bazikosarkarskafed.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TelefonskiBrojId implements Serializable {
    private static final long serialVersionUID = 4019927299876103717L;
    @Column(name = "id_klub", nullable = false)
    private Integer idKlub;
    @Column(name = "telefonski_broj", nullable = false, length = 15)
    private String telefonskiBroj;

    public String getTelefonskiBroj() {
        return telefonskiBroj;
    }

    public void setTelefonskiBroj(String telefonskiBroj) {
        this.telefonskiBroj = telefonskiBroj;
    }

    public Integer getIdKlub() {
        return idKlub;
    }

    public void setIdKlub(Integer idKlub) {
        this.idKlub = idKlub;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKlub, telefonskiBroj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TelefonskiBrojId entity = (TelefonskiBrojId) o;
        return Objects.equals(this.idKlub, entity.idKlub) &&
                Objects.equals(this.telefonskiBroj, entity.telefonskiBroj);
    }
}