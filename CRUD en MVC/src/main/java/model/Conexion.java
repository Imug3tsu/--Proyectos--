
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static Connection con;
    public Connection Conectar(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pablo","root","udpatewey5");
            System.out.println("Conexion exitosa!");
        }catch(SQLException e){
             System.out.println(e.getMessage());
        }
        return con;
    }
    
}
