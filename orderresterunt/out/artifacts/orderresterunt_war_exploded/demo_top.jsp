<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</style>
<style type="text/css">
#span1{
	color:red;
}
</style>
</head>
<body bgcolor="#c2cb7a">
<br>

欢迎【${userLogin.uname }】登录，
<a href="${pageContext.request.contextPath }/UserController/exitLogin.action" target="_praint">退出</a>，
<a href="${pageContext.request.contextPath }/FoodsController/findAllFoods.action" target="cn">查询菜品</a>

</body>
</html>