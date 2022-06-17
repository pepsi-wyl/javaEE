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
                <li class="active"><a href="${pageContext.request.contextPath}/student/allStudent">所有学生</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container">
    <form action="${pageContext.request.contextPath}/student/updateStudent" method="post">
        <input type="hidden" name="id" value="${student.id}" >
        <div class="form-group">
            <label for="name">书籍名称</label>
            <input type="text" class="from-control" id="name" name="name" value="${student.name}" required>
        </div>
        <div class="form-group">
            <label for="sex">书籍数量</label>
            <input type="text" class="from-control" id="sex" name="sex" value="${student.sex}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="from-control" id="submit" value="修改">
        </div>
    </form>
</div>
</body>
</html>