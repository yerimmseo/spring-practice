<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3># 메뉴 조회</h3>

<table border="1" style="text-align: center">
	<tr>
		<td>메뉴 이름</td>
		<td>메뉴 가격</td>
		<td>그룹 아이디</td>
	</tr>
	<c:forEach var="i" begin="0" end="${menus.size() - 1 }">
		<tr>
			<td>${menus.get(i).cname }</td>
			<td>${menus.get(i).price }</td>
			<td>${menus.get(i).group_id }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>