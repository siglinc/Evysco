package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;


public class Color {
    private int id;
    private String nombre;
    private BigDecimal preciocosto;
    private BigDecimal precioventa;
    
    public Color() {
        this.id = 0;
        this.nombre = "";
    }

    public Color(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}