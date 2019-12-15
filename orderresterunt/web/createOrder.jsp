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
	#d{
		width: 600px;
		height: 200px;
		border: 1px solid orange;
		margin-top: 50px;
		margin-left: 300px;
		font-size:14pt;
	}
	#st{
		font-size:11pt;
	}
	#bt{
		width: 80px;
		height: 30px;
		/* margin-left: 93px; */
		font-size:14pt;
	}
</style>
<script type="text/javascript" src="jq/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(function(){
		//alert("********");
		$.ajax({
			//提交的地址
			url:'${pageContext.request.contextPath }/UaddressController/findUserUaddress.action',
			//提交方式
			type:'get',
			//服务器响应数据的类型
			dataType:'json',
			//false 将不缓存此页面
			cache:false,
			//同步还是异步
			async:true,
			success:function(msg){
				var st = $("#st");
				for(var i=0;i<msg.length;i++){
					//msg[i].checked=true;
					st.append("<option id="+msg[i].aid+" value="+msg[i].address+">"+msg[i].address+"</option>")
				}
			}
		})
		
	})
</script>
</head>
<body>
<br>
<div id="d">
你提交的订单信息是：
<form action="${pageContext.request.contextPath }/OrdersController/submitOrder.action" method="post">
	<c:forEach items="${createOrderList }" var="c">
		<input type="checkbox" name="cids" value="${c.cid }" checked="checked" readonly="readonly" />${c.cname }，${c.cmoney }￥，${c.cnum }份<br>
	</c:forEach>
	请选择收货地址：<select id="st" name="st">
	</select>
	<br>
	<input type="submit" id="bt" value="提 交">
</form>
</div>
</body>
</html>