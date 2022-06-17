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
                <li><a href="${pageContext.request.contextPath}/student/toAddStudent">添加学生</a></li>
            </ul>

            <form class="navbar-form navbar-left" action="${pageContext.request.contextPath}/student/queryStudent" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="${queryName}" name="queryStudentName">
                </div>
                <button type="submit" class="btn btn-default">查询</button>
            </form>

        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学生编号</th>
                    <th>学生名称</th>
                    <th>学生性别</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="student" items="${studentList}">
                    <tr>
                        <td>${student.id}</td>
                        <td>${student.name}</td>
                        <td>${student.sex}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/student/toUpdatePager?id=${student.id}">修改</a>
                            &nbsp;|&nbsp;
                            <a href="${pageContext.request.contextPath}/student/deleteStudent/${student.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>

</html>
