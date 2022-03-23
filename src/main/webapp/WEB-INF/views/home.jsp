
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>Home Page</title>
</head>
<body>

<h1>Expense-Tracker</h1>
<a href="${contextRoot}/expense">Add Expense</a>


<p>${message}</p>

<c:forEach var="expense" items="${expenses}">

<div>
<h3>${expense.getExpensename()}</h3>
<p>&#8377;${expense.getAmount()}</p>
<a href="${contextRoot}/expense/${expense.getId()}">Edit</a>
</div>

</c:forEach>




</body>
</html>