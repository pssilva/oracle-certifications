<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://xmlns.jcp.org/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h1>Catálogo</h1>
<ul>
    <c:forEach var="book" items="${requestScope.books}" varStatus="s">
        <li>${s.count}. <c:out value="${book}"/></li>
    </c:forEach>
</ul>
</body>
</html>
