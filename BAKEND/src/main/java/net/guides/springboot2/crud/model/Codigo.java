package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TC_CODIGO")
public class Codigo {

    private long ID_CODIGO;
    private String CODIGO;
    private long DESCUENTO;

    public Codigo() {

    }

    public Codigo(String CODIGO, long DESCUENTO) {
        this.CODIGO = CODIGO;
        this.DESCUENTO = DESCUENTO;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CODIGO", nullable = false)
    public long getId() {
        return ID_CODIGO;
    }

    public void setId(long id) {
        this.ID_CODIGO = id;
    }

    @Column(name = "CODIGO", nullable = false)
    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    @Column(name = "DESCUENTO")
    public long getDESCUENTO() {
        return DESCUENTO;
    }

    public void setDESCUENTO(long DESCUENTO) {
        this.DESCUENTO = DESCUENTO;
    }

    @Override
    public String toString() {
        return "TC_USUARIO [ID_CODIGO=" + ID_CODIGO
                + ", USERNAME=" + DESCUENTO
                + ", DESCUENTO=" + DESCUENTO
                + "]";
    }

}
