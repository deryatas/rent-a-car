package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ilkGiris_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("   \r\n");
      out.write("<head>\r\n");
      out.write("  <!-- Theme Made By www.w3schools.com - No Copyright -->\r\n");
      out.write("  <title>İLK SAYFA</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("  .bg-1 { \r\n");
      out.write("    background-color: #f6f6f6;\r\n");
      out.write("    color: #01579B;\r\n");
      out.write("  }\r\n");
      out.write("  .bg-2 { \r\n");
      out.write("    background-color: #f6f6f6;\r\n");
      out.write("    color: #01579B;\r\n");
      out.write("  }\r\n");
      out.write("  .bg-3 { \r\n");
      out.write("    background-color: #f6f6f6;\r\n");
      out.write("    color:#01579B ;\r\n");
      out.write("  }\r\n");
      out.write("  .container-fluid {\r\n");
      out.write("    padding-top: 70px;\r\n");
      out.write("    padding-bottom: 70px;\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid bg-1 text-center\">\r\n");
      out.write("  <h3>AKDENİZ ARAÇ KİRALAMA</h3>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid bg-2 text-center\">\r\n");
      out.write("  <input type=\"button\" id=\"btn2\" value=\"YÖNETiCİ GİRİŞ\">\r\n");
      out.write("    <script>      \r\n");
      out.write("        document.getElementById(\"btn2\")\r\n");
      out.write("            .onclick = function(){\r\n");
      out.write("                window.setTimeout(function(){location.href = \"user/admin.jsp\";}, 1500);                        \r\n");
      out.write("             };\r\n");
      out.write("    </script>\r\n");
      out.write("      \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid bg-3 text-center\">\r\n");
      out.write("<input type=\"button\" id=\"btn\" value=\"KULLANICI GİRİŞ\">\r\n");
      out.write("    <script>      \r\n");
      out.write("        document.getElementById(\"btn\")\r\n");
      out.write("            .onclick = function(){\r\n");
      out.write("                window.setTimeout(function(){location.href = \"user/form.jsp\";}, 1500);                        \r\n");
      out.write("             };\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container-fluid bg-3 text-center\">\r\n");
      out.write("    <h1>İLK ÖNCE GİRİŞ YAPMALISINIZ</h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
