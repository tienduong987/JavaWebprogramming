/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Administrator
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
            Connection conn = DriverManager.getConnection(connStr, "root", "0969209921");

            if (conn != null) {
                System.out.println("Ket noi thanh cong");
                System.out.println("------------------");
                Statement stml = conn.createStatement();              
                ResultSet rs = stmt.executeQuery("SELECT * FROM SACH");
          } else {
                System.out.println("Ket noi that bai");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); 
    }
    }  
}
