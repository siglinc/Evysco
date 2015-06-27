package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

        
public class DAOCategoria {
    private static DAOCategoria instance = null;
    
    private DAOCategoria(){
    }
    public static DAOCategoria getInstance(){
        if(instance == null){
           instance = new DAOCategoria();
        }
        return instance;
    }
    
    public void registrar(Categoria objCategoria){
        try{
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO categoria(nombre) VALUES(?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1,objCategoria.getNombre());
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean modificar(Categoria objCategoria){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE categoria SET nombre = ? WHERE id = ? ");
            ps.setString(1, objCategoria.getNombre());
            ps.setInt(2, objCategoria.getId());
            ps.executeUpdate();
            retorno = true;
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public List<Categoria> listar(){
        List<Categoria> lista = new ArrayList<>();
        try{
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM categoria ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Categoria objCategoria = new Categoria();
                objCategoria.setId(rs.getInt("id"));
                objCategoria.setNombre(rs.getString("nombre"));
                lista.add(objCategoria);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public Categoria traer(int idCategoria) {
        Categoria objCategoria = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM categoria WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idCategoria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objCategoria = new Categoria();
                objCategoria.setId(rs.getInt("id"));
                objCategoria.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objCategoria;
    }   
}