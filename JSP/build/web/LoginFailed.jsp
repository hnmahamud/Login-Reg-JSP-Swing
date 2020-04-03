<%@ page errorPage="Error.jsp" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
	<body>
        <center>
            <h1> <font color = "Red"> Incorrect username or password! </font> </h1> 
                <script>
                    setTimeout( function() {
                        window.location = 'LoginForm.jsp';
                    }, 2000);
                </script>
        </center>
    </body>
</html>