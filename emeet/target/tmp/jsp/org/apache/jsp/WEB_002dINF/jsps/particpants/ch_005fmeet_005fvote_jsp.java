/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.2.v20140723
<<<<<<< HEAD
 * Generated at: 2018-06-02 13:43:43 UTC
=======
 * Generated at: 2018-05-29 15:39:05 UTC
>>>>>>> branch 'master' of https://github.com/NchuXiaoHei/emeet.git
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsps.particpants;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ch_005fmeet_005fvote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/12851/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("file:/C:/Users/12851/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1527149741419L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>Dashboard Template for Bootstrap</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"../resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"../resources/css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"../resources/js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link href=\"../resources/css/carousel.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
Long user_id = (Long)session.getAttribute("userId"); 
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../navbar.jsp", out, false);
      out.write("<!-- 引入导航框架文件 -->\r\n");
      out.write("\t<div style=\"height:200px\"><img src=\"../resources/img/3.jpg\" style=\"min-width: 100%\" ></img></div>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("          <ul class=\"nav nav-sidebar\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">参会人员操作<span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("            <li><a href=\"javascript:void(0);\" onclick=\"add_upload()\">上传资料</a></li>\r\n");
      out.write("            <li><a href=\"javascript:void(0);\" onclick=\"add_upload()\">查看资料</a></li>         \r\n");
      out.write("            <li><a href=\"javascript:void(0);\" onclick=\"add_vote()\" id=\"tp\">参与投票</a></li>\r\n");
      out.write("            <li><a href=\"javascript:void(0);\" onclick=\"add_vote()\" >投票记录</a></li>\r\n");
      out.write("            <li><a href=\"javascript:void(0);\" onclick=\"add_register()\">签到</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
int i = 0; 
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/jsps/particpants/ch_meet_vote.jsp(59,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fforEach_005f1.setVar("vote");
      // /WEB-INF/jsps/particpants/ch_meet_vote.jsp(59,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        \r\n");
            out.write("        ");
i++; 
            out.write("\r\n");
            out.write("        <form action=\"/savetp\" name=\"Form\" method=\"post\">\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\" id=\"right\">\r\n");
            out.write("\t      \r\n");
            out.write("\t      <input type=\"hidden\" name=\"tp_id\" id=\"optionsRadios1\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vote.tpId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("\t      <table class=\"table table-striped\" >\r\n");
            out.write("                <tr>                \r\n");
            out.write("                  <th style=\"margin-left:200px;\">投票信息</th>\r\n");
            out.write("                  <th style=\"margin-left:200px;\">请投票</th>\r\n");
            out.write("                </tr>\r\n");
            out.write("                <tr>\r\n");
            out.write("\t\t         <th style=\"margin-left:200px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vote.note }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" </th>\r\n");
            out.write("\t\t         <th style=\"margin-left:200px;\">\r\n");
            out.write("                 <label class=\"radio-inline\">\r\n");
            out.write("                 <input type=\"radio\" name=\"tp_px1\" id=\"optionsRadios1\" value=\"1\" checked> 赞成\r\n");
            out.write("                 </label>\r\n");
            out.write("                 <label class=\"radio-inline\">\r\n");
            out.write("                 <input type=\"radio\" name=\"tp_px1\" id=\"optionsRadios2\"  value=\"2\" > 反对\r\n");
            out.write("                 </label>\r\n");
            out.write("                 <button  type=\"submit\" style=\"width:50px;height:30px;\">提交</button>\r\n");
            out.write("                 </th>\r\n");
            out.write("\t\t        </tr>\t\r\n");
            out.write("\t\t </table>\r\n");
            out.write("\t\t \r\n");
            out.write("        </div>\r\n");
            out.write("        </form>\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      }
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\r\n");
      out.write("    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->\r\n");
      out.write("    <script src=\"../../assets/js/vendor/holder.min.js\"></script>\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("<script>\r\n");
      out.write("  function add_upload(){\r\n");
      out.write("      $(\"#right\").load(\"../ower/ch_meet_upload\");\r\n");
      out.write("  }\r\n");
      out.write("  function add_vote(){\r\n");
      out.write("\t  window.location.href=\"/tpList\";\r\n");
      out.write("  }\r\n");
      out.write("  function add_register(){\r\n");
      out.write("\t  $(\"#right\").load(\"ch_meet_register\");\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsps/particpants/ch_meet_vote.jsp(56,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("vote1");
    // /WEB-INF/jsps/particpants/ch_meet_vote.jsp(56,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vote1.tpId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
