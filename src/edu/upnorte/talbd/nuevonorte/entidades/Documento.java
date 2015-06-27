package edu.upnorte.talbd.nuevonorte.entidades;

public class Documento {
    private int id;
    private String nombre;

    public Documento() {
        this.id = 0;
        this.nombre = "";
    }

    public Documento(int id, String nombre) {
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
}