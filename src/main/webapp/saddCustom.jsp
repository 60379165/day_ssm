<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<base href="http://localhost:8080/day_ssm_war_exploded/">--%>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加租户信息</title>
    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">

</head>
<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<%--<script  src="js/jquery-3.2.1.min.js"></script>--%>
<script  src="<c:url value="/js/jquery-2.1.0.min.js"/>"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<%--<script  src="js/bootstrap.min.js"></script>--%>
<script  src="<c:url value="/js/bootstrap.min.js"/>"></script>
<h3>添加租户</h3>

<%--<c:forEach var="account" items="${update}">--%>
<form  method="post" action="custom/save2">
    <table  class="table">
        <tr>

            <td>姓名：<input type="text" placeholder="请输入姓名" name="name" id="name"></td>
            <td>号码：<input type="text" placeholder="请输入号码" name="phone" id="phone"></td>
            <td>性别：<input type="text" placeholder="请输入性别" name="sex" id="sex"></td>
            <td>房屋号：<input type="text" placeholder="请输入房屋号" name="hid" id="hid"></td>
            <%-- <td>
                 <a href="../account/update/"+${account.username}>修改</a>
             </td>--%>
            <td><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
<%--</c:forEach>--%>
</body>
</html>
