package mk.finki.ukim.example.bazikosarkarskafed.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class IgracIgraNaNatprevarId implements Serializable {
    private static final long serialVersionUID = -1096069013870437596L;
    @Column(name = "embg", nullable = false, length = 13)
    private String embg;
    @Column(name = "id_natprevar", nullable = false)
    private Integer idNatprevar;

    public Integer getIdNatprevar() {
        return idNatprevar;
    }

    public void setIdNatprevar(Integer idNatprevar) {
        this.idNatprevar = idNatprevar;
    }

    public String getEmbg() {
        return embg;
    }

    public void setEmbg(String embg) {
        this.embg = embg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(embg, idNatprevar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        IgracIgraNaNatprevarId entity = (IgracIgraNaNatprevarId) o;
        return Objects.equals(this.embg, entity.embg) &&
                Objects.equals(this.idNatprevar, entity.idNatprevar);
    }
}