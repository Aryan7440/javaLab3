package com.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.util.DBUtil;

/**
 * Servlet implementation class QuerServlet
 */
// @WebServlet("/QuerServlet")
public class QuerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuerServlet() {
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String lastName = request.getParameter("lastname");
        String query = "SELECT * FROM students join faculty on students.subject=faculty.subject  WHERE lastname = ?";
        try (Connection connection = DBUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, lastName);

            ResultSet rs = preparedStatement.executeQuery();
            // System.out.println("query run ho rahi");
            out.println("<h2>Student Details with Last Name: " + lastName + "</h2>");
            out.println("<table>");
            out.println(
                    "<tr><th>id</th><th>First Name</th><th>Last Name</th><th>Date of Birth</th><th>Email Address</th><th>subject</th><th>teacher</th></tr>");
            while (rs.next()) {
                String id = rs.getString("id");
                String firstName = rs.getString("firstname");
                String ln = rs.getString("lastname");
                String dob = rs.getString("dob");
                String email = rs.getString("email");
                String subject = rs.getString("subject");
                String teacher = rs.getString("teacher");

                out.println("<tr>");
                out.println("<td>" + id + "</td>");
                out.println("<td>" + firstName + "</td>");
                out.println("<td>" + ln + "</td>");
                out.println("<td>" + dob + "</td>");
                out.println("<td>" + email + "</td>");
                out.println("<td>" + subject + "</td>");
                out.println("<td>" + teacher + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        } catch (SQLException e) {
            out.println("Error: " + e.getMessage());
        }
    }

}
