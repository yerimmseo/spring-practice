<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUD Home</title>
</head>
<body>

<h3># CRUD 연습에 사용했던 테이블을 통해 다음을 만들어주세요</h3>
<ol>
	<li>갱신 버튼을 누르면 페이지가 변하지 않으면서 CRUD 테이블의 모든 내용을 display 테이블에 출력한다.
		(가장 최근에 추가한 것이 맨 위에 등장해야 함)</li>
	<li>display 테이블의 맨 윗줄에는 새로운 행을 추가할 수 있는 입력란이 존재하고
		추가 버튼을 누르면 페이지가 변하지 않으면서 추가와 함께 테이블 목록이 갱신된다</li>
	<li>display 테이블의 데이터 행의 맨 오른쪽에는 삭제 버튼이 존재하며 삭제 버튼을 누르면
		해당 행이 삭제되며 테이블 목록이 갱신된다.</li>
</ol>

<table>
	<tr>
		<td>메뉴 이름:</td>
		<td><input type="text" id="cname"></td>
	</tr>
	<tr>
		<td>메뉴 가격:</td>
		<td><input type="number" id="price"></td>
	</tr>
	<tr>
		<td>그룹 아이디:</td>
		<td><input type="number" id="group_id"></td>
	</tr>
	<tr><td><button id="update">갱신</button></td></tr>
</table>
<br>
<table id="display" border="1">
	<c:forEach var="i" begin="0" end="${menus.size() - 1 }">
		<tr>
			<td>${menus.get(i).cname }</td>
			<td>${menus.get(i).price }</td>
			<td>${menus.get(i).group_id }</td>
			<td><button>삭제</button></td>
		</tr>
	</c:forEach>
</table>

<script src="<%=request.getContextPath() %>/resources/js/crud_home.js">

</script>

</body>
</html>