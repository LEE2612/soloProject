<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hi!Servlet!</h1>
<form action="index.do" method="get" enctype="application/x-www-form-urlencoded">
<!-- form태그는 액션 메서드 인크타입 국룰 잊지말것 태그 같은건 외우면 좋지만 그때그때 찾아가면서 자연스럽게 익혀갈것 -->
	<h2>ha!haha!</h2>
	<ul>
		<li>number1</li>
		<li>number2</li>
		<li>number3</li>
	</ul>
	<input type="text" name="name" />
	<button type="submit"> 전송버튼 </button>
</form>
<%
 String name = (String) request.getAttribute("name");
 if(name == null || name == ""){/* 화이트 스페이스 처리 "" || = or연산자 */
	 name = "없음";
	 
 }
%>
<h4>입력한 값 : <%= name %></h4>
</body>
</html>