<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>左侧页面</title>

</head>
<body>
<ul>
    <li><a href="/myWeb/index.jsp" target="right">主页</a></li>
    <li ${user_message.role_id < 1 ? "":"hidden"}><a href="/myWeb/staffManage.jsp" target="right">宿舍管理员管理</a></li>
    <li ${user_message.role_id < 2 ? "":"hidden"}><a href="/myWeb/studentManager.jsp" target="right">学生管理</a></li>
    <li ${user_message.role_id < 2 ? "":"hidden"}><a href="/myWeb/buildManage.jsp" target="right">宿舍楼管理</a></li>
    <li><a href="/myWeb/record.jsp" target="rigth">缺勤记录</a></li>
    <li><a href="/myWeb/modifyPassword.jsp" target="right">修改密码</a></li>
    <li><a href="/myWeb/login_out" target="_top">退出系统</a></li>

</ul>
</body>
</html>