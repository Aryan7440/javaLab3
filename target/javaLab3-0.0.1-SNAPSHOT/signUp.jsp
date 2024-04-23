<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- signup.jsp -->
<!-- signup.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<h2>Sign Up</h2>

<form action="signup_processServlet" method="post">
    <label for="username">UserName:</label>
    <input type="text" id="username" name="username" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

    <label for="firstname">First Name:</label>
    <input type="text" id="firstname" name="firstname" required>

    <label for="lastname">Last Name:</label>
    <input type="text" id="lastname" name="lastname" required>

    <label for="dob">Date of Birth:</label>
    <input type="date" id="dob" name="dob" required>

    <label for="email">Email Address:</label>
    <input type="email" id="email" name="email" required>
    
    <label for="subject">subject</label>
    <input type="text" id="subject" name="subject" required>

    <input type="submit" value="Submit">
</form>
<a href="login.jsp">Login</a>

</body>
</html>
