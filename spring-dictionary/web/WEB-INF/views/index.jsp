<%--
  Created by IntelliJ IDEA.
  User: admin1
  Date: 18/04/2019
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary" method="post">
    English:<label>
    <input type="text" name="english" value="${english}"/>
</label>
    <br/>
    Vietnamese:<label>
    <input type="text" value="${vietnamese}"/>
</label>
    <br/>
    <input type="submit" value="Search">
</form>
</body>
</html>
