package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Aviso;
import edu.upnorte.talbd.nuevonorte.entidades.DetallePedido;
import edu.upnorte.talbd.nuevonorte.entidades.Pedido;
import edu.upnorte.talbd.nuevonorte.entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAODetallePedido {
    private static DAODetallePedido instance = null;
    
    private DAODetallePedido(){
    }
    public static DAODetallePedido getInstance(){
        if(instance == null){
           instance = new DAODetallePedido();
        }
        return instance;
    }

    public void registrar(DetallePedido objdetallep) {
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO detallepedido(idPedido, idProducto,cantidad,subtotal) VALUES(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setObject(1, objdetallep.getIdPedido());
            stmt.setObject(2, objdetallep.getIdProducto());
            stmt.setBigDecimal(3, objdetallep.getCantidad());
            stmt.setBigDecimal(4, objdetallep.getSubtotal());
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<DetallePedido> listar() {
        List<DetallePedido> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM detallepedido ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetallePedido objdetallep = new DetallePedido();
                objdetallep.setId(rs.getInt("id"));
                objdetallep.setCantidad(rs.getBigDecimal("cantidad"));
                objdetallep.setSubtotal(rs.getBigDecimal("subtotal"));
                
                Pedido p = DAOPedido.getInstance().traer(rs.getInt("idPedido"));
                objdetallep.setIdPedido(p);

                Producto pr = DAOProducto.getInstance().traer(rs.getInt("idProducto"));
                objdetallep.setIdProducto(pr);
                
                lista.add(objdetallep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    /*public DetallePedido traer(int idDetallePedido) {
        DetallePedido objdetalle = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM detallepedido WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idDetallePedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objdetalle = new DetallePedido();
                objdetalle.setId(rs.getInt("id"));
                objdetalle.setCantidad(rs.getBigDecimal("cantidad"));
                
                objdetalle.setIdPedido(DAOPedido.getInstance().traer(rs.getInt("idpedido")));
                objdetalle.setIdProducto(DAOProducto.getInstance().traer(rs.getInt("idproducto")));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objdetalle;
    }*/
}