<%@ page errorPage="Error.jsp" %>
<%@ page import ="java.sql.*" %>

<%
    String pass = request.getParameter("password");
    String mail = session.getAttribute("email").toString();
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest",
            "root", "");
    
    Statement st = con.createStatement();
    int i = st.executeUpdate(" update members " + " set pass = '" + pass + "' where email = '" + mail + "' ");
        
    if (i > 0) {
        response.sendRedirect("UpdateSuccess.jsp");
    } else {
        response.sendRedirect("UpdateFailed.jsp");
    }
%>