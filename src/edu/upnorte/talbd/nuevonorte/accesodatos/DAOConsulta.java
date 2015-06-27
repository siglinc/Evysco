package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Boleta;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class DAOConsulta {
    
    private static DAOConsulta instance = null;
    private DAOConsulta(){
    }
    public static DAOConsulta getInstance(){
        if(instance == null){
           instance = new DAOConsulta();
        }
        return instance;
    }
    
    
    
    public void ventas(Boleta objBoleta){
        try{
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            
            String consulta = "SELECT ";
            //String consulta = "INSERT INTO aviso(id,precio,fecha,idmedida,idcolor,idcategoria,idpagina) VALUES(seq_idaviso.NEXTVAL,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta); 
            
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    
}
