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
		font-size:15pt;
	}
	img{
		margin-left:200px;
		margin-top:100px;
		border:1px solid orange;
		position:absolute;
	}
	#dfrom{
		width:400px;
		height:360px;
		border:1px solid orange;
		position:absolute;
		margin-left:800px;
		margin-top:100px;
		/* border-radius:25px; */
	}
	.ipt{
		width:360px;
		height:50px;
/*		border:1px solid green;*/
		margin-left:10px;
	}
	#ipt1{
		margin-top:65px;
	}
	#ipt2{
		margin-top:20px;
	}
	#ipt3{
		margin-top:20px;
	}
	#sid,#sname{
		width:280px;
		height:40px;
		margin-top:2px;
	}
	#st{
		width: 282px;
		height: 45px;
		margin-left:55px;
		margin-top:2px;
		font-size: 25px;
		font-family:"SimSun";
		border: none;
		background-color: #ee7700;
	}
	input{
		font-weight:lighter; 
	}
</style>
</head>
<body bgColor="FCCB90">
<img src="image/f-1.jpg" width="600" height="360">
<form action="${pageContext.request.contextPath }/UserController/login.action" method="post">
<div id="dfrom">
		<div class="ipt" id="ipt1">
			账号：<input type="text" name="uid" id="sid" value="111111"><br />
		</div>
		<div class="ipt" id="ipt2">
			密码：<input type="text" name="upwd" id="sname" value="aaaaaa"><br />
		</div>
		<div class="ipt" id="ipt3">
			<input type="submit" id="st" value="提 交">
		</div>
</div>
</form>

</body>
</html>