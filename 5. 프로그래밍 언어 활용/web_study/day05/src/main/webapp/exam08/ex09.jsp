<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/login" />
<%--
<fmt:bundle basename="messages.commons">
    <fmt:message key="USER_ID" />
</fmt:bundle>
--%>

<fmt:setBundle basename="messages.commons" />
<form method="post" action="${action}">
    <dl>
        <dt>
            <fmt:message key="USER_ID" />
        </dt>
        <dd>
            <input type="text" name="userId">
        </dd>
    </dl>
    <dl>
        <dt>
            <fmt:message key="USER_PW" />
        </dt>
        <dd>
            <input type="password" name="userPw">
        </dd>
    </dl>
    <button type="submit">
        <fmt:message key="LOGIN" />
    </button>
</form>