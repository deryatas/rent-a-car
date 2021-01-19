package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import araclist.araclarDatabase;
import java.util.List;
import araclist.Araclar;

public final class Anasayfa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 List<Araclar> aracliste = new araclarDatabase().getirTumAraclarListe();
 request.setAttribute("aracliste", aracliste);

      out.write('\r');
      out.write('\n');

 int toplamArac = new  araclarDatabase().getirTumAraclar();
 request.setAttribute("toplamArac",toplamArac);

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("   \r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        <style>\r\n");
      out.write("            .inner{\r\n");
      out.write("                margin: 15px 0;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link href=\"../csss/1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("       \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"60\">\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("         <div class=\"navbar-header\">  \r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("              \r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("             \r\n");
      out.write("             </div>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("            <li><a  href=\"../LogoutServlet\"  >Çıkış</a></li>\r\n");
      out.write("            \r\n");
      out.write("             \r\n");
      out.write("            \r\n");
      out.write("            </ul>       \r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                 <div  class=\"container-fluid\">\r\n");
      out.write("            <nav class=\"navbar navbar-light\">\r\n");
      out.write("                \r\n");
      out.write("                <a class=\"navbar-brand\">Araç Listesi</a>               \r\n");
      out.write("</nav>\r\n");
      out.write("        </div>\r\n");
      out.write(" <table class=\"table table-sm table-hover table-bordered table-striped\" style=\"text-align:center\">\r\n");
      out.write("                        <thead class=\"thead-light\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                               \r\n");
      out.write("                                <th>Araç Tipi</th>\r\n");
      out.write("                                <th>Marka</th>\r\n");
      out.write("                                <th>Renk</th>\r\n");
      out.write("                                <th>Ucret</th>\r\n");
      out.write("                                <th>Durum</th>\r\n");
      out.write("                                <th></th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                         </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("</div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("            \r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Container (Portfolio Section) -->\r\n");
      out.write("            <div id=\"portfolio\" class=\"container-fluid text-center bg-grey\">\r\n");
      out.write("            <h2>KİRALIK ARAÇLAR</h2><br>\r\n");
      out.write("            <div class=\"row text-center slideanim\">\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("            <img src=\"../resimler/slide-3.jpg\" alt=\"\" alt=\"\" width=\"400\" height=\"300\"/>\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("            <p><strong>MERCEDES-BENZ</strong></p>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <div class=\"thumbnail\">\r\n");
      out.write("         <img src=\"../resimler/slide-1.jpg\" alt=\"\" width=\"400\" height=\"300\"/>\r\n");
      out.write("        <p><strong>FİAT PALİO</strong></p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <div class=\"thumbnail\">\r\n");
      out.write("         <img src=\"../resimler/slide-2.jpg\" alt=\"\" width=\"400\" height=\"300\"/>\r\n");
      out.write("        \r\n");
      out.write("        <p><strong>FORD FOCUS</strong></p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div><br>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <h2>SEN DE TERCİH ET KAZANAN OL</h2>\r\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide text-center\" data-ride=\"carousel\">\r\n");
      out.write("    <!-- Indicators -->\r\n");
      out.write("    <ol class=\"carousel-indicators\">\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("    </ol>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"container-fluid text-center\">\r\n");
      out.write("  <a href=\"#myPage\" title=\"To Top\">\r\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  // Add smooth scrolling to all links in navbar + footer link\r\n");
      out.write("  $(\".navbar a, footer a[href='#myPage']\").on('click', function(event) {\r\n");
      out.write("    // Make sure this.hash has a value before overriding default behavior\r\n");
      out.write("    if (this.hash !== \"\") {\r\n");
      out.write("      // Prevent default anchor click behavior\r\n");
      out.write("      event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("      // Store hash\r\n");
      out.write("      var hash = this.hash;\r\n");
      out.write("\r\n");
      out.write("      // Using jQuery's animate() method to add smooth page scroll\r\n");
      out.write("      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area\r\n");
      out.write("      $('html, body').animate({\r\n");
      out.write("        scrollTop: $(hash).offset().top\r\n");
      out.write("      }, 900, function(){\r\n");
      out.write("   \r\n");
      out.write("        // Add hash (#) to URL when done scrolling (default click behavior)\r\n");
      out.write("        window.location.hash = hash;\r\n");
      out.write("      });\r\n");
      out.write("    } // End if\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  $(window).scroll(function() {\r\n");
      out.write("    $(\".slideanim\").each(function(){\r\n");
      out.write("      var pos = $(this).offset().top;\r\n");
      out.write("\r\n");
      out.write("      var winTop = $(window).scrollTop();\r\n");
      out.write("        if (pos < winTop + 600) {\r\n");
      out.write("          $(this).addClass(\"slide\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aracliste}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("aracliste");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aracliste.arac_tipi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aracliste.marka}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aracliste.renk}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aracliste.ucret}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aracliste.durum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                               <td><a href=\"booking.jsp\">Kirala</a></td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                        \r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
