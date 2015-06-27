package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Documento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAODocumento {

    private static DAODocumento instance = null;

    private DAODocumento() {
    }

    public static DAODocumento getInstance() {
        if (instance == null) {
            instance = new DAODocumento();
        }
        return instance;
    }

    public void registrar(Documento objDocumento) {
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO documento(nombre) VALUES(?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1, objDocumento.getNombre());
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean modificar(Documento objDocumento){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE documento SET nombre = ? WHERE id = ? ");
            ps.setString(1, objDocumento.getNombre());
            ps.setInt(2, objDocumento.getId());
            ps.executeUpdate();
            retorno = true;
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }    

    public List<Documento> listar() {
        List<Documento> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM documento ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Documento objDocumento = new Documento();
                objDocumento.setId(rs.getInt("id"));
                objDocumento.setNombre(rs.getString("nombre"));
                lista.add(objDocumento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Documento traer(int idDocumento) {
        Documento objDocumento = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM documento WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idDocumento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objDocumento = new Documento();
                objDocumento.setId(rs.getInt("id"));
                objDocumento.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objDocumento;
    }
}