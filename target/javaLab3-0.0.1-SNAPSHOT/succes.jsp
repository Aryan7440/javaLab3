<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<!-- success.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <% 
    String userName = (String) session.getAttribute("userName");
%>
<h2>Welcome, <%= userName %></h2>
<form action="LogoutServlet" method="post">
    <input type="submit" value="Logout">
</form>

<h2>Query Student Details</h2>

<form action="QuerServlet" method="post">
    <label for="lastname">Enter Last Name:</label>
    <input type="text" id="lastname" name="lastname" required>
    <input type="submit" value="Submit">
</form>
<h2>change teacher</h2>

<form action="teacherChangeServlet" method="post">
    <label for="subject">subject</label>
    <input type="text" id="subject" name="subject" required>
    <label for="teacher">teacher</label>
    <input type="text" id="teacher" name="teacher" required>

    <input type="submit" value="Submit">
</form>


<!-- This is where the query result will be displayed -->
<div id="queryResult">
    <!-- Query result will be inserted here -->
</div>

</body>
</html>
