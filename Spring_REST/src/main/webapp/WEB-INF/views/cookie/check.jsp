<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인을 체크하는 페이지</title>
	<c:if test="${login == '1' }">
		<style>
			h1 {
				color: blue;
			}	
		</style>
	</c:if>
	
	<c:if test="${login != '1' }">
		<style>
			h1 {
				color: red;
			}
		</style>
	</c:if>
</head>
<body>

<h1>로그인 상태에서 파랗게 보이는 글씨</h1>

</body>
</html>