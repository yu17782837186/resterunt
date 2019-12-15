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
	
	//全选和反选
	function selectAll(){
		var cid = document.getElementById("cid");
		var cids = document.getElementsByClassName("cids");
		for(var i=0;i<cids.length;i++){
			if (cid.checked==true) {
				cids[i].checked=true;
			}else{
				cids[i].checked=false;
			}
		}
	}
	
	//批量删除
	function delBatch(){
		var arr=[];
		var cids = document.getElementsByClassName("cids");
		for(var i=0;i<cids.length;i++){
			if (cids[i].checked==true) {
				arr.push(cids[i].value)
			}
		}
		//alert(arr);
		var cs = arr.toString();
		var b = confirm("你去的要删除"+cs+"吗？");
		if (b) {
			location.href="${pageContext.request.contextPath }/CarController/delBatch.action?cids="+cs
		}
	}
	
	//准备订单，后输入收货地址
	function createOrder(){
		var arr=[];
		var cids = document.getElementsByClassName("cids");
		for(var i=0;i<cids.length;i++){
			if (cids[i].checked==true) {
				arr.push(cids[i].value)
			}
		}
		var cs = arr.toString();
		location.href="${pageContext.request.contextPath }/OrdersController/createOrder.action?cids="+cs
	}

</script>
</head>
<body>
<br>
<table align="center" width="1050" border="1" cellspacing="0">
	<tr>
		<td colspan="7">
			<button id="bt" onclick="delBatch()">删除</button>&nbsp;&nbsp;&nbsp;
			<button id="bt" onclick="createOrder()">提交订单</button>
		</td>
	</tr>
		<tr>
		<td>
			<input type="checkbox" id="cid" onclick="selectAll()">
		</td>
		<td>商品id</td>
		<td>商品名称</td>
		<td>商品图片</td>
		<td>商品单价</td>
		<td>商品数量</td>
		<td>销售状态</td>
	</tr>
	<c:forEach items="${listCarUser }" var="uc">
		<tr>
			<td>
				<input type="checkbox" class="cids" value="${uc.cid }">
			</td>
			<td>${uc.cid }</td>
			<td>${uc.cname }</td>
			<td>
				<img src="image/${uc.cimage }" height="95">
			</td>
			<td>${uc.cmoney }</td>
			<td>${uc.cnum }</td>
			<td>
			<c:choose>
				<c:when test="${uc.cstatus =='0' }">
					正常销售
				</c:when>
				<c:when test="${uc.cstatus =='1' }">
					促销
				</c:when>
				<c:otherwise>
					下架
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
	</c:forEach>

</table>

</body>
</html>