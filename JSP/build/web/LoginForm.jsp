<%@ page errorPage="Error.jsp" %>
<html>
    <head>
	 <title>JSP Page</title>
         <script>
            function validateForm() {
            var uname = document.forms["LoginForm"]["uname"].value;
            var pass = document.forms["LoginForm"]["pass"].value;
            if (uname == "" || pass == "") {
            alert("Form must be filled out");
            return false;
            }
        }
        </script>
	 </head>
    <body>
        <center>
            <h2>Login Into Your Account</h2>
            <form name="LoginForm" action="LoginCheck.jsp" onsubmit="return validateForm()" method="post">
            <input type="text" name="uname" placeholder = "Username"> </br> </br>
            <input type="password" name="pass" placeholder = "Password"> </br> </br>
            <input type="submit" value="Login">
            <input type="reset" value="Reset"> </br> </br>
            <a href = "RecoverForm.jsp"> Forgot password? </a>
            &nbsp;&nbsp;
            <a href = "RegForm.jsp"> Signup </a>
            </form>
        </center>
    </body>
</html>