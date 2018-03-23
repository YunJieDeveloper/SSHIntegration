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
    <title>添加页面</title>
</head>
<body>
<form action="user/add.do" method="post">
<table>
    <tr>
        <td>姓名</td>
        <td><input type="text" name="name"/></td>
    </tr>
    <tr>
        <td>年龄</td>
        <td><input type="text" name="age"/></td>
    </tr>
    <tr>
        <td>备注</td>
        <td><input type="text" name="note"/></td>
    </tr><input type="submit" value="提交"></tr>
</table>
</form>
</body>
</html>
