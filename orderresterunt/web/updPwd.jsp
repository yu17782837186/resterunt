<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		/* font-weight:bold; */
		/* font-weight:bolder; */  
		font-weight:lighter; 
	}
	#d{
		width: 550px;
		height: 200px;
		border: 1px solid orange;
		margin-top: 50px;
		margin-left: 300px;
		font-size:14pt;
	}
	#bt{
		width: 80px;
		height: 30px;
		/* margin-left: 93px; */
		font-size:14pt;
	}
	input{
		width: 200px;
		font-size:11pt;
	}
</style>
</head>
<body>
<br>
<div id="d">
请修改密码：
<form action="${pageContext.request.contextPath }/UserController/updPwd.action">
	原密码：<input type="text" value="${infoUser.upwd }" readonly="readonly"><br>
	新密码：<input type="text" name="newUpwd"><br>
	<input type="submit" id="bt" value="提 交"><br>
	<input type="hidden" name="uid" value="${infoUser.uid }"><br>
</form>
</div>
</body>
</html>