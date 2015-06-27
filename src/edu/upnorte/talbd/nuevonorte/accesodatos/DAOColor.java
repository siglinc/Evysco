package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Color;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOColor {
    private static DAOColor instance = null;
    
    private DAOColor(){
    }
    public static DAOColor getInstance(){
        if(instance == null){
           instance = new DAOColor();
        }
        return instance;
    }
    public void registrar(Color objColor){
        try{
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO color(nombre,preciocosto,precioventa) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1,objColor.getNombre());
            stmt.setBigDecimal(2,objColor.getPreciocosto());
            stmt.setBigDecimal(3,objColor.getPrecioventa());
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean modificar(Color objColor){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE color SET nombre = ?, preciocosto = ?, precioventa = ? WHERE id = ? ");
            ps.setString(1, objColor.getNombre());
            ps.setBigDecimal(2, objColor.getPreciocosto());
            ps.setBigDecimal(3, objColor.getPrecioventa());
            ps.setInt(4, objColor.getId());
            ps.executeUpdate();
            retorno = true;
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public List<Color> listar(){
        List<Color> lista = new ArrayList<>();
        try{
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM color ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Color objColor = new Color();
                objColor.setId(rs.getInt("id"));
                objColor.setNombre(rs.getString("nombre"));
                objColor.setPreciocosto(rs.getBigDecimal("preciocosto"));
                objColor.setPrecioventa(rs.getBigDecimal("precioventa"));
                lista.add(objColor);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public Color traer(int idColor) {
        Color objColor = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM color WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idColor);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objColor = new Color();
                objColor.setId(rs.getInt("id"));
                objColor.setNombre(rs.getString("nombre"));
                objColor.setPreciocosto(rs.getBigDecimal("preciocosto"));
                objColor.setPrecioventa(rs.getBigDecimal("precioventa"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objColor;
    }
}