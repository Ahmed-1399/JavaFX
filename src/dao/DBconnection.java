package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBconnection {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private static final String URL = "jdbc:mysql://localhost:3306/java?zeroDateTimeBehavior=convertToNull";
    private static Connection connection = null;

    // Connection With DataBaseConnection
    public static Connection connect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(
                     URL, USERNAME, PASSWORD); 
      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         return connection;
    }}
