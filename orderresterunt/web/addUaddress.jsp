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
	#ipt1{
		width: 550px;
		height: 60px;
		/* border: 1px solid red; */
		margin-top: 10px;
		margin-left: 0px;
	}
	#ipt2{
		width: 200px;
		height: 30px;
		/* border: 1px solid blue; */
		margin-top: 0px;
		margin-left: 0px;
	}
	#ipt{
		width: 400px;
		height: 35px;
		font-size:14pt;
	}
	#bt{
		width: 100px;
		height: 35px;
		margin-left: 0px;
		font-size:14pt;
	}
</style>
</head>
<body>
<br>
<div id="d">
请添加收货地址：
<form action="${pageContext.request.contextPath }/UaddressController/addUaddress.action">
	<div id="ipt1">
		收货地址：<input type="text" id="ipt" name="address"><br>
	</div>
	<div id="ipt2">
		<input type="submit" id="bt" value="提交">
	</div>
</form>
</div>

</body>
</html>