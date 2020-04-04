<%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>--%>
<%--<base href="http://localhost:8080/day_ssm_war_exploded/">--%>
<%--<html lang="zh-CN">--%>
<%--<head>--%>
<%--    <meta charset="utf-8">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1">--%>
<%--    <title>注册页面</title>--%>
<%--    <link href="css/bootstrap.min.css" rel="stylesheet">--%>
<%--</head>--%>
<%--<body>--%>
<%--<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->--%>
<%--<script  src="js/jquery-3.2.1.min.js"></script>--%>
<%--<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->--%>
<%--<script  src="js/bootstrap.min.js"></script>--%>
<%--<form  method="post" action="account/save">--%>
<%--    <table align="center" class="table">--%>
<%--        <tr><th colspan="2">用户注册</th></tr>--%>
<%--        <tr><td>用户名：</td>--%>
<%--            <td> <input type="text" name="username" placeholder="请输入注册用户名"></td></tr>--%>
<%--        <tr><td>密码：</td>--%>
<%--            <td> <input type="password" name="password" placeholder="请输入注册密码"></td></tr>--%>
<%--        <tr><td colspan="2" align="center"><input type="submit" value="注册"></td> </tr>--%>
<%--    </table>--%>
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

<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" href="css/register.css">
    <script src="js/jquery-2.1.0.min.js"></script>

</head>
<body>
<div id="header"></div>
<div class="rg_layout">
    <div class="rg_form clearfix">
        <div class="rg_form_left">
            <p>管理员注册</p>
            <p>ADMIN REGISTER</p>
        </div>
        <div class="rg_form_center">

            <form action="account/save" method="post">
                <input type="hidden" name="action" value="register">
                <table style="margin-top: 25px;">
                    <tr>
                        <td class="td_left">
                            <label for="username">用户名</label>
                        </td>
                        <td class="td_right">
                            <input type="text" id="username" name="username" placeholder="请输入账号">
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left">
                            <label for="password">密码</label>
                        </td>
                        <td class="td_right">
                            <input type="text" id="password" name="password" placeholder="请输入密码">
                        </td>
                    </tr>

                    <tr>
                        <td class="td_left">
                        </td>
                        <td class="td_right check">
                            <input type="submit" class="submit" value="注册">
                            <span id="msg" style="color: red;"></span>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="rg_form_right">
            <p>
                已有账号？
                <a href="index.jsp">立即登录</a>
            </p>
        </div>
    </div>
</div>
</body>
</html>