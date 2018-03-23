<%--
  Created by IntelliJ IDEA.
  User: zhanghesheng
  Date: 2018/3/2
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="user/login.do" method="post">
<table>
    <tr>
        <td>用户名</td>
        <td><input type="text" name="userName"/></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="text" name="password"/></td>
    </tr>
    </tr><input type="submit" value="登录"></tr>
</table>
</form>
</body>
</html>
