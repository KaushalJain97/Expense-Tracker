<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>Edit Page</title>
</head>
<body>

<h1>Edit Expense</h1>

<form:form action="${contextRoot}/expense" method="post" modelAttribute="expense">
<form:input path="expensename" Placeholder="${expense.getExpensename()}" />
<form:input path="amount" Placeholder="${expense.getAmount()}" />
<form:textarea path="note" Placeholder="${expense.getNote()}"/>
<button type="submit">Add Expense</button>




</form:form>
<a href="${contextRoot}/expense/${expense.getId()}/delete">Delete</a>



</body>
</html>