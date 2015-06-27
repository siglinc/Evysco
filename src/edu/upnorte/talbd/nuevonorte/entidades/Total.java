package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;

public class Total {
    private int id;
    private BigDecimal total;
    private Boleta idBoleta;

    public Total() {
        this.id = 0;
        this.total = BigDecimal.ZERO;
        this.idBoleta = new Boleta();
    }

    public Total(int id, BigDecimal total,Boleta idBoleta) {
        this.id = id;
        this.total = total;
        this.idBoleta = idBoleta;
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

    /**
     * @return the idBoleta
     */
    public Boleta getIdBoleta() {
        return idBoleta;
    }

    /**
     * @param idBoleta the idBoleta to set
     */
    public void setIdBoleta(Boleta idBoleta) {
        this.idBoleta = idBoleta;
    }
}