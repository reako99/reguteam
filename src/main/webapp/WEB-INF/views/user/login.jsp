<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form action="login" method="post">
<input type="text" name="userId" placeholder="아이디"><br>
<input type="password" name="password" placeholder="패스워드"><br>
<input type="submit" value="로그인">
</form>
<button onclick="location.href='register'">회원가입</button>
</body>
</html>