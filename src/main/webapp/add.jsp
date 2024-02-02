<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.Statement" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!int a = 23;%>
<body bgcolor="#efe">
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i + j;
	out.println("Output : " + k);
	pageContext.setAttribute("name", "rutvik", pageContext.SESSION_SCOPE);
	/* int f =9/0; */
	%>
	<br> number above is
	<%=k%>
</body>
</html>