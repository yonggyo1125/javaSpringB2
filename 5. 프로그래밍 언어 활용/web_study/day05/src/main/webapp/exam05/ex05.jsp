<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="member" class="models.members.Member" scope="page" />
<%
    Member member1 = (Member)pageContext.getAttribute("member");
    Member member2 = (Member)request.getAttribute("member");
    Member member3 = (Member)application.getAttribute("member");
%>
pageContext : <%=member1%><br>
request : <%=member2%><br>
application: <%=member3%><br>