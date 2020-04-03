<html>
    <head>
        <title>JSP Page</title>
        <script>
            function validateForm() {
            var pass = document.forms["NewPassword"]["password"].value;
            if (pass == "") {
            alert("Form must be filled out");
            return false;
            }
        }
        </script>
    </head>
    <body>
    <center>
        <h2> Reset Password </h2>
        <%
            String mail = session.getAttribute("email").toString();
            out.print("Account email is: " + mail);
        %>
        <form name="NewPassword" action="UpdatePassword.jsp" onsubmit="return validateForm()" method="post">
            <input type="password" name="password" placeholder = "Enter new password"> </br> </br>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset"> </br> </br>
            Remember password!! <a href="LoginForm.jsp">Login Here</a>
        </form>
    </center>
        
    </body>
</html>
