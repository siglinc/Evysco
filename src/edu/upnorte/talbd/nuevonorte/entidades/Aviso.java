package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;
import java.util.Date;


public class Aviso {
    private int id;
    private BigDecimal precio;
    private Date fecha;
    private Medida idMedida;
    private Color idColor;
    private Categoria idCategoria;
    private Pagina idPagina;

    public Aviso() {
        this.id = 0;
        this.precio = BigDecimal.ZERO;
        this.fecha = new Date();
        this.idMedida = new Medida();
        this.idColor = new Color();
        this.idCategoria = new Categoria();
        this.idPagina = new Pagina();
    }

    public Aviso(int id, BigDecimal precio, Date fecha, Medida idMedida, Color idColor, Categoria idCategoria, Pagina idPagina) {
        this.id = id;
        this.precio = precio;
        this.fecha = fecha;
        this.idMedida = idMedida;
        this.idColor = idColor;
        this.idCategoria = idCategoria;
        this.idPagina = idPagina;
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

    /**
     * @return the idMedida
     */
    public Medida getIdMedida() {
        return idMedida;
    }

    /**
     * @param idMedida the idMedida to set
     */
    public void setIdMedida(Medida idMedida) {
        this.idMedida = idMedida;
    }

    /**
     * @return the idColor
     */
    public Color getIdColor() {
        return idColor;
    }

    /**
     * @param idColor the idColor to set
     */
    public void setIdColor(Color idColor) {
        this.idColor = idColor;
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
     * @return the idPagina
     */
    public Pagina getIdPagina() {
        return idPagina;
    }

    /**
     * @param idPagina the idPagina to set
     */
    public void setIdPagina(Pagina idPagina) {
        this.idPagina = idPagina;
    }
}