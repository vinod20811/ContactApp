<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>

	<table>
		<f:form action="/login_user" method="post">

			<tr>
				<jsp:include page="menuPage.jsp"></jsp:include>
			</tr>
			<tr>
				<td>
					Login Here
				</td>
			</tr>
			<tr>
				<td>UserId</td>
				<td><input type="text" name="userId" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>
					<button type="submit">LOGIN</button>
				</td>
			</tr>
		</f:form>
	</table>
</body>
</html>
