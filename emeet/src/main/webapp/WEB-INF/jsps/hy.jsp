<%@page import="com.xiaohei.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%User user = (User)session.getAttribute("user"); %>
<body>
	<div class="ed_top" style="background-color:rgba(0,0,0,0~1);position:absolute;margin-top:0;">
		<div style="float:left">
			<p>
				<a href="/home">欢迎使用EmeeT</a>
				<%if(user==null) {%>
				<a href="/login">请登录</a>
				<a href="/register">免费注册</a>
				<% }else {%>
				<a href="/userHome?user_id=${user.userId }"></a>
				<%} %> 
			</p>
		</div>
		<div style="float:right">
			<p><a href="/home">EmeeT</a></p>
		</div>
	</div>
	<div id="content" style="position:relative">
		<!-- 标题部分 -->
		<div style="background:url(${hy.pirture1})">
			<table border="0">
				<tbody>
					<tr>
						<td valign="middle">
							<p>${hy.theme }</p>
							<p>主办：${hy.name }</p>
							<p>地址：${hy.address }</p>
							<p>时间：${hy.sTime } ~ ${hy.eTime }</p>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<!-- 菜单部分 -->
		<div id="navbar">
			<ul>
				<li><a href="#">首页</a></li>
				<li><a href="#">时间</a></li>
				<li><a href="#">地点</a></li>
				<li><a href="/add_ch_user" style="backgroud-color:GREEN"></a></li>
			</ul>
		</div>
		<!-- 内容区 -->
		<div id="mainDiv">
			<h2>活动详情</h2>
			<div>
				<h3>日程安排</h3>
				<table>
					<tr>
						<td>时间</td>
						<td>环节</td>
					</tr>
					<c:foreach var="item" item="list">
						<tr>
							<td>${item.sTime } - ${item.eTime }</td>
							<td>${item.note }</td>
						</tr>
					</c:foreach>
				</table>
			</div>
			<h3>地点</h3>
			<p>${hy.address }</p>
		</div>
	</div>
	
</body>
</html>