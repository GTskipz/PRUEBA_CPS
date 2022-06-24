package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import net.guides.springboot2.crud.model.Region;

@Entity
@Table(name = "TC_PAIS")
public class Pais {

    private long ID_PAIS;
    private String NOMBRE;
    private long TARIFA;
    private long ID_REGION;

    public Pais() {

    }

    public Pais(String NOMBRE, long ID_REGION) {
        this.NOMBRE = NOMBRE;
        this.ID_REGION = ID_REGION;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAIS", nullable = false)
    public long getID_PAIS() {
        return ID_PAIS;
    }

    public void setID_PAIS(long id) {
        this.ID_PAIS = id;
    }

    @Column(name = "NOMBRE", nullable = false)
    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    @Column(name = "TARIFA", nullable = false)
    public long getTARIFA() {
        return TARIFA;
    }

    public void setTARIFA(long TARIFA) {
        this.TARIFA = TARIFA;
    }

    @Column(name = "ID_REGION", nullable = false)
    public long getId_region() {
        return ID_REGION;
    }

    public void setId_region(long ID_REGION) {
        this.ID_REGION = ID_REGION;
    }

    @Override
    public String toString() {
        return "TC_REGION [ID_PAIS=" + ID_PAIS
                + ", NOMBRE=" + NOMBRE
                + ", TARIFA=" + TARIFA
                + ", ID_REGION=" + ID_REGION
                + "]";
    }
}
