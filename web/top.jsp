<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>顶部页面</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
        }
        .title{
            font-size: 40px;
            color: #00d2ff;
            font-weight: 600;
            letter-spacing: 6px;
            padding-left: 50px;
            padding-top: 10px;
        }
        .user_message{
            position: absolute;
            right: 50px;
            bottom: 10px;
        }
    </style>
    <script type="text/javascript"></script>
</head>
<body>
<div class="title">学生宿舍管理系统</div>
<p class="user_message">用户:${user_message.name}</p>
</body>
</html>