<%@ page contentType="text/html;charset=UTF-8" errorPage="/error.jsp" %>
<%
    if (true) {
        throw new IllegalStateException("Erro proposital para testar error page");
    }
%>
