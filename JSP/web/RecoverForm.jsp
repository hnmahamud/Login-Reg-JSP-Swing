<%@ page errorPage="Error.jsp" %>
<html>
    <head>
	 <title>JSP Page</title>
         <script>
            function validateForm() {
            var email = document.forms["RecoverForm"]["email"].value;
            if (email == "") {
            alert("Form must be filled out");
            return false;
            }
        }
        </script>
	 </head>
    <body>
        <center>
            <h2>Recover Your Account</h2>
            <form name="RecoverForm" action="RecoverCheck.jsp" onsubmit="return validateForm()" method="post">
            <input type="text" name="email" placeholder = "Enter your email"> </br> </br>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset"> </br> </br>
            Remember password!! <a href="LoginForm.jsp">Login Here</a>
            </form>
        </center>
    </body>
</html>