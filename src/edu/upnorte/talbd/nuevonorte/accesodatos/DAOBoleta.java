package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Aviso;
import edu.upnorte.talbd.nuevonorte.entidades.Boleta;
import edu.upnorte.talbd.nuevonorte.entidades.Cliente;
import edu.upnorte.talbd.nuevonorte.entidades.DetallePedido;
import edu.upnorte.talbd.nuevonorte.entidades.Documento;
import edu.upnorte.talbd.nuevonorte.entidades.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOBoleta {
    private static DAOBoleta instance = null;

    private DAOBoleta(){
    }
    public static DAOBoleta getInstance(){
        if(instance == null){
           instance = new DAOBoleta();
        }
        return instance;
    }

    public void registrar(Boleta objBoleta) {
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO boleta(rucemp, fecha, igv,idcliente) VALUES(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setBigDecimal(1, objBoleta.getRucemp());
            stmt.setDate(2, new Date(objBoleta.getFecha().getTime()) );
            stmt.setBigDecimal(3, objBoleta.getIgv());
            stmt.setInt(4, objBoleta.getIdCliente().getId());

            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            
            List<Boleta> lst = listar();            
            for (Boleta boleta : lst) {
                //System.out.println(boleta.getFecha().getTime() +"=="+ objBoleta.getFecha().getTime());
                if(boleta.getIdCliente().getId() == objBoleta.getIdCliente().getId()){
                    //if(boleta.getRucemp() == objBoleta.getRucemp())                   
                        //if(boleta.getIgv() == objBoleta.getIgv())                    
                            objBoleta.setId(boleta.getId());
                            System.out.println("Entro");
                }
            }
            
            for (Aviso aviso : objBoleta.getAvisos()) {
                //String consulta1 = "INSERT INTO detalleboleta(id,idboleta, idpedido, idaviso) VALUES(seq_iddetalleboleta.NEXTVAL,seq_idboleta.CURRVAL,NULL,?)";
                String consulta1 = "INSERT INTO detalleboleta(id,idboleta, idpedido, idaviso) VALUES(seq_iddetalleboleta.NEXTVAL,?,NULL,?)";
                PreparedStatement stmt2 = con.prepareStatement(consulta1);
                stmt2.setInt(1, objBoleta.getId());
                stmt2.setInt(2, aviso.getId());
                //3. Ejecutar comando SQL  
                stmt2.executeUpdate();
                stmt2.close();
            }
            
            for (Pedido pedido : objBoleta.getPedidos()) {
                //String consulta1 = "INSERT INTO detalleboleta(id, idboleta, idpedido, idaviso) VALUES(seq_iddetalleboleta.NEXTVAL,seq_idboleta.CURRVAL,?,NULL)";
                String consulta1 = "INSERT INTO detalleboleta(id, idboleta, idpedido, idaviso) VALUES(seq_iddetalleboleta.NEXTVAL,?,?,NULL)";
                PreparedStatement stmt2 = con.prepareStatement(consulta1);
                stmt2.setInt(1, objBoleta.getId());
                stmt2.setInt(2, pedido.getId());
                //3. Ejecutar comando SQL  
                stmt2.executeUpdate();
                stmt2.close();
            }
            
            
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Boleta> listar() {
        List<Boleta> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM boleta ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Boleta objBoleta = new Boleta();
                objBoleta.setId(rs.getInt("id"));
                objBoleta.setRucemp(rs.getBigDecimal("rucemp"));
                objBoleta.setFecha(rs.getDate("fecha"));
                objBoleta.setIgv(rs.getBigDecimal("igv"));

                Cliente c = DAOCliente.getInstance().traer(rs.getInt("idCliente"));
                objBoleta.setIdCliente(c);
                /*
                DetallePedido dp = DAODetallePedido.getInstance().traer(rs.getInt("idCliente"));
                
                Documento d = DAODocumento.getInstance().traer(rs.getInt("idDocumento"));
                objBoleta.setIdDocumento(d);
                
                Pedido p = DAOPedido.getInstance().traer(rs.getInt("idPedido"));
                objBoleta.setIdPedido(p);
                */
                
                lista.add(objBoleta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
    public Boleta traer(int idBoleta) {
        Boleta objBoleta = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM boleta WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idBoleta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objBoleta = new Boleta();
                objBoleta.setId(rs.getInt("id"));
                objBoleta.setRucemp(rs.getBigDecimal("rucemp"));
                objBoleta.setFecha(rs.getDate("fecha"));
                objBoleta.setIgv(rs.getBigDecimal("igv"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objBoleta;
    }
}