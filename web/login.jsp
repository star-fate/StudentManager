<%--
  Created by IntelliJ IDEA.
  User: 范志文
  Date: 2021/2/25
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>

//jsp文件会自动创建Session 而 html 文件则不会    
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,
		initial-scale=1.0">
    <title>登录</title>
    <link rel="stylesheet" href="css/login_in.css" />
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">

    </script>
</head>
<body>
<section>
    <!-- 背景色 -->
    <div class="color"></div>
    <div class="color"></div>
    <div class="color"></div>
    <div class="box">
        <!-- 背景圆 -->
        <div class="circlre" style="--x:0"></div>
        <div class="circlre" style="--x:1"></div>
        <div class="circlre" style="--x:2"></div>
        <div class="circlre" style="--x:3"></div>
        <div class="circlre" style="--x:4"></div>
        <!-- 登录框 -->
        <div class="container">
            <div class="form">
                <h2>登录</h2>
                <form action="/myWeb/login_in" method="post">
                    <div class="inputBox">
                        <input type="text" placeholder="学号" name="stu_code">
                    </div>
                    <div class="inputBox">
                        <input type="password" placeholder="密码" name="password">
                    </div>
                    <div class="inputBox">
                        <input type="submit" value="登录">
                        <span>${error_message}</span>
                    </div>
                    <input type="checkbox" name="remember" value="remember_me">记住我
                    <p class="forget"><a href="#">忘记密码？</a></p>
                    <p class="forget"><a href="/myWeb/login_register.html">没有账户，注册账号！</a></p>
                </form>
            </div>
        </div>
    </div>
</section>
</section>
</body>
</html>

