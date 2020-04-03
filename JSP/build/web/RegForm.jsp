<%@ page errorPage="Error.jsp" %>
<html>
    <head>
	 <title>JSP Page</title>
         <script>
            function validateForm() {
            var fname = document.forms["RegForm"]["fname"].value;
            var lname = document.forms["RegForm"]["lname"].value;
            var email = document.forms["RegForm"]["email"].value;
            var uname = document.forms["RegForm"]["uname"].value;
            var pass = document.forms["RegForm"]["pass"].value;
            var gender = document.forms["RegForm"]["gender"].value;
            var district = document.forms["RegForm"]["district"].value;
            if (fname == "" || lname == "" || email == "" || uname == "" || pass == "" || gender == "" || district == "") {
            alert("Form must be filled out");
            return false;
            }
        }
        </script>
	 </head>
    <body>
    <center>
            <h2>Enter Information here</h2>
            <form name="RegForm" action="RegCheck.jsp" onsubmit="return validateForm()" method="post">
            <fieldset style="width:300">
            <legend> Personal info: </legend>
            <input type="text" name="fname" placeholder = "First Name"> </br> </br>
            <input type="text" name="lname" placeholder = "Last Name"> </br> </br>
            <input type="text" name="email" placeholder = "Email"> </br> </br>
            <input type="text" name="uname" placeholder = "Username"> </br> </br>
            <input type="password" name="pass" placeholder = "Password"> </br> </br>
            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
            Gender: <input type = "radio" name = "gender" value = "Male" checked> Male
                    <input type = "radio" name = "gender" value = "Female"> Female </br> </br>
            &nbsp; &nbsp; &nbsp; &nbsp;
            District:
                    <select name = "district">
			<option> -Select your district- </option>
			<option> Dinajpur </option>
			<option> Rajshahi </option>
			<option> Dhaka </option>
                    </select> </br>
                        
            </fieldset>
            <input type="submit" value="Save">
            <input type="reset" value="Reset"> </br> </br>
            Already registered!! <a href="LoginForm.jsp">Login Here</a>
            </form>
    </center>
    </body>
</html>