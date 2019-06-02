<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019/6/2
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>GET请求</h3>
    <a href="/test01/111">test GET</a>
    <br>

    <h3>POST请求</h3>
    <form action="/test01" method="post">
        <input type="submit" value="test post">
    </form>
    <br>

    <h3>DELETE请求</h3>
    <form action="/test01/333" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="test delete">
    </form>
    <br>

    <h3>PUT请求</h3>
    <form action="/test01/444" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="test put">
    </form>
    <br>

</body>
</html>
