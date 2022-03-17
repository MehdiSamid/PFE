/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionstock;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author intel
 */
public class service {
    
    public static void main( String[] a ){
        getcon();
    }
    
    public static Connection getcon(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pfe","123");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(service.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
}
}