package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;

public class Medida {
    private int id;
    private String nombre;
    private BigDecimal ancho;
    private BigDecimal alto;
    private BigDecimal preciocosto;
    private BigDecimal precioventa;
    
    public Medida() {
        this.id = 0;
        this.nombre = "";
        this.ancho = BigDecimal.ZERO;
        this.alto = BigDecimal.ZERO;
        this.preciocosto = BigDecimal.ZERO;
        this.precioventa = BigDecimal.ZERO;
    }

    public Medida(int id, String nombre, BigDecimal ancho, BigDecimal alto, BigDecimal preciocosto, BigDecimal precioventa) {
        this.id = id;
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.preciocosto = preciocosto;
        this.precioventa = precioventa;
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
     * @return the ancho
     */
    public BigDecimal getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public BigDecimal getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(BigDecimal alto) {
        this.alto = alto;
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