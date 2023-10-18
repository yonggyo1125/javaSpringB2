<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag import="java.util.Map" %>
<%@ tag dynamic-attributes="attrs" %>
<%
    Map<String, String> attrs = (Map<String, String>)jspContext.getAttribute("attrs");
    System.out.println(attrs);
%>
color: ${attrs.color}, size: ${attrs.size}<br>