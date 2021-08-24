
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    
    Connection con=null;
    
    
    //CONTRUCTOR: Cuando se crea el objeto realiza la conexion a DB
    public DBConnection(){
        try{
            // 1. Cargar el Driver
            Class.forName("com.mysql.jdbc.Driver");
            //2.Establecer la conexión con la BD
            String url = "jdbc:mysql://localhost:3306/pruebaBACK?characterEncoding=latin1&useConfigs=maxPerformance";//? enviar el parametro de codificar caracteres latinos
            String user = "root";
            String pass = "changeme";
            con = DriverManager.getConnection(url,user,pass);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa con BD", "Conexion", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException e){ //En caso de que no encuentre el driver
            JOptionPane.showMessageDialog(null, "No encontro Clase", "Conexion", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No encontro SQL - error: "+e, "Conexion", JOptionPane.ERROR_MESSAGE);//Imprime el error
        }
    }
    
    public Connection getConnection(){ //Retorno la conexion
        return con;
    }
    
}
