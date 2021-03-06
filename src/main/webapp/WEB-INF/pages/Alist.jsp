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
    <style>

        .clickstyle {
            background: #4E7CA0;
            color: #ffffff;
        }

    </style>

    <script type="text/javascript">

        window.onload = function(){
            document.getElementById("delSelected").onclick = function(){
                if(confirm("您确定要删除选中条目吗？")){
                    var flag = false;
                    var cbs = document.getElementsByName("hid");
                    for (var i = 0; i < cbs.length; i++) {
                        if(cbs[i].checked){
                            flag = true;
                            break;
                        }
                    }
                    if(flag){
                        document.getElementById("form").submit();
                    }
                }
            }
            document.getElementById("firstCb").onclick = function(){
                var cbs = document.getElementsByName("hid");
                for (var i = 0; i < cbs.length; i++) {
                    cbs[i].checked = this.checked;
                }
            }
            var oLis=document.getElementsByTagName("li");
            var i,j;
            var length=4;
            for(i=0;i<length;i++){
                oLis[i].onclick=function(){
                    for(j =0;j<length;j++){
                        oLis[j].className="";
                    }
                    this.className+="clickstyle";
                }
            }
        }
        function replaceDoc()
        {
            window.location.replace("http://localhost:8080/day_ssm_war_exploded/account/findAll")
        }
    </script>

<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<%--<script  src="js/jquery-3.2.1.min.js"></script>--%>
<script  src="<c:url value="/js/jquery-2.1.0.min.js"/>"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<%--<script  src="js/bootstrap.min.js"></script>--%>
<script  src="<c:url value="/js/bootstrap.min.js"/>"></script>

<div class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#" onclick="replaceDoc()">RUA</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <%--                    <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>--%>
                    <li className=""><a class="active" href="../custom/findAll2;">租户管理</a></li>
                    <li className=""><a  href="../order/findAll2">租赁管理</a></li>
                    <li className=""><a href="../house/findAll2">房屋管理</a></li>
                    <li > <a href="javascript:void(0)">用户管理</a></li>
                </ul>
                <form class="navbar-form navbar-left" action="../account/findbyname" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control" name="search" placeholder="输入管理员姓名">
                    </div>
                    <button type="submit" class="btn btn-default">筛选</button>
                </form>
                <ul class="nav navbar-nav">
                    <li><a  href="javascript:void(0);" id="delSelected">删除选中</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="../addAccount.jsp">添加信息</a></li>
                    <li class="dropdown">
                        <a href="../#">注销</a>

                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
    <h1 style="text-align: center">管理员列表</h1>
<%--    <div style="float: right;margin: 5px;">--%>
<%--        <a class="btn btn-primary" href="${pageContext.request.contextPath}/addAccount.jsp">添加管理员</a>--%>
<%--        <a class="btn btn-primary" href="${pageContext.request.contextPath}/house/findAll2">房源管理</a>--%>
<%--        <a class="btn btn-primary" href="${pageContext.request.contextPath}/order/findAll2">租赁管理</a>--%>
<%--        <a class="btn btn-primary" href="../custom/findAll2">租户管理</a>--%>
<%--    </div>--%>
<form  id="form" action="../account/deleteAll" method="post">
<table  class="table table-hover">
    <tr>
        <th><input type="checkbox" id="firstCb"></th>
        <th>序号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="a" varStatus="s">
        <tr>
            <td><input type="checkbox" name="hid" value="${a.id}"></td>
            <td>${s.count}</td>
        <td> ${a.username}</td>
        <td>${a.password}</td>
        <td><a href="../account/delete/${a.id}">删除</a>
        <a href="../account/findbyid/${a.id}">修改</a></td>
    </tr>
</c:forEach>
</table>
</form>
</div>
</body>
</html>