package edu.upnorte.talbd.nuevonorte.entidades;

public class DetalleBoleta {
    private int id;
    private Pedido idPedido;
    private Aviso idAviso;
    private Boleta idBoleta;
  
    
    public DetalleBoleta() {
        this.id = 0;
        this.idPedido = new Pedido();
        this.idAviso = new Aviso();
        this.idBoleta = new Boleta();
       
    }

    public DetalleBoleta(int id, Pedido idPedido, Aviso idAviso, Boleta idBoleta, Cliente idCliente) {
        this.id = id;
        this.idPedido = idPedido;
        this.idAviso = idAviso;
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
     * @return the idAviso
     */
    public Aviso getIdAviso() {
        return idAviso;
    }

    /**
     * @param idAviso the idAviso to set
     */
    public void setIdAviso(Aviso idAviso) {
        this.idAviso = idAviso;
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