<%@ page contentType="text/html; charset=UTF-8" %>
아이디 : ${param.userId}<br>
비밀번호 : ${param.userPw}<br>
취미 : ${param.hobby}<br>
${paramValues.hobby[0]},
${paramValues.hobby[1]},
${paramValues.hobby[2]},
${paramValues.hobby[3]},
${paramValues.hobby[4]},
Referer : ${header.Referer}<br>
User-agent : ${header['User-Agent']}<br>
initParam : ${initParam.key1}<br>
requestURI : ${pageContext.getRequest().getRequestURI()}<br>
requestURI : ${pageContext.request.requestURI}<br>