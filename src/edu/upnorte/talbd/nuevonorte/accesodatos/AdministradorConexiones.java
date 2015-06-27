package edu.upnorte.talbd.nuevonorte.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorConexiones {
    
    public static Connection getConexion(){
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conexion = DriverManager.getConnection
                ("jdbc:sqlserver://localhost;databaseName=NuevoNorte", "sa", "123456");
            return conexion;
        }catch(Exception ex){    
            ex.printStackTrace();                       
            return null;
        }
    }
}