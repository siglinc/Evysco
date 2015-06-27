package edu.upnorte.talbd.nuevonorte.entidades;

public class Cliente {
    private int id;
    private String nombrecom;
    private Documento idDoc;
    private int numerodoc;

    public Cliente() {
        this.id = 0;
        this.nombrecom = "";
        this.idDoc = new Documento();
        this.numerodoc = 0;
    }

    public Cliente(int id, String nombrecom, Documento idDoc, int numerodoc) {
        this.id = id;
        this.nombrecom = nombrecom;
        this.idDoc = idDoc;
        this.numerodoc = numerodoc;
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
     * @return the nombrecom
     */
    public String getNombrecom() {
        return nombrecom;
    }

    /**
     * @param nombrecom the nombrecom to set
     */
    public void setNombrecom(String nombrecom) {
        this.nombrecom = nombrecom;
    }

    /**
     * @return the idDoc
     */
    public Documento getIdDoc() {
        return idDoc;
    }

    /**
     * @param idDoc the idDoc to set
     */
    public void setIdDoc(Documento idDoc) {
        this.idDoc = idDoc;
    }

    /**
     * @return the numerodoc
     */
    public int getNumerodoc() {
        return numerodoc;
    }

    /**
     * @param numerodoc the numerodoc to set
     */
    public void setNumerodoc(int numerodoc) {
        this.numerodoc = numerodoc;
    }
}