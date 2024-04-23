package com.company.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;

/**
 * Servlet implementation class signup_processServlet
 */
// @WebServlet("/signup_processServlet")
public class signup_processServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public signup_processServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// System.out.print("hi im aryan");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");

		// User user = new User();
		// user.setUsername(username);
		// user.setEmail(email);
		// user.setPassword(password);

		// UserDao userDao = new UserDaoImpl();
		if (userDao.addUser(username, password, firstname, lastname, dob, email, subject)) {
			response.sendRedirect("login.jsp?registration=success");
		} else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

}
