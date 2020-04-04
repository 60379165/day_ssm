<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: DGD--%>
<%--  Date: 2019/8/8--%>
<%--  Time: 12:58--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--&lt;%&ndash;<base href="http://localhost:8080/day_ssm_war_exploded/">&ndash;%&gt;--%>
<%--<html lang="zh-CN">--%>
<%--<head>--%>
<%--    <meta charset="utf-8">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1">--%>
<%--    <title>demo</title>--%>
<%--    &lt;%&ndash;<link href="css/bootstrap.min.css" rel="stylesheet">&ndash;%&gt;--%>
<%--    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">--%>

<%--</head>--%>
<%--<body>--%>
<%--<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->--%>
<%--&lt;%&ndash;<script  src="js/jquery-3.2.1.min.js"></script>&ndash;%&gt;--%>
<%--<script  src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>--%>
<%--<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->--%>
<%--&lt;%&ndash;<script  src="js/bootstrap.min.js"></script>&ndash;%&gt;--%>
<%--<script  src="<c:url value="/js/bootstrap.min.js"/>"></script>--%>
<%--<a href="account/findAll">点击查看所有用户</a>--%>

<%--<form method="post" action="account/login" >--%>
<%--    <div class="form-group" style="width: 200px"  >--%>
<%--        <label for="exampleInputEmail1">用户名</label>--%>
<%--        <input type="text" class="form-control" name="username" id="exampleInputEmail1" placeholder="id">--%>
<%--    </div>--%>
<%--    <div class="form-group"  style="width: 200px" >--%>
<%--        <label for="exampleInputPassword1">密码</label>--%>
<%--        <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="Password">--%>
<%--    </div>--%>
<%--    <div align="center" style="width: 200px"><button type="submit" class="btn btn-default">登录</button>     <a href="register.jsp" class="btn btn-default">注册</a></div>--%>

<%--</form>--%>

<%--</body>--%>
<%--</html>--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String  path =request.getContextPath();
    String basePath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>" >
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>管理员登录</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h1 style="text-align: center">人才公寓管理系统</h1>
    <br><br>
    <div style="float:right;"><a href="slogin.jsp">超级管理员登录</a>></div>
    <h3 style="text-align: center;">管理员登录</h3>
    <form action="house/login" method="post">
        <div class="form-group">
            <label for="username">用户名：</label>
            <input type="text" name="username" class="form-control" id="username" placeholder="请输入用户名"/>
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码"/>
        </div>
        <hr/>
        <div class="form-group" style="text-align: center;">
            <input class="btn btn btn-primary" type="submit" value="登录">

        </div>

    </form>
    <div >没有账户？<a href="register.jsp">立即注册</a></div>

</div>
</body>
</html>