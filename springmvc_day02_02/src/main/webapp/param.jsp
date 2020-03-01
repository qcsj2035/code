<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="para/test01?id=1">test01</a><br>
<a href="para/test02?id=1&username=admin">test02</a><br>
<form action="para/test04" method="post">
    编号:<input type="text" name="id"><br>
    用户名:<input type="text" name="username"><br>
    爱好:
    <input type="checkbox" name="hobbies" value="a">
    <input type="checkbox" name="hobbies" value="b">
    <input type="checkbox" name="hobbies" value="c">
    <input type="submit" value="提交">
</form>
</body>
</html>
