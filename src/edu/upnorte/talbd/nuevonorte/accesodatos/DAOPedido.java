package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.DetallePedido;
import edu.upnorte.talbd.nuevonorte.entidades.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPedido { 
    private static DAOPedido instance = null;
    
    private DAOPedido(){
    }
    public static DAOPedido getInstance(){
        if(instance == null){
           instance = new DAOPedido();
        }
        return instance;
    }
    
    
    public void registrar(Pedido objPedido) {
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement   
            String consulta = "INSERT INTO pedido(fecha, serie, total) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setDate(1, new Date(objPedido.getFecha().getTime()));
            stmt.setString(2, objPedido.getSerie());
            stmt.setBigDecimal(3, objPedido.getTotal());
            //3. Ejecutar comando SQL  
            stmt.executeUpdate();
            
            for (DetallePedido objdetallep : objPedido.getDetalle()) {
                String consulta2 = "INSERT INTO detallepedido(idProducto,cantidad,subtotal) VALUES(?,?,?)";
                PreparedStatement stmt2 = con.prepareStatement(consulta2);
                //stmt2.setObject(1, objdetallep.getIdPedido());
                stmt2.setInt(1, objdetallep.getIdProducto().getId());
                stmt2.setBigDecimal(2, objdetallep.getCantidad());
                stmt2.setBigDecimal(3, objdetallep.getSubtotal());
                //3. Ejecutar comando SQL
                stmt2.executeUpdate();
                stmt.close();
            }
            
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Pedido> listar() {
        List<Pedido> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM pedido ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido objPedido = new Pedido();
                objPedido.setId(rs.getInt("id"));
                objPedido.setFecha(rs.getDate("fecha"));
                objPedido.setSerie(rs.getString("serie"));
               objPedido.setTotal(rs.getBigDecimal("total"));
                lista.add(objPedido);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }


    public Pedido traer(int idPedido) {
        Pedido objPedido = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM pedido WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objPedido = new Pedido();
                objPedido.setId(rs.getInt("id"));
                objPedido.setFecha(rs.getDate("fecha"));
                objPedido.setSerie(rs.getString("serie"));
                objPedido.setTotal(rs.getBigDecimal("total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objPedido;
    }
}