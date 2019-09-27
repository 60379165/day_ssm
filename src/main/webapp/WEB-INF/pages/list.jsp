<%--
  Created by IntelliJ IDEA.
  User: DGD
  Date: 2019/8/8
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<base href="http://localhost:8080/day_ssm_war_exploded/">--%>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>demo</title>
    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">

</head>
<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<%--<script  src="js/jquery-3.2.1.min.js"></script>--%>
<script  src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<%--<script  src="js/bootstrap.min.js"></script>--%>
<script  src="<c:url value="/js/bootstrap.min.js"/>"></script>
<h3>查询所有的帐户</h3>
<form action="../account/findbyname" method="post">
    <input type="text" name="username">
    <input type="submit" value="查询用户名">
</form>
<form action="account/delete" method="post">
<table  class="table table-hover">
    <tr>

        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
<c:forEach items="${list}" var="account">
    <tr>
        <td>${account.id}</td>
        <td> ${account.username}</td>
        <td>${account.password}</td>
        <td><a href="../account/delete/${account.id}">删除</a>
        <a href="../account/findbyid/${account.id}">修改</a></td>
    </tr>
</c:forEach>
</table>
</form>
</body>
</html>