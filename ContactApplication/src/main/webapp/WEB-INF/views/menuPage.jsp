<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false" %>

<s:url var="url_home" value="/"></s:url>
<s:url var="url_loginPage" value="/loginPage"></s:url>
<s:url var="url_registerPage" value="/registerPage"></s:url>


<a href="${url_home}">Home</a> | <a href="${url_loginPage}">Login</a> | <a href="${url_registerPage}">Register</a> | <a href="">About us</a>
