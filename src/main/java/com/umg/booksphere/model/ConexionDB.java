
package com.umg.booksphere.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Alfredo
 */
public class ConexionDB {
    // variables de entorno 
    private static final String URL= "";
    private static final String USER ="";
    private static final String PASS ="";
    
    
    private static Connection con;
    
    public static Connection getConexion(){
    try{
        if(con == null || con.isClosed()){
        con = DriverManager.getConnection(URL,USER,PASS);
        System.out.println("Conexión exitosa a la base de datos.");
        }
    }catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
        return con;   
    }
   
    public static void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("🔌 Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("⚠️ Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
