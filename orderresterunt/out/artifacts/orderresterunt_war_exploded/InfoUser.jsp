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
    table{
        border-collapse: collapse;
        border: 1px solid #ccc;
    }
    td{
        border-collapse: collapse;
        border: 1px solid #ccc;
    }
</style>
</head>
<body>
<br>
<table align="center" width="800" height="220" border="1" cellspacing="0">
	<tr>
		<td>账号</td>
		<td>${infoUser.uid }</td>
	</tr>
	<tr>
		<td>密码</td>
		<td>
		${infoUser.upwd }&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath }/updPwd.jsp" target="cn">
		点击修改密码
		</a>
		</td>
	</tr>
	<tr>
		<td>姓名</td>
		<td>${infoUser.uname }</td>
	</tr>
	<tr>
		<td>电话</td>
		<td>${infoUser.uphone }</td>
	</tr>
	<tr>
		<td>地址</td>
		<td>${infoUser.uaddress }</td>
	</tr>
</table>
</body>
</html>