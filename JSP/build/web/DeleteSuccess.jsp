<%@ page errorPage="Error.jsp" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
	<body>
        <center>
            <h1> <font color = "lime"> Account delete Successful! </font> </h1> 
                <script>
                    setTimeout( function() {
                        window.location = 'RegForm.jsp';
                    }, 1000);
                </script>
        </center>
    </body>
</html>