package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Categoria;
import edu.upnorte.talbd.nuevonorte.entidades.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOProducto {
    private static DAOProducto instance = null;
    
    private DAOProducto(){
    }
    public static DAOProducto getInstance(){
        if(instance == null){
           instance = new DAOProducto();
        }
        return instance;
    }
    
    public void registrar(Producto objProducto) {
        //boolean retorno = false;
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement   
            String consulta = "INSERT INTO producto(idcategoria, precioventa, preciocosto, fecha) VALUES(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setInt(1, objProducto.getIdCategoria().getId());
            stmt.setBigDecimal(2, objProducto.getPrecioventa());
            stmt.setBigDecimal(3, objProducto.getPreciocosto());
            stmt.setDate(4, new Date(objProducto.getFecha().getTime()));
            
            //3. Ejecutar comando SQL  
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
            //retorno = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return retorno;
    }
    
    public boolean modificar(Producto objProducto){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE producto SET precioventa = ?, preciocosto = ?, fecha = ?,idcategoria = ? WHERE id = ? ");
            ps.setBigDecimal(1, objProducto.getPrecioventa());
            ps.setBigDecimal(2, objProducto.getPreciocosto());
            ps.setDate(3, new Date(objProducto.getFecha().getTime()) );
            ps.setInt(4, objProducto.getIdCategoria().getId());
            ps.setInt(5, objProducto.getId());
            
            //ps.setInt(2, objDocumento.getId());
            ps.executeUpdate();
            retorno = true;
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return retorno;
    }
    
    
    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM producto ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto objProducto = new Producto();
                objProducto.setId(rs.getInt("id"));
                objProducto.setPrecioventa(rs.getBigDecimal("precioventa"));
                objProducto.setPreciocosto(rs.getBigDecimal("preciocosto"));
                objProducto.setFecha(rs.getDate("fecha"));
                
                Categoria c = DAOCategoria.getInstance().traer(rs.getInt("idcategoria"));
                objProducto.setIdCategoria(c);
                
                lista.add(objProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Producto traer(int idProducto) {
        Producto objProducto = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM producto WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objProducto = new Producto();
                objProducto.setId(rs.getInt("id"));
                objProducto.setIdCategoria(DAOCategoria.getInstance().traer(rs.getInt("idcategoria")));
                objProducto.setPrecioventa(rs.getBigDecimal("precioventa"));
                objProducto.setPreciocosto(rs.getBigDecimal("preciocosto"));
                objProducto.setFecha(rs.getDate("fecha"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objProducto;
    }
}