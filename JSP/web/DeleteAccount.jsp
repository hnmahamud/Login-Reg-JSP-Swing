<%@ page errorPage="Error.jsp" %>
<%@ page import ="java.sql.*" %>

<%
    String mail = session.getAttribute("email").toString();
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest",
            "root", "");
    
    Statement st = con.createStatement();
    int i = st.executeUpdate(" delete from members " + " where email = '" + mail + "' ");
        
    if (i > 0) {
        response.sendRedirect("DeleteSuccess.jsp");
    } else {
        response.sendRedirect("DeleteFailed.jsp");
    }
%>