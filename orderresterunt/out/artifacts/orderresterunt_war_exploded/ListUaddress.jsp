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
<table align="center" width="1000" border="1" cellspacing="0">
	<tr>
		<td colspan="2">
			<a href="addUaddress.jsp">添加收货地址</a>
		</td>
	</tr>
	<tr>
		<td width="900">收货地址</td>
		<td width="100">管理</td>
	</tr>
	<c:forEach items="${listUaddress }" var="u">
		<tr>
			<td>${u.address }</td>
			<td>
			<a href="${pageContext.request.contextPath }/UaddressController/delUaddress.action?aid=${u.aid}">删除</a>
			</td>
		</tr>
	</c:forEach>

</table>

</body>
</html>