<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">

		<tr>
			<td><jsp:include page="menuPage.jsp"></jsp:include></td>
		</tr>
		<tr>
			<td>
			<h3>Register here</h3>
			<s:url var="user_reg" value="register_user"></s:url>
			<f:form action="${user_reg}" method="post">
					<table>

						<tr>
							<td>UserId</td>
							<td><input type="text" name="userId" /></td>
						</tr>
						<tr>
							<td>Name</td>
							<td><input type="text" name="name" /></td>
						</tr>
						<tr>
							<td>LoginId</td>
							<td><input type="text" name="loginId" /></td>
						</tr>
						<tr>
							<td>mail</td>
							<td><input type="text" name="mail" /></td>
						</tr>
						<tr>
							<td>mobile</td>
							<td><input type="text" name="mobile" /></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td>
								<button type="submit">Register</button>
							</td>
						</tr>
					</table>
				</f:form></td>
		</tr>
	</table>

</body>
</html>