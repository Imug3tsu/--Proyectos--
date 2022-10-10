
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Modelo extends Conexion{
    
    static PreparedStatement ps;
    static ResultSet rs;
    static Connection con;
    
    public boolean Añadir(Gatos p){
        try{
            con=Conectar();
            ps=con.prepareStatement("insert into gatitos(nombre,color,años,sexo,clave)values(?,?,?,?,?)");
            ps.setString(1,p.getNombre());
            ps.setString(2,p.getColor());
            ps.setInt(3,p.getAños());
            ps.setString(4,p.getSexo());
            ps.setInt(5,p.getClave());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean Modifficar(Gatos p){
        try{
            con=Conectar();
            ps=con.prepareStatement("update gatitos set nombre=?,color=?,años=?,sexo=?,clave=? where id=?");
            ps.setString(1,p.getNombre());
            ps.setString(2,p.getColor());
            ps.setInt(3,p.getAños());
            ps.setString(4,p.getSexo());
            ps.setInt(5,p.getClave());
            ps.setString(6,p.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean Eliminar(Gatos p){
        try{
            con=Conectar();
            ps=con.prepareStatement("delete from gatitos where id=?");
            ps.setString(1,p.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean Buscar(Gatos p){
        try{
            con=Conectar();
            ps=con.prepareStatement("select*from gatitos where clave=?");
            ps.setInt(1,p.getClave());
            rs=ps.executeQuery();
            if (rs.next()){
                p.setNombre(rs.getString("nombre"));
                p.setColor(rs.getString("color"));
                p.setAños(rs.getInt("años"));
                p.setSexo(rs.getString("sexo"));
                p.setId(rs.getString("id"));   
            }
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
