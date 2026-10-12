<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<body>
<h1>Ops!</h1>
<p>Exceção: ${pageContext.exception}</p>
<p>Status: ${pageContext.errorData.statusCode}</p>
</body>
</html>
