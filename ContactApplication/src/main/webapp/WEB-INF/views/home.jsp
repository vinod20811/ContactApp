<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home page</h1>
	<table>
		<tr>
			<jsp:include page="pageHeader.jsp"></jsp:include>
		</tr>
		<tr>
			<jsp:include page="menuPage.jsp"></jsp:include>
		</tr>
	</table>
</body>
</html>