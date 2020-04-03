<%@ page errorPage="Error.jsp" %>
<%@ page import ="java.sql.*" %>

<%
    String userid = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest","root", "");
    
    Statement st = con.createStatement();
    
    ResultSet rs;
    rs = st.executeQuery(" select * from members " + " where uname = '" + userid + "' and pass='" + pwd + "' ");
        
    if (rs.next()) {
        String first_name = rs.getString("first_name");
        String last_name =(rs.getString("last_name"));
        String email =(rs.getString("email"));
        String uname =(rs.getString("uname"));
        String gender =(rs.getString("gender"));
        String district =(rs.getString("district"));
        
        session.setAttribute("first_name", first_name);
        session.setAttribute("last_name", last_name);
        session.setAttribute("email", email);
        session.setAttribute("uname", uname);
        session.setAttribute("gender", gender);
        session.setAttribute("district", district);
        
        response.sendRedirect("LoginSuccess.jsp");
       
    } else {
        response.sendRedirect("LoginFailed.jsp");
        }
%>