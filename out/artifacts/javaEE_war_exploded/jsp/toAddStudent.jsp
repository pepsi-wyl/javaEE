<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>学生展示</title>
    <%--bootStrop美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/student/allStudent">所有学生</a></li>
                <li class="active"><a href="${pageContext.request.contextPath}/student/toAddStudent">添加学生<span
                        class="sr-only">(current)</span></a></li>
            </ul>

<%--            <form class="navbar-form navbar-left" action="${pageContext.request.contextPath}/student/queryStudent"--%>
<%--                  method="post">--%>
<%--                <div class="form-group">--%>
<%--                    <input type="text" class="form-control" placeholder="${queryName}" name="queryStudentName">--%>
<%--                </div>--%>
<%--                <button type="submit" class="btn btn-default">查询</button>--%>
<%--            </form>--%>

        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">
    <form action="${pageContext.request.contextPath}/student/addStudent" method="post">

        <div class="form-group">
            <label for="name">学生名称</label>
            <input type="text" class="from-control" id="name" name="name" required>
        </div>

        <div class="form-group">
            <label for="sex">学生性别</label>
            <input type="text" class="from-control" id="sex" name="sex" required>
        </div>

        <div class="form-group">
            <input type="submit" class="from-control" id="submit" value="添加">
        </div>

    </form>

</div>
</body>

</html>
