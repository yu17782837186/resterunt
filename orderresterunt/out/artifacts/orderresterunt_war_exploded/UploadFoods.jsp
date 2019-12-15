<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		width:300px;
		height:150px;
		border:2px solid orange;
		margin-left:250px;
		margin-top:50px;
	}
</style>
</head>
<body>
<div>
<form action="${pageContext.request.contextPath }/FoodsController/uploadFoods.action"
 method="post" enctype="multipart/form-data">
	上传图片：<input type="file" name="image"><br />
	菜名：<input type="text" name="fname"><br />
	单价：<input type="text" name="fmoney"><br />
	<input type="submit" value="提交">
</form>
</div>
</body>
</html>