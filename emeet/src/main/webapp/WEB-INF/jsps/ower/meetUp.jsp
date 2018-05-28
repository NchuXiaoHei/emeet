<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
		<form role="form" action="/meetUp" method="post">
			<div class="form-group">
				<label for="name">会议主题</label> <input type="text" class="form-control"
					id="theme" name="theme" placeholder="请输入会议主题">
				<label for="name">开始时间</label> <input type="text" class="form-control"
					id="s_time" name="s_time" placeholder="请输入开始时间">
				<label for="name">结束时间</label> <input type="text" class="form-control"
					id="e_time" name="e_time" placeholder="请输入结束时间">
			</div>
			<div class="form-group">
				<label for="inputfile">标题图</label> <input type="file"
					id="pirture1" name="pirture1">
				<label for="inputfile">小图</label> <input type="file"
					id="pirture2" name="pirture2">
			</div>
			<button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>

	<jsp:include page="../footer.jsp"></jsp:include><!-- 引入footer框架文件 -->

</body>
</html>