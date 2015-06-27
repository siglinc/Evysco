package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Medida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOMedida {

    private static DAOMedida instance = null;
    
    private DAOMedida(){
    }
    public static DAOMedida getInstance(){
        if(instance == null){
           instance = new DAOMedida();
        }
        return instance;
    }
    
    public void registrar(Medida objMedida){
        try{
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO medida(nombre,ancho,alto,precioventa,preciocosto) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta); 
            stmt.setString(1,objMedida.getNombre());
            stmt.setBigDecimal(2,objMedida.getAncho());
            stmt.setBigDecimal(3,objMedida.getAlto());
            stmt.setBigDecimal(4,objMedida.getPrecioventa());
            stmt.setBigDecimal(5,objMedida.getPreciocosto());
            
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean modificar(Medida objMedida){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE medida SET nombre = ?, ancho = ?, alto = ?, precioventa = ?, preciocosto = ? WHERE id = ? ");
            ps.setString(1, objMedida.getNombre());
            ps.setBigDecimal(2, objMedida.getAncho());
            ps.setBigDecimal(3, objMedida.getAlto());
            ps.setBigDecimal(4, objMedida.getPrecioventa());
            ps.setBigDecimal(5, objMedida.getPreciocosto());
            ps.setInt(6, objMedida.getId());
            
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
    
    
    public List<Medida> listar(){
        List<Medida> lista = new ArrayList<>();
        try{
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM medida ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Medida objMedida = new Medida();
                objMedida.setId(rs.getInt("id"));
                objMedida.setNombre(rs.getString("nombre"));
                objMedida.setAncho(rs.getBigDecimal("ancho"));
                objMedida.setAlto(rs.getBigDecimal("alto"));
                objMedida.setPrecioventa(rs.getBigDecimal("precioventa"));
                objMedida.setPreciocosto(rs.getBigDecimal("preciocosto"));
                lista.add(objMedida);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public Medida traer(int idMedida) {
        Medida objMedida = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM medida WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idMedida);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objMedida = new Medida();
                objMedida.setId(rs.getInt("id"));
                objMedida.setNombre(rs.getString("nombre"));
                objMedida.setAncho(rs.getBigDecimal("ancho"));
                objMedida.setAlto(rs.getBigDecimal("alto"));
                objMedida.setPreciocosto(rs.getBigDecimal("preciocosto"));
                objMedida.setPrecioventa(rs.getBigDecimal("precioventa"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objMedida;
    }
}