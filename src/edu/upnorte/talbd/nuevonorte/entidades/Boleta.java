package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Boleta {
    private int id;
    private BigDecimal rucemp;
    private Date fecha;
    private BigDecimal igv;
    private Cliente idCliente;
    private List<Pedido> pedidos = new ArrayList<Pedido>();
    private List<Aviso> avisos = new ArrayList<Aviso>();

    public Boleta() {
        this.id = 0;
        this.rucemp = BigDecimal.ZERO;
        this.fecha = new Date();
        this.igv = BigDecimal.ZERO;
        this.idCliente = new Cliente();
    }

    public Boleta(int id, BigDecimal rucemp, Date fecha, BigDecimal igv,Cliente idCliente) {
        this.id = id;
        this.rucemp = rucemp;
        this.fecha = fecha;
        this.igv = igv;
        this.idCliente = idCliente;
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
     * @return the rucemp
     */
    public BigDecimal getRucemp() {
        return rucemp;
    }

    /**
     * @param rucemp the rucemp to set
     */
    public void setRucemp(BigDecimal rucemp) {
        this.rucemp = rucemp;
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
     * @return the igv
     */
    public BigDecimal getIgv() {
        return igv;
    }

    /**
     * @param igv the igv to set
     */
    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    /**
     * @return the idCliente
     */
    public Cliente getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Aviso> getAvisos() {
        return avisos;
    }

    public void setAvisos(List<Aviso> avisos) {
        this.avisos = avisos;
    }
    
    
}