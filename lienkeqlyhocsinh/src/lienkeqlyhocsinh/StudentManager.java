/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienkeqlyhocsinh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class StudentManager {
    Connection conn;
    public StudentManager() throws SQLException, ClassNotFoundException{
      DBConnector db = new DBConnector();
      this.conn = db.getConnector();
    }

    
    public boolean login(String email,String pass) throws SQLException{
        String query = "Select*from student Where email= ? and pass= ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        
        ResultSet rs = pstmt.executeQuery();
        return rs.next();
    }
}
