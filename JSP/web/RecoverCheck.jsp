<%@ page errorPage="Error.jsp" %>
<%@ page import ="java.sql.*" %>

<%
    String mail = request.getParameter("email");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest","root", "");
    
    Statement st = con.createStatement();
    
    ResultSet rs;
    rs = st.executeQuery(" select * from members " + " where email = '" + mail + "' ");
        
    if (rs.next()) {
        String email = rs.getString("email");
        
        session.setAttribute("email", email);
     
        response.sendRedirect("NewPassword.jsp");
       
    } else {
        response.sendRedirect("RecoverFailed.jsp");
        }
%>