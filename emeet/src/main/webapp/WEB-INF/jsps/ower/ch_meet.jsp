<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 引入jquery -->
	<script src="js/jquery-3.2.1.min.js"></script>
	<!-- 引入bootstrap -->
	 <link href="css/bootstrap.min.css" rel="stylesheet">
	
	<script src="js/show.js"></script>
	<style type="text/css">
		@import url('css/show.css');
	</style>
  </head>
  
  <body>
    <nav class="navbar navbar-default" role="navigation" style="border:none;margin-bottom:0px;background:BLACK;margin-left:-15px;margin-right:-30px;height:10%;">
		<div class="container" style="width:100%;">
			<div class="navbar-header" style="width:40%;">
				<a class="navbar-brand" style="color:#CAC3C3;margin-left:18%; font-size:25px;" href="#">工资管理系统</a>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#menu" style="margin-right:50%;border:0px" onmouseout="this.style.background='transparent'" onmouseover="this.style.background='transparent'">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="menu">
				<ul class="nav navbar-nav" id="menu_ul">				
			        <li><a href="index.jsp">首页</a></li>
				    <li><a href="javascript:void(0);" onclick="month()">员工当月工资计算</a></li>
                    <li><a href="javascript:void(0);" onclick="year()">员工年收入统计</a></li>
                    <li><a href="javascript:void(0);" onclick="allyear()">部门员工年收入统计</a></li>
				</ul>
			</div>

		</div>
	</nav>
    <div id="container">
    	<div id="left_content">
    		
    	</div>
    	
    	<div id="right_content">
    	
    	</div>
    </div>
    <div id="bottom"></div>
  </body>
   
</html>