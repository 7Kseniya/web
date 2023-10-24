<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>

<head>
    <title>main page</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="styles/general.css">
    <link rel="stylesheet" type="text/css" href="styles/form.css">
    <link rel="stylesheet" type="text/css" href="styles/table.css">


    <script type="text/javascript" charset="UTF-8"
            src="https://cdn.jsdelivr.net/npm/jsxgraph/distrib/jsxgraphcore.js"></script>
    <link rel="stylesheet"
          type="text/css" href="https://cdn.jsdelivr.net/npm/jsxgraph/distrib/jsxgraph.css" />

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="actions/validator.js"></script>
    <script src="actions/graph.js"></script>
    <script src="actions/script.js"></script>
</head>

<body>
<header>
    <div class="header-menu">
        <p>Ignatyeva K.A.<br> P3225</p>
        <p>var №861203</p>
    </div>
    <div><h1>laboratory work №2</h1></div>

    <a class="github-icon" href="https://github.com/7Kseniya/web/tree/dev" class="github">
        <svg height="32" aria-hidden="true" viewBox="0 0 16 16"  width="36" data-view-component="true" class="octicon octicon-mark-github v-align-middle color-fg-default">
            <path d="M8 0c4.42 0 8 3.58 8 8a8.013 8.013 0 0 1-5.45 7.59c-.4.08-.55-.17-.55-.38 0-.27.01-1.13.01-2.2 0-.75-.25-1.23-.54-1.48 1.78-.2 3.65-.88 3.65-3.95 0-.88-.31-1.59-.82-2.15.08-.2.36-1.02-.08-2.12 0 0-.67-.22-2.2.82-.64-.18-1.32-.27-2-.27-.68 0-1.36.09-2 .27-1.53-1.03-2.2-.82-2.2-.82-.44 1.1-.16 1.92-.08 2.12-.51.56-.82 1.28-.82 2.15 0 3.06 1.86 3.75 3.64 3.95-.23.2-.44.55-.51 1.07-.46.21-1.61.55-2.33-.66-.15-.24-.6-.83-1.23-.82-.67.01-.27.38.01.53.34.19.73.9.82 1.13.16.45.68 1.31 2.69.94 0 .67.01 1.3.01 1.49 0 .21-.15.45-.55.38A7.995 7.995 0 0 1 0 8c0-4.42 3.58-8 8-8Z"></path>
        </svg>
    </a>
</header>
<div class="data">
    <div class="left_side">
        <!-- graph div -->
        <div id="jxgbox" class="jxgbox"></div>

        <jsp:include page="form.jsp" />

    </div>
    <div class="right_side">
        <jsp:include page="table.jsp" />
    </div>
</div>
</body>

</html>