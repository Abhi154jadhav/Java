<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
</head>
<body>

    <div class="form-container">
        <h2>Registration Form</h2>
        <form action = "RegisterServlet" method = "post">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" required />

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required />

            <label for="pass">Password:</label>
            <input password ="pass" id="pass" name="pass" required />

            <label for="repass">Re-enter Password:</label>
            <input password="password" id="repass" name="repass" required />

            <button type="submit">Register</button>
        	<!-- Error Messages -->
        <div class="error">
            <%
                String errorMessage = (String) request.getAttribute("errorMessage");
                if (errorMessage != null) {
                    out.println(errorMessage);
                }
            %>
        </div>
    </div>
        </form>

</body>
</html>

