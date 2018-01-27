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
	<!-- 国际化使用《s：text》标签，在propertise文件里，设置不同对应的语言 
		 关键在于在struts.xml里开启国际化，并添加propertise文件
	-->
	<form action="xx" method="post">
		
		<s:text name="un"></s:text><input type= "text" name= "username"><s:fielderror fieldName="username"/>
		<br>
		<s:text name="pw"></s:text><input type="password" name= "password"><s:fielderror fieldName="password"/>
		
	</form>
	
</body>
</html>