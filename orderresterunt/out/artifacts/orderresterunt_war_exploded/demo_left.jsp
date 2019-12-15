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
</head>
<body bgcolor="#99ccff">
<br>

<c:choose>
<c:when test="${userLogin.ustatus=='0'}">
	<a href="${pageContext.request.contextPath }/UserController/findById.action" target="cn">我的信息</a><br>
	<a href="${pageContext.request.contextPath }/CarController/findUserCar.action" target="cn">我的购物车</a><br>
	<a href="${pageContext.request.contextPath }/UaddressController/findUaddress.action" target="cn">我的收货地址</a><br>
	<a href="${pageContext.request.contextPath }/OrdersController/findMyOrders.action" target="cn">我的订单</a><br>
	<a href="${pageContext.request.contextPath }/OrdersdetailController/findOrdersdetail.action" target="cn">明细关系</a><br>
	<a href="${pageContext.request.contextPath }/FoodsController/findAllFoodsManager.action" target="cn">查询菜品</a>

</c:when>
<c:when test="${userLogin.ustatus=='1'}">
	<a href="${pageContext.request.contextPath }/UserController/findById.action" target="cn">我的信息</a><br>
	<a href="${pageContext.request.contextPath }/CarController/findUserCar.action" target="cn">我的购物车</a><br>
	<a href="${pageContext.request.contextPath }/UaddressController/findUaddress.action" target="cn">我的收货地址</a><br>
	<a href="${pageContext.request.contextPath }/OrdersController/findMyOrders.action" target="cn">我的订单</a><br>
</c:when>
</c:choose>

</body>
</html>