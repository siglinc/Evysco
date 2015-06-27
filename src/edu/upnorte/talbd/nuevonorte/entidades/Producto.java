package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;
import java.util.Date;


public class Producto {
    private int id;
    private Categoria idCategoria;
    private BigDecimal precioventa;
    private BigDecimal preciocosto;
    private Date fecha;

    public Producto() {
        this.id = 0;
        this.idCategoria = new Categoria();
        this.precioventa = BigDecimal.ZERO;
        this.preciocosto = BigDecimal.ZERO;
        this.fecha = new Date();
    }

    public Producto(int id, Categoria idCategoria, BigDecimal precioventa, BigDecimal preciocosto, Date fecha) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.precioventa = precioventa;
        this.preciocosto = preciocosto;
        this.fecha = fecha;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idCategoria
     */
    public Categoria getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the precioventa
     */
    public BigDecimal getPrecioventa() {
        return precioventa;
    }

    /**
     * @param precioventa the precioventa to set
     */
    public void setPrecioventa(BigDecimal precioventa) {
        this.precioventa = precioventa;
    }

    /**
     * @return the preciocosto
     */
    public BigDecimal getPreciocosto() {
        return preciocosto;
    }

    /**
     * @param preciocosto the preciocosto to set
     */
    public void setPreciocosto(BigDecimal preciocosto) {
        this.preciocosto = preciocosto;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}