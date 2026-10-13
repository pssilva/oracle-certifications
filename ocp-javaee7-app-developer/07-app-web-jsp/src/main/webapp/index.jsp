<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fn" uri="http://xmlns.jcp.org/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://xmlns.jcp.org/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head><title>Lab 07 · JSP</title></head>
<body>
<h1>JSP 2.3 + EL 3.0 + JSTL 1.2</h1>
<%-- include estático: tempo de tradução --%>
<%@ include file="/WEB-INF/fragments/header.jspf" %>

<p>Parâmetro name: <c:out value="${param.name}" default="(vazio)"/></p>
<p>EL 3.0 lambda: ${(x -> x * 2)(21)}</p>
<p>EL 3.0 concatenação: ${"Java " += "EE " += 7}</p>

<c:choose>
    <c:when test="${empty param.name}"><p>Informe ?name=...</p></c:when>
    <c:otherwise><p>Olá, ${fn:escapeXml(param.name)}!</p></c:otherwise>
</c:choose>

<p><a href="catalog">Catálogo (Servlet → JSP)</a> · <a href="boom.jsp">Gerar erro</a></p>
</body>
</html>
