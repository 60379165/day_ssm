<%--
  Created by IntelliJ IDEA.
  User: DGD
  Date: 2019/8/8
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<base href="http://localhost:8080/day_ssm_war_exploded/">--%>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>demo</title>
    <%--<link href="css/bootstrap.min.css" rel="stylesheet">--%>
    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">

</head>
<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<%--<script  src="js/jquery-3.2.1.min.js"></script>--%>
<script  src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<%--<script  src="js/bootstrap.min.js"></script>--%>
<script  src="<c:url value="/js/bootstrap.min.js"/>"></script>
<a href="account/findAll">点击查看所有用户</a>

<%--<form  method="post" action="account/login">
    <table align="center" class="table" >
        <tr><th colspan="2">用户登录</th></tr>
        <tr><td>用户名：</td>
            <td> <input type="text" name="username" placeholder="请输入用户名"></td></tr>
        <tr><td>密码：</td>
            <td> <input type="password" name="password" placeholder="请输入密码"></td></tr>
        <tr><td colspan="2" align="center"><input type="submit" value="登录"></td> </tr>

    </table>
</form>--%>
<form method="post" action="account/login" >
    <div class="form-group" style="width: 200px"  >
        <label for="exampleInputEmail1">用户名</label>
        <input type="text" class="form-control" name="username" id="exampleInputEmail1" placeholder="id">
    </div>
    <div class="form-group"  style="width: 200px" >
        <label for="exampleInputPassword1">密码</label>
        <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div align="center" style="width: 200px"><button type="submit" class="btn btn-default">登录</button>     <a href="register.jsp" class="btn btn-default">注册</a></div>

</form>

</body>
</html>
