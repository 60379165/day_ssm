<%--
  Created by IntelliJ IDEA.
  User: DGD
  Date: 2019/8/15
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<base href="http://localhost:8080/day_ssm_war_exploded/">
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script  src="js/jquery-3.2.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script  src="js/bootstrap.min.js"></script>
<form  method="post" action="account/save">
    <table align="center" class="table">
        <tr><th colspan="2">用户注册</th></tr>
        <tr><td>用户名：</td>
            <td> <input type="text" name="username" placeholder="请输入注册用户名"></td></tr>
        <tr><td>密码：</td>
            <td> <input type="password" name="password" placeholder="请输入注册密码"></td></tr>
        <tr><td colspan="2" align="center"><input type="submit" value="注册"></td> </tr>
</form>
</body>
</html>
