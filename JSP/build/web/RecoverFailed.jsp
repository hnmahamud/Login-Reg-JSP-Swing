<%@ page errorPage="Error.jsp" %>
<html>
    <head>
        <title>JSP Page</title>
    </head>
	<body>
        <center>
            <h1> <font color = "Red"> There are no account using this mail! </font> </h1> 
                <script>
                    setTimeout( function() {
                        window.location = 'RecoverForm.jsp';
                    }, 2000);
                </script>
        </center>
    </body>
</html>