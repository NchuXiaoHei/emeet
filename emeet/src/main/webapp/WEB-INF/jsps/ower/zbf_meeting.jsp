<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
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

    <jsp:include page="../navbar.jsp"></jsp:include><!-- 引入导航框架文件 -->
	<div style="height:200px"><img src="${hy.pirture1 }" style="min-width: 100%"></img></div>
    <div class="container-fluid">
    
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">主办方操作<span class="sr-only">(current)</span></a></li>
            <li><a href="javascript:void(0);" onclick="hy_status(${hy.hy_id})">会议状态管理</a></li>         
            <li><a href="javascript:void(0);" onclick="ch_users(${hy.hy_id})" id="tp" name="id">邀请参会人员</a></li>
            <li><a href="javascript:void(0);" onclick="vote(${hy.hy_id})">投票管理</a></li>
            <li><a href="javascript:void(0);" onclick="hy_lc(${hy.hy_id})">会议流程管理</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" id="right">
        
        </div>
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
<script type="text/javascript">
  function hy_status(var hy_id){
	  $.ajax(
				type:'POST',
				url:'/getStatus',
				data: 'hy_id='+hy_id,
				dataType: "text",
				success: function(msg){
					$("#right").html(msg);
				}
			);
  }
  function ch_users(var hy_id){
	 $.ajax(
				type: 'POST',
				dataType: "text",
				data: "hy_id="+hy_id,
				url: '/ch_users',
				success: function(msg){
					$("#right").html(msg);
				}
			);
  }
  function vote(var hy_id){
	  $.ajax(
				type: 'POST',
				dataType: "text",
				data: "hy_id="+hy_id,
				url: '/voteList',
				success: function(msg){
					$("#right").html(msg);
				}
			);
  }
  
  function hy_lc(var hy_id){
	  $.ajax(
			  	type: 'POST',
				dataType: "text",
				data: "hy_id="+hy_id,
				url: '/getLc',
				success: function(msg){
					$("#right").html(msg);
				}	  
	  );
  }
</script>
</html>
