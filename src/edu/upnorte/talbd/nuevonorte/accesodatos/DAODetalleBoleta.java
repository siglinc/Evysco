package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Aviso;
import edu.upnorte.talbd.nuevonorte.entidades.Boleta;
import edu.upnorte.talbd.nuevonorte.entidades.Cliente;
import edu.upnorte.talbd.nuevonorte.entidades.DetalleBoleta;
import edu.upnorte.talbd.nuevonorte.entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAODetalleBoleta {
    private static DAODetalleBoleta instance = null;
    
    private DAODetalleBoleta(){
    }
    public static DAODetalleBoleta getInstance(){
        if(instance == null){
           instance = new DAODetalleBoleta();
        }
        return instance;
    }
    
    public void registrar(DetalleBoleta objDetalleBoleta) {
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement   
            String consulta = "INSERT INTO detalleboleta(idpedido, idaviso, idboleta) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setInt(1, objDetalleBoleta.getIdPedido().getId());
            stmt.setInt(2, objDetalleBoleta.getIdAviso().getId());
            stmt.setInt(3, objDetalleBoleta.getIdBoleta().getId());
            //3. Ejecutar comando SQL  
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<DetalleBoleta> listar() {
        List<DetalleBoleta> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM detalleboleta";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleBoleta objdetalleboleta = new DetalleBoleta();
                objdetalleboleta.setId(rs.getInt("id"));
                
                Pedido p = DAOPedido.getInstance().traer(rs.getInt("idPedido"));
                objdetalleboleta.setIdPedido(p);
                
                Aviso a = DAOAviso.getInstance().traer(rs.getInt("idAviso"));
                objdetalleboleta.setIdAviso(a);
                
                /*Cliente c = DAOCliente.getInstance().traer(rs.getInt("idCliente"));
                objdetalleboleta.setIdCliente(c);*/
                
                Boleta b = DAOBoleta.getInstance().traer(rs.getInt("idBoleta"));
                objdetalleboleta.setIdBoleta(b);
                
                lista.add(objdetalleboleta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }//idpedido, idaviso, idcliente, idboleta
}