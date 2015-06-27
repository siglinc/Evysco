package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;


public class Pagina {
    private int id;
    private String nombre;
    private BigDecimal precio;

    public Pagina() {
        this.id = 0;
        this.nombre = "";
        this.precio = BigDecimal.ZERO;
    }

    public Pagina(int id, String nombre, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
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
     * @return the precio
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}