<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<frameset rows="10%,*" scrolling="No" framespacing="0" frameborder="yes" border="1">
		<frame src="demo_top.jsp">
	<frameset cols="9%,*" scrolling="No" framespacing="0" frameborder="yes" border="1"> 
		<frame src="demo_left.jsp">
		<frame src="${pageContext.request.contextPath }/FoodsController/findAllFoods.action" name="cn">
	</frameset>
</frameset>

</html>