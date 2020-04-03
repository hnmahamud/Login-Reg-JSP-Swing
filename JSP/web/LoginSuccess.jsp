<%@ page errorPage="Error.jsp" %>
<html>
    
	<head>
		<title> HN </title>
	</head>
        
	<body> 
            
            <%
                String fname = session.getAttribute("first_name").toString();
                String lname = session.getAttribute("last_name").toString();
                String email = session.getAttribute("email").toString();
                String uname = session.getAttribute("uname").toString();
                String gender = session.getAttribute("gender").toString();
                String district = session.getAttribute("district").toString();
            %>
		
		<div style="text-align: right">
                    <form action="Logout.jsp" method="post">
                    <input type="submit" value="Logout">
                    </form>
                    </div>
            
                <center>
                    <table border = "2">
                        <caption> <h2> <font color="lime"> Hello, <% out.println(uname);%> </br> Welcome to your account! </font> </h2> </caption>
                    <tr>
                        <th> <font color = "red"> First Name </font> </th>
			<th> <font color = "red"> Last Name </font> </th>
			<th> <font color = "red"> Email </font> </th>
                        <th> <font color = "red"> Username </font> </th>
                        <th> <font color = "red"> Gender </font> </th>
                        <th> <font color = "red"> District </font> </th>
                    </tr>
		
                    <tr align = "center">
			<td> <% out.println(fname);%> </td>
			<td> <% out.println(lname);%> </td>
                        <td> <% out.println(email);%> </td>
                        <td> <% out.println(uname);%> </td>
                        <td> <% out.println(gender);%> </td>
                        <td> <% out.println(district);%> </td>
                    </tr>
                    </table> 
                    </br> </br> </br> </br> </br> </br> </br> </br> </br> </br> </br> 
                    </br> </br> </br> </br> </br> </br> </br> </br> </br> </br> </br>
                <div style="text-align: right">
                    <a href = "DeleteSurity.jsp"> Delete account! </a>
                    </div>
                </center>
        
	</body>
</html>