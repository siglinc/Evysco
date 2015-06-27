package edu.upnorte.talbd.nuevonorte.accesodatos;

import edu.upnorte.talbd.nuevonorte.entidades.Total;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAOTotal {
    private static DAOTotal instance = null;
    
    private DAOTotal(){
    }
    public static DAOTotal getInstance(){
        if(instance == null){
           instance = new DAOTotal();
        }
        return instance;
    }
    
    public void registrar(Total objTotal) {
        try {
            //1. Crear conexion
            Connection con = AdministradorConexiones.getConexion();
            //2. Crear Statement
            String consulta = "INSERT INTO total(total, idBoleta) VALUES(?,?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setBigDecimal(1, objTotal.getTotal());
            stmt.setInt(2, objTotal.getIdBoleta().getId());
            //3. Ejecutar comando SQL
            stmt.executeUpdate();
            //5. Cerrar conexion
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
