package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Aviso;
import edu.upnorte.talbd.nuevonorte.entidades.Categoria;
import edu.upnorte.talbd.nuevonorte.entidades.Color;
import edu.upnorte.talbd.nuevonorte.entidades.Medida;
import edu.upnorte.talbd.nuevonorte.entidades.Pagina;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOAviso {

    private static DAOAviso instance = null;
    
    private DAOAviso(){
    }
    public static DAOAviso getInstance(){
        if(instance == null){
           instance = new DAOAviso();
        }
        return instance;
    }
    
    public void registrar(Aviso objAviso){
        try{
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO aviso(precio,fecha,idmedida,idcolor,idcategoria,idpagina) VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta); 
            stmt.setBigDecimal(1,objAviso.getPrecio());
            stmt.setDate(2, new Date(objAviso.getFecha().getTime()));
            //stmt.setDate(2, (Date) objAviso.getFecha());
            stmt.setObject(3, objAviso.getIdMedida().getId());
            stmt.setObject(4, objAviso.getIdColor().getId());
            stmt.setObject(5, objAviso.getIdCategoria().getId());
            stmt.setObject(6, objAviso.getIdPagina().getId());
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<Aviso> listar() {
        List<Aviso> lista = new ArrayList<>();
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM aviso ";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Aviso objAviso = new Aviso();
                objAviso.setId(rs.getInt("id"));
                objAviso.setPrecio(rs.getBigDecimal("precio"));
                objAviso.setFecha(rs.getDate("fecha"));
                
                Medida m = DAOMedida.getInstance().traer(rs.getInt("idmedida"));
                objAviso.setIdMedida(m);

                Color c = DAOColor.getInstance().traer(rs.getInt("idcolor"));
                objAviso.setIdColor(c);

                Categoria cat = DAOCategoria.getInstance().traer(rs.getInt("idcategoria"));
                objAviso.setIdCategoria(cat);

                Pagina p = DAOPagina.getInstance().traer(rs.getInt("idpagina"));
                objAviso.setIdPagina(p);
                
                lista.add(objAviso);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
    public boolean modificar(Aviso objAviso){
        boolean retorno = false;
        try{
            Connection con = AdministradorConexiones.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE aviso SET precio = ?, fecha = ?, idmedida = ?, idcolor = ?, idcategoria = ?, idpagina = ? WHERE id = ? ");
            ps.setBigDecimal(1, objAviso.getPrecio());
            ps.setDate(2, new Date(objAviso.getFecha().getTime()));
            ps.setInt(3, objAviso.getIdMedida().getId());
            ps.setInt(4, objAviso.getIdColor().getId());
            ps.setInt(5, objAviso.getIdCategoria().getId());
            ps.setInt(6, objAviso.getIdPagina().getId());
            ps.setInt(7, objAviso.getId());
            ps.executeUpdate();
            retorno = true;
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
    

    public Aviso traer(int idAviso) {
        Aviso objAviso = null;
        try {
            Connection con = AdministradorConexiones.getConexion();
            String consulta = "SELECT * FROM aviso WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idAviso);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objAviso = new Aviso();
                objAviso.setId(rs.getInt("id"));
                objAviso.setPrecio(rs.getBigDecimal("precio"));
                objAviso.setFecha(rs.getDate("fecha"));

                objAviso.setIdMedida(DAOMedida.getInstance().traer(rs.getInt("idmedida")));
                objAviso.setIdColor(DAOColor.getInstance().traer(rs.getInt("idcolor")));
                objAviso.setIdCategoria(DAOCategoria.getInstance().traer(rs.getInt("idcategoria")));
                objAviso.setIdPagina(DAOPagina.getInstance().traer(rs.getInt("idpagina")));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objAviso;
    }
}