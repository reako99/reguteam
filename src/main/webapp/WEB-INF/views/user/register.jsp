<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form action="register" method="post">
<input type="text" name="userId" placeholder="아이디"><button>중복확인</button><br>
<input type="password" name="password" placeholder="비밀번호"><br>
<input type="password" name="passwordCheck" placeholder="비밀번호확인"><br>
<input type="text" name="nickname" placeholder="닉네임"><br>
<input type="text" name="phone" placeholder="전화번호(010-****-****)"><br>
<input type="email" name="email" placeholder="이메일"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>