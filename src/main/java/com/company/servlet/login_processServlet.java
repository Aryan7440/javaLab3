package com.company.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.UserDaoImpl;
import com.company.dao.UserDao;

/**
 * Servlet implementation class login_processServlet
 */
// @WebServlet("/login_processServlet")
public class login_processServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImpl();

	public login_processServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		if (userDao.isValidUser(userName, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			System.out.println("Hi - " + userName);
			response.sendRedirect("succes.jsp");

		} else {
			response.sendRedirect("login.jsp?error=1");
			System.out.println("Error A gya");
		}
	}

}
