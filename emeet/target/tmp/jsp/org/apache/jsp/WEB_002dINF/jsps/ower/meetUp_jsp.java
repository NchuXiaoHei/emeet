/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.2.v20140723
 * Generated at: 2018-05-29 15:32:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsps.ower;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class meetUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>发起会议</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../navbar.jsp", out, false);
      out.write("<!-- 引入导航框架文件 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- 提示发起 会议的注意事项,位于左部-->\r\n");
      out.write("\t<div id=\"UpNote\">\r\n");
      out.write("\t\t<p>标题图大小:</p>\r\n");
      out.write("\t\t<p>小图:</p>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 发起会议的表单 -->\r\n");
      out.write("\t<div id=\"UpInput\">\r\n");
      out.write("\t\t<form role=\"form\" action=\"/meetUp\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"name\">会议主题</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\tid=\"theme\" name=\"theme\" placeholder=\"请输入会议主题\">\r\n");
      out.write("\t\t\t\t<label for=\"name\">开始时间</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\tid=\"s_time\" name=\"s_time\" placeholder=\"请输入开始时间\">\r\n");
      out.write("\t\t\t\t<label for=\"name\">结束时间</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\tid=\"e_time\" name=\"e_time\" placeholder=\"请输入结束时间\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"inputfile\">标题图</label> <input type=\"file\"\r\n");
      out.write("\t\t\t\t\tid=\"pirture1\" name=\"pirture1\">\r\n");
      out.write("\t\t\t\t<label for=\"inputfile\">小图</label> <input type=\"file\"\r\n");
      out.write("\t\t\t\t\tid=\"pirture2\" name=\"pirture2\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-default\">提交</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("<!-- 引入footer框架文件 -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
