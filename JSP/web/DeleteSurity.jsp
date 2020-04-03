<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
        String uname = session.getAttribute("uname").toString();
        %>
        <h2>Hello, <% out.println(uname);%> are you sure to delete your account? </h2>
        <form action="DeleteAccount.jsp">
            <input type="submit" value="Yes">
            </form>
        <form action="LoginSuccess.jsp">
            <input type="submit" value="No">
            </form>
    </center>
    </body>
</html>
