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
<script type="text/javascript">
	function updOrdersOstatus(id){
		//alert(id);		
		location.href="OrdersController/updOrdersOstatus.action?oid="+id;
	}
</script>
</head>
<body>
<br>
<table align="center" border="1" width="1100" cellSpacing="0">
	<tr>
		<td>订单号</td>
		<td>下单人</td>
		<td>收货地址</td>
		<td>练习电话</td>
		<td>菜品名称</td>
		<td>单价</td>
		<td>数量</td>
		<td>下单时间</td>
		<td>签收状态</td>
		<td>管理</td>
	</tr>
	<c:forEach items="${listOrdersdetail }" var="o">
		<tr>
			<td>${o.oid }</td>
			<td>${o.orders.user.uname }</td>
			<td>${o.orders.oaddress }</td>
			<td>${o.orders.user.uphone }</td>
			<td>${o.foods.fname }</td>
			<td>${o.foods.fmoney }</td>
			<td>${o.odnum }</td>
			<td>${o.orders.otime }</td>
			<td>
				<c:choose>
					<c:when test="${o.orders.ostatus =='0'}">
						等待发送
					</c:when>				
					<c:when test="${o.orders.ostatus =='1'}">
						正在发送中...
					</c:when>
					<c:otherwise>
						已签收
					</c:otherwise>			
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${o.orders.ostatus =='0'}">
						<button onclick="updOrdersOstatus('${o.orders.oid }')">发送</button>
					</c:when>				
					<c:when test="${o.orders.ostatus =='1'}">
						正在发送中...
					</c:when>
					<c:otherwise>
						已签收
					</c:otherwise>			
				</c:choose>
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>