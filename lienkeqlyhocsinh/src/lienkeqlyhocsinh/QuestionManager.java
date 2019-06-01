/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienkeqlyhocsinh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class QuestionManager {
    private Connection conn = null;
    public QuestionManager() {
      this.conn = new DBConnector().getConnect();
    }
        public List<Question> getQuestions() throws SQLException{
    //1. ket noi db   
       //2. tao cau truy van query
        String query ="SELECT*FROM questions";
    //3. thuc thi cau truy van query
        Statement stmt= this.conn.createStatement();
        ResultSet rs = stmt.executeQuery( query);
        //4. duyet ket qu vaf add vao list
        List <Question> list = new ArrayList<>();
        while (rs.next()){
           Question q = new Question();
           q.setId (rs.getString("id"));
           q.setContent(rs.getString("content"));
           q.setContent(rs.getString("answer_a"));
           q.setContent(rs.getString("answer_b"));
           q.setContent(rs.getString("answer_c"));
           q.setContent(rs.getString("answer_d"));
           q.setContent(rs.getString("correct"));
           list.add(q);
           
        }
    return list;
}
}

