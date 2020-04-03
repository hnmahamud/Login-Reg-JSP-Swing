<%@ page errorPage="Error.jsp" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
	<body>
        <center>
            <h1> <font color = "Red"> Account delete failed! </font> </h1> 
                <script>
                    setTimeout( function() {
                        window.location = 'LoginSuccess.jsp';
                    }, 1000);
                </script>
        </center>
    </body>
</html>