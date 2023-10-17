<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:if test="${param.num1 > param.num2}">
    num1이 num2보다 크다.
</c:if>