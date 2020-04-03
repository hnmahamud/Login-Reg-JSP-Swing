<%@ page errorPage="Error.jsp" %>
<%@ page import ="java.sql.*" %>

<%
    String user = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String district = request.getParameter("district");
    String gender = request.getParameter("gender");
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest",
            "root", "");
    
    Statement st = con.createStatement();
    int i = st.executeUpdate(" insert into members " + " values( '" + fname + "', '" + lname + "', '" + email + "', '" + user + "', '" + pwd + "', '" + gender + "', '" + district + "' ) ");
    
    if (i > 0) {
        response.sendRedirect("RegSuccess.jsp");
    } else {
        response.sendRedirect("RegFailed.jsp");
    }
%>