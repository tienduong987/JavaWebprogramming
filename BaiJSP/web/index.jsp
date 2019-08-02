<%-- 
    Document   : newjsp
    Created on : Aug 2, 2019, 11:59:31 PM
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <h1>Danh sách sinh viên</h1>
        <table class="table table-dark table-striped">
            <tr>
                <th>ID</th>
                <th>Họ và Tên</th>
                <th>Khoa</th>
                <th>Lớp</th>
            </tr>
        <%
            StudentModel model = new StudentModel();
            List<Student> students = model.getStudents();
            
            for (Student stud : students) { %>
            <tr>
                <td> <%= stud.getId() %> </td>
                <td> <%= stud.getHoten() %> </td>
                <td> <%= stud.getKhoa() %> </td>
                <td> <%= stud.getLop() %> </td>
            </tr>        
        <% } %>
        </table>    
        </div>
        
    </body>
</html>
