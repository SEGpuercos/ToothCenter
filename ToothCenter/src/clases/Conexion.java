
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    public java.sql.Connection cn;
    public Connection getConection(){        
        direction dir = new direction();
        dir.readTxt("C:\\dir.ini");
        String dbURL="jdbc:ucanaccess://"+dir.getDir();
        try {
            cn=DriverManager.getConnection(dbURL,"","");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
}
