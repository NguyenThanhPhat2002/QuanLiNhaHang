/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.Admin;

/**
 *
 * @author Duc Thanh
 */
public class ConnectionDB {

    public static Connection getConnection() throws FileNotFoundException,
            ClassNotFoundException, IOException, SQLException 
    {
        Connection conn  ;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Admin ad = IOFileObject.readFile("src/controller/AD.DAT");
//        String url = "jdbc:mysql://"
//                + ad.getSqlHostName() + ":"
//                + ad.getSqlPort() + "/"
//                + ad.getSqlDatabase() + "?allowPublicKeyRetrieval=true&useSSL=false";
        String url = "jdbc:mysql://localhost:3306/nha_hang_db";
        String user = "root";
        String password = "123456789";
      
        conn = DriverManager.getConnection(url, user, password);
//        System.out.println("Connected to the database.");
        return conn;
       
        
//        conn = DriverManager.getConnection(url, ad.getSqlUser(), ad.getSqlPassword());
        
    }
   
}
