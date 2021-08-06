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

<h3>메뉴 업데이트</h3>

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

<form action="<c:url value='/menus/update/menu'/>" method="GET">
	<table>
		<tr>
			<td>메뉴 이름:</td>
			<td><input type="text" name="cname"></td>
		</tr>
		<tr>
			<td>메뉴 가격:</td>
			<td><input type="number" name="price"></td>
		</tr>
		<tr>
			<td>그룹 아이디:</td>
			<td><input type="number" name="group_id"></td>
		</tr>
		<tr><td><input type="submit" value="메뉴수정"></td></tr>
	</table>
</form>

</body>
</html>