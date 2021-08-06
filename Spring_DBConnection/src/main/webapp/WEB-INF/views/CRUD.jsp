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

<h3># CRUD 연습</h3>
<ul>
	<li>java1 DB계정에 적당한 주제로 테이블을 새로 하나 만드세요 (컬럼은 3개 정도)</li>
	<li>해당 테이블에 대한 CRUD를 Mybatis로 구현해보세요</li>
</ul>

<hr>
<h4>(Menus)</h4>
<a href="<c:url value='/menus/insert' />">추가하러가기</a> <br>
<a href="<c:url value='/menus/select' />">조회하러가기</a> <br>
<a href="<c:url value='/menus/update' />">수정하러가기</a> <br>
<a href="<c:url value='/menus/delete' />">삭제하러가기</a> <br>

<hr>
<h4>(Menu)</h4>
<a href="./add">추가하러가기</a> <br>

</body>
</html>