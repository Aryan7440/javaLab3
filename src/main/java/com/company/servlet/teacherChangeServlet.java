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
 * Servlet implementation class teacherChangeServlet
 */
// @WebServlet("/teacherChangeServlet")
public class teacherChangeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static UserDao userDao = new UserDaoImpl();

    public teacherChangeServlet() {
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // doGet(request, response);
        String subject = request.getParameter("subject");
        String teacher = request.getParameter("teacher");
        if (userDao.changeTeacher(subject, teacher)) {
            response.sendRedirect("login.jsp?registration=success");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }

}
