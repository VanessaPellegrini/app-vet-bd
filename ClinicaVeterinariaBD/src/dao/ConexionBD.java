/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vanes
 */
public class ConexionBD {
    private static String uri = "jdbc:mysql://localhost:3306/clinicaveterinariabd";
    private static String user = "root";
    private static String pass = "123456";
    private static Connection conn = null;
    
    public static Connection getConexion() {
    
        try {
            if(conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(uri, user, pass);
                System.out.println("Conectado a la BD");
            }
            return conn;
        }
        catch(SQLException error) {
            System.err.println("SQLExcepción en ConexionBD.getConexion: " + error);
            return null;
        }
        catch(Exception error) {
            System.err.println("Excepción en ConexionBD.getConexion: " + error);
            return null;
        }
    }
}
