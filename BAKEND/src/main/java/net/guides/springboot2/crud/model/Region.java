package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TC_REGION")
public class Region {

    private long ID_REGION;
    private String NOMBRE;

    public Region() {

    }

    public Region(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_REGION", nullable = false)
    public long getId() {
        return ID_REGION;
    }

    public void setId(long id) {
        this.ID_REGION = id;
    }

    @Column(name = "NOMBRE", nullable = false)
    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    @Override
    public String toString() {
        return "TC_REGION [ID=" + ID_REGION
                + ", NOMBRE=" + NOMBRE
                + "]";
    }

}
