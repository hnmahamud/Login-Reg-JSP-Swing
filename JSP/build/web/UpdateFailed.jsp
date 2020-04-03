<%@ page errorPage="Error.jsp" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
	<body>
        <center>
            <h1> <font color = "Red"> Password change Failed! </font> </h1> 
                <script>
                    setTimeout( function() {
                        window.location = 'RegForm.jsp';
                    }, 2000);
                </script>
        </center>
    </body>
</html>