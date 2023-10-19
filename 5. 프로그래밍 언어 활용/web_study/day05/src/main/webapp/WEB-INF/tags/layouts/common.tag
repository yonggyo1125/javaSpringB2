<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
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
            <h1>헤더 영역...</h1>
        </header>
        <main>
            <jsp:doBody />
        </main>
        <footer>
            <h1>푸터 영역...</h1>
        </footer>
    </body>
</html>