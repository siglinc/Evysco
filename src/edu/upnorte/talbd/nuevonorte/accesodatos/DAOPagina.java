package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Pagina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPagina {
    private static DAOPagina instance = null;
    
    private DAOPagina(){
    }
    public static DAOPagina getInstance(){
        if(instance == null){
           instance = new DAOPagina();
        }
        return instance;
    }
    
    public void registrar(Pagina objPagina){
        try{
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO pagina(nombre,precio) VALUES(?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1,objPagina.getNombre());
            stmt.setBigDecimal(2,objPagina.getPrecio());
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean modificar(Pagina objPagina){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE pagina SET nombre = ?, precio = ? WHERE id = ? ");
            ps.setString(1, objPagina.getNombre());
            ps.setBigDecimal(2, objPagina.getPrecio());
            ps.setInt(3, objPagina.getId());
            ps.executeUpdate();
            retorno = true;
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    
    public List<Pagina> listar(){
        List<Pagina> lista = new ArrayList<>();
        try{
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM pagina ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pagina objCategoria = new Pagina();
                objCategoria.setId(rs.getInt("id"));
                objCategoria.setNombre(rs.getString("nombre"));
                objCategoria.setPrecio(rs.getBigDecimal("precio"));
                lista.add(objCategoria);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public Pagina traer(int idPagina) {
        Pagina objPagina = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM pagina WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idPagina);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objPagina = new Pagina();
                objPagina.setId(rs.getInt("id"));
                objPagina.setNombre(rs.getString("nombre"));
                objPagina.setPrecio(rs.getBigDecimal("precio"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objPagina;
    } 
}