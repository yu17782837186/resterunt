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
<table align="center" border="1" cellspacing="0">
	<tr>
		<td>
			<table width="400" border="1" cellspacing="0">
				<c:forEach items="${listFoodsAll }" var="f" varStatus="i">
					<c:if test="${i.index%6==0}">
						<tr>
					</c:if>
						<td>
							<img src="image/${f.fimage}" width="140" height="180"><br>
							<span>${f.fname }</span><br>
							<span>${f.fmoney }￥&nbsp;&nbsp;</span>
							<a href="${pageContext.request.contextPath }/CarController/addCar.action?fid=${f.fid }">加入购物车</a>
						</td>
					<c:if test="${i.index%6==5}">
						</tr>
					</c:if>
				</c:forEach>
			</table>
		</td>
	</tr>
</table>

</body>
</html>