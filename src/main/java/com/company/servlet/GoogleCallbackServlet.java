package com.company.servlet;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import java.io.IOException;

import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GoogleCallbackServlet
 */

public class GoogleCallbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");

		try {
			String idToken = req.getParameter("id_token");
			GoogleIdToken.Payload payLoad = IdTokenVerifierAndParser.getPayload(idToken);
			String name = (String) payLoad.get("name");
			String email = payLoad.getEmail();
			System.out.println("User name: " + name);
			System.out.println("User email: " + email);

			HttpSession session = req.getSession();
			session.setAttribute("userName", name);
			resp.sendRedirect("succes.jsp");
			// req.getServletContext()
			// .getRequestDispatcher("/login.jsp").forward(req, resp);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
