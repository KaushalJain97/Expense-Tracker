<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>Home Page</title>
</head>
<body>

<h1>Add Expenses</h1>

<form:form action="${contextRoot}/expense" method="post" modelAttribute="expenses">
<form:input path="expensename" Placeholder="Enter Expense Name" />
<form:input path="amount" Placeholder="Enter the Amount" />
<form:textarea path="note" Placeholder="Enter Note"/>
<button type="submit">Add Expense</button>




</form:form>




</body>
</html>