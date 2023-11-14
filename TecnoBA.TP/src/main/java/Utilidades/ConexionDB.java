/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author _mrodriguezb
 */
public class ConexionDB {
 
    public static Connection getConexion() {
        Connection cnx = null;
        try {
          //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           // cnx = DriverManager.getConnection("jdbc:sqlserver://MARB:1433;databaseName=BD_CitasMedicas;user:sa;password=cenizo");
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecnoba?useSSL=false","root","Escorpio2022.");
            

        } catch (Exception e) {
            System.out.println(""+e.toString());
        }
        return cnx;
    }

}
