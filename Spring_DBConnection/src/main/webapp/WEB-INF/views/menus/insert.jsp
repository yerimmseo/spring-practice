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

<h3># 메뉴 추가하기</h3>

<form action="<c:url value='/menus/insert/menu'/>" method="GET">
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
		<tr><td><input type="submit" value="메뉴등록"></td></tr>
	</table>
</form>

</body>
</html>