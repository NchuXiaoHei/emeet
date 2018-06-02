<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<script src="resources/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="resources/css/carousel.css" rel="stylesheet">
<title>发起会议</title>
</head>
<body>
	<jsp:include page="../navbar.jsp"></jsp:include><!-- 引入导航框架文件 -->

	<!-- 提示发起 会议的注意事项,位于左部-->
	<div id="UpNote">
		<p>标题图大小:</p>
		<p>小图:</p>	
	</div>

	<!-- 发起会议的表单 -->
	<div id="UpInput">
		<form action="/meetUp" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="name">会议主题</label> <input type="text" class="form-control"
					id="theme" name="theme" placeholder="请输入会议主题">
				<label for="name">开始时间</label> <input type="datetime-local" class="form-control"
					id="s_time" name="s_time" placeholder="请输入开始时间">
				<label for="name">结束时间</label> <input type="datetime-local" class="form-control"
					id="e_time" name="e_time" placeholder="请输入结束时间">
				<label for="name">地点</label> <input type="text" class="form-control"
					id="address" name="address" placeholder="请输入举办地点">
			</div>
			<div class="form-group">
				<label for="inputfile">标题图</label> <input type="file"
					id="pirture1" name="file1">
				<label for="inputfile">小图</label> <input type="file"
					id="pirture2" name="file2">
			</div>
			<button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>

	<jsp:include page="../footer.jsp"></jsp:include><!-- 引入footer框架文件 -->

</body>
</html>