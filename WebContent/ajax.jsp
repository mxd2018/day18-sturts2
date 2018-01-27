<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	$(function(){
		$("input[type='button']").click(function(){
			$.ajax({
				url:"ajax.action",
				date:{"username":""},
				type:"post",
				dataType:"json",
				success:function(rec){
					/* 
					注意：如果是dataType:"json",那么弹框的是Object，"text"弹框会是属性值
						因此，json格式要想显示值，不能直接alert(属性),要alert(rec.键)
					*/
					alert(rec.username);
					$("#h1").html(rec.flag);
				}
				
			});
		});
	})

</script>
</head>


<body>
	<input type="button" value="doAjax">
	<h1 id="h1"></h1>
</body>
</html>