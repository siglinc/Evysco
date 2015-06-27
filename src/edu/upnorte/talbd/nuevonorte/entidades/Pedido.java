package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class Pedido {
    private int id;
    private Date fecha;
    private String serie;
    private BigDecimal total;
    private List<DetallePedido> detalle;
    
    public Pedido() {
        this.id = 0;
        this.fecha = new Date();
        this.serie = "";
        this.total = BigDecimal.ZERO;
    }

    public Pedido(int id, Date fecha, String serie, BigDecimal total) {
        this.id = id;
        this.fecha = fecha;
        this.serie = serie;
        this.total = total;
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
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }  

    /**
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }    

    public List<DetallePedido> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetallePedido> detalle) {
        this.detalle = detalle;
    }
    
    
}