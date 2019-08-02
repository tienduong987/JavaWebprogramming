
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DBConnector {
    /**
     *
     * @return 
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public Connection getConnector1() throws ClassNotFoundException, SQLException{
           Class.forName("com.mysql.cj.jdbc.Driver");
           String connStr ="jdbc:mysql://localhost:3306/dulieusinhvien";
        Connection conn = DriverManager.getConnection(connStr,"roat","0969209921");
        return conn;
      
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}