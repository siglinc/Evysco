package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Cliente;
import edu.upnorte.talbd.nuevonorte.entidades.Documento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOCliente {
      private static DAOCliente instance = null;

    private DAOCliente() {
    }

    public static DAOCliente getInstance() {
        if (instance == null) {
            instance = new DAOCliente();
        }
        return instance;
    }

    public void registrar(Cliente objCliente) {
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement   
            String consulta = "INSERT INTO cliente(nombrecom, iddoc,numerodoc) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1, objCliente.getNombrecom());
            stmt.setInt(2, objCliente.getIdDoc().getId());
            stmt.setInt(3, objCliente.getNumerodoc());
            //3. Ejecutar comando SQL  
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    public boolean modificar(Cliente objCliente){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE producto SET nombrecom = ?, iddoc = ?, numerodoc = ? WHERE id = ? ");
            ps.setString(1, objCliente.getNombrecom());
            ps.setInt(2, objCliente.getIdDoc().getId());
            ps.setInt(3, objCliente.getNumerodoc());
            ps.setInt(4, objCliente.getId());
            
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
    
    
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM cliente ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente objCliente = new Cliente();
                objCliente.setId(rs.getInt("id"));
                objCliente.setNombrecom(rs.getString("nombrecom"));
                objCliente.setNumerodoc(rs.getInt("numerodoc"));
                
                Documento d = DAODocumento.getInstance().traer(rs.getInt("idDoc"));
                objCliente.setIdDoc(d);
               
                lista.add(objCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public Cliente traer(int idCliente) {
        Cliente objCliente = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM cliente WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objCliente = new Cliente();
                objCliente.setId(rs.getInt("id"));
                objCliente.setNombrecom(rs.getString("nombrecom"));
                objCliente.setIdDoc(DAODocumento.getInstance().traer(rs.getInt("iddoc")));
                objCliente.setNumerodoc(rs.getInt("numerodoc"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objCliente;
    }
}