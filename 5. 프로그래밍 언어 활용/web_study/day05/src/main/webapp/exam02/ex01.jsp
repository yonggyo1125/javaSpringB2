<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.ArrayList,java.util.List,java.util.Arrays" %>
<%@ page info="JSP 디렉티브 태그 연습..." %>
<%
List<String> fruits = Arrays.asList("사과", "배", "포도");
out.write(fruits.toString());
%>
<%=getServletInfo()%>