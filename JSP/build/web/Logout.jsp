<%@ page errorPage="Error.jsp" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
	<body>
        <center>
            <h1> <font color = "lime"> Logout successfully! </font> </h1> 
                <script>
                    setTimeout( function() {
                        window.location = 'LoginForm.jsp';
                    }, 1000);
                </script>
        </center>
    </body>
</html>