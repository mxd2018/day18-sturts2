<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 注意：
		1.token令牌的作用是：解决页面提交后返回，再点提交还能反复提交的问题。当有人不停的反复提交时，就会增加服务器压力
		2.token标签其实是一个隐藏的input，当页面刷新后，会产生一个类似于ID的属性，刷新后放于session中，当请求成功后删除该session中的id，
		      那么当重复提交时，找不到相同的id就视为反复提交，提交无效。该过程在拦截器中完成
	 -->
	<form action="token.action" method="post">
		<s:token></s:token>
		<s:text name="un"></s:text><input type= "text" name= "username"><s:fielderror fieldName="username"/>
		<br>
		<s:text name="pw"></s:text><input type="password" name= "password"><s:fielderror fieldName="password"/>
		
		<input type="submit" value="提交">
	</form>
	
</body>
</html>