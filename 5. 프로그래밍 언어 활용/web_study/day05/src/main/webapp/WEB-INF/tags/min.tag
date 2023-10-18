<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="num1" type="java.lang.Integer" required="true" %>
<%@ attribute name="num2" type="java.lang.Integer" required="true" %>
<%@ attribute name="var" required="true" %>
<%@ variable name-from-attribute="var" alias="minimum" variable-class="java.lang.Integer" scope="AT_END" %>

<c:set var="minimum" value="${num1 > num2 ? num2 : num1}" />