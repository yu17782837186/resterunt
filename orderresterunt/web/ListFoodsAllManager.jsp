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
		font-size:11pt;
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
		<td colspan="3">&nbsp;<a href="UploadFoods.jsp">上传菜品</a></td>
	</tr>
	<tr>
		<td>菜品名称</td>
		<td>菜品价格</td>
		<td>销售状态</td>
	</tr>
	<c:forEach items="${listFoodsAllManager }" var="m" varStatus="i">
	<tr>
		<td>${m.fname }</td>
		<td>${m.fmoney }</td>
		<td>${m.fstatus }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>