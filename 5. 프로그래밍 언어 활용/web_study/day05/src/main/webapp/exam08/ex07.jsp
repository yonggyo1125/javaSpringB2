<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="date" class="java.util.Date" />
<h1>Asia/Seoul</h1>
<fmt:timeZone value="Asia/Seoul">
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
</fmt:timeZone>

<h1>America/New_York</h1>
<fmt:timeZone value="America/New_York">
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
</fmt:timeZone>

<h1>Asia/Jakarta</h1>
<fmt:timeZone value="Asia/Jakarta">
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
</fmt:timeZone>

<h1>Asia/Hong_Kong</h1>
<fmt:timeZone value="Asia/Hong_Kong">
    <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
</fmt:timeZone>