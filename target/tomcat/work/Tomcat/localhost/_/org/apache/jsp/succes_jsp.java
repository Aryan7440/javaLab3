/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-04-23 08:53:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class succes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- success.jsp -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Success</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
 
    String userName = (String) session.getAttribute("userName");

      out.write("\r\n");
      out.write("<h2>Welcome, ");
      out.print( userName );
      out.write("</h2>\r\n");
      out.write("<form action=\"LogoutServlet\" method=\"post\">\r\n");
      out.write("    <input type=\"submit\" value=\"Logout\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<h2>Query Student Details</h2>\r\n");
      out.write("\r\n");
      out.write("<form action=\"QuerServlet\" method=\"post\">\r\n");
      out.write("    <label for=\"lastname\">Enter Last Name:</label>\r\n");
      out.write("    <input type=\"text\" id=\"lastname\" name=\"lastname\" required>\r\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("</form>\r\n");
      out.write("<h2>change teacher</h2>\r\n");
      out.write("\r\n");
      out.write("<form action=\"teacherChangeServlet\" method=\"post\">\r\n");
      out.write("    <label for=\"subject\">subject</label>\r\n");
      out.write("    <input type=\"text\" id=\"subject\" name=\"subject\" required>\r\n");
      out.write("    <label for=\"teacher\">teacher</label>\r\n");
      out.write("    <input type=\"text\" id=\"teacher\" name=\"teacher\" required>\r\n");
      out.write("\r\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- This is where the query result will be displayed -->\r\n");
      out.write("<div id=\"queryResult\">\r\n");
      out.write("    <!-- Query result will be inserted here -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}