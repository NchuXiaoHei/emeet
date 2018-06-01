<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../resources/css/dashboard.css" rel="stylesheet">
    <script src="../resources/js/jquery.min.js"></script>
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="../resources/css/carousel.css" rel="stylesheet">
  </head>

  <body>
    <%Long user_id = (Long)session.getAttribute("userId"); %>
    <jsp:include page="../navbar.jsp"></jsp:include><!-- 引入导航框架文件 -->
	<div style="height:200px"><img src="../resources/img/3.jpg" style="min-width: 100%" ></img></div>
    <div class="container-fluid">
    
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">参会人员操作<span class="sr-only">(current)</span></a></li>
            <li><a href="javascript:void(0);" onclick="add_upload()">上传资料</a></li>
            <li><a href="javascript:void(0);" onclick="add_upload1()">查看资料</a></li>         
            <li><a href="javascript:void(0);" onclick="add_vote()" id="tp">参与投票</a></li>
            <li><a href="javascript:void(0);" onclick="add_vote1()" >投票记录</a></li>
            <li><a href="javascript:void(0);" onclick="add_register()">签到</a></li>
          </ul>
        </div>
        
                       
        <c:forEach var="vote" items="${list}" >     
        <form action="/zlList" name="Form" method="post">
        
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" id="right">
	      
	     <table class="table table-striped" >
	            <tr>                
                  <th style="margin-left:200px;">资料编号</th>
                  <th style="margin-left:200px;">资料说明</th>
                  <th style="margin-left:200px;">资料下载</th>
                </tr>	      
                <tr>
		         <th style="margin-left:200px;">${vote.zlId} </th>
		         <th style="margin-left:200px;">${vote.note}</th> 
		         <th style="margin-left:200px;">${vote.filePath}</th>              
		        </tr>	
		 </table>
		 
        </div>
        </form>
        </c:forEach>
  </div>
  </div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
<script>
  function add_upload(){
      $("#right").load("../ower/ch_meet_upload");
  }
  function add_upload1(){
	  window.location.href="/zlList";
  }
  function add_vote(){
	  window.location.href="/tpList";
  }
  function add_vote1(){
	  window.location.href="/tpList_px";
  }
  function add_register(){
	  window.location.href="/zxingcoder";
  }
</script>