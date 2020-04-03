<%@ page isErrorPage = "true" %>

<html>
    
    <body>
    <center>
        
        <h2> <font color= "red"> Exception caught! </font> </h2>
        The Exception is: <%= exception %>
            <script>
            setTimeout( function() {
            window.location = 'LoginForm.jsp';
            }, 10000);
            </script>
    </center>
        
    </body>
    
</html>