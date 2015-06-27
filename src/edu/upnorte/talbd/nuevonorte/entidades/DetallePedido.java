package edu.upnorte.talbd.nuevonorte.entidades;

import java.math.BigDecimal;

public class DetallePedido {
    private int id;
    private Pedido idPedido;
    private Producto idProducto;
    private BigDecimal cantidad;
    private BigDecimal subtotal;

    public DetallePedido() {
        this.id = 0;
        this.idPedido = new Pedido();
        this.idProducto = new Producto();
        this.cantidad = BigDecimal.ZERO;
        this.subtotal = BigDecimal.ZERO;
    }

    public DetallePedido(int id, Pedido idPedido, Producto idProducto, BigDecimal cantidad, BigDecimal subtotal) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
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
     * @return the idPedido
     */
    public Pedido getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the idProducto
     */
    public Producto getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the cantidad
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the subtotal
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}