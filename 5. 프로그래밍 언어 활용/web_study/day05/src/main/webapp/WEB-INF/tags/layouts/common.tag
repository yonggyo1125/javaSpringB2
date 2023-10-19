<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<c:url var="commonCss" value="/css/style.css" />
<c:url var="commonJs" value="/js/common.js" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>사이트 제목...</title>
        <link rel="stylesheet" type="text/css" href="${commonCss}">
        <script src="${commonJs}"></script>
    </head>
    <body>
        <header>
            <jsp:invoke fragment="header" />
        </header>
        <main>
            <jsp:doBody />
        </main>
        <footer>
            <jsp:invoke fragment="footer" />
        </footer>
    </body>
</html>