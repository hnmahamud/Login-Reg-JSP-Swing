package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"Error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\t <title>JSP Page</title>\n");
      out.write("         <script>\n");
      out.write("            function validateForm() {\n");
      out.write("            var uname = document.forms[\"LoginForm\"][\"uname\"].value;\n");
      out.write("            var pass = document.forms[\"LoginForm\"][\"pass\"].value;\n");
      out.write("            if (uname == \"\" || pass == \"\") {\n");
      out.write("            alert(\"Form must be filled out\");\n");
      out.write("            return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("\t </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h2>Login Into Your Account</h2>\n");
      out.write("            <form name=\"LoginForm\" action=\"LoginCheck.jsp\" onsubmit=\"return validateForm()\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"uname\" placeholder = \"Username\"> </br> </br>\n");
      out.write("            <input type=\"password\" name=\"pass\" placeholder = \"Password\"> </br> </br>\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("            <input type=\"reset\" value=\"Reset\"> </br> </br>\n");
      out.write("            <a href = \"RecoverForm.jsp\"> Forgot password? </a>\n");
      out.write("            &nbsp;&nbsp;\n");
      out.write("            <a href = \"RegForm.jsp\"> Signup </a>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
