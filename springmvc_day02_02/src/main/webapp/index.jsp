<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
<script>
    $(function () {
        alert("ok");
        $.ajax({
            type:'post',
            // url:"user/param2",
            url:"para/test01",
            contentType:'application/json;charset=utf-8',
            // data:"id=3&username=admin1",
            data:"[{'id'='1','username'='admin1'},{'id'='2','username'='admin2'}]",
            success:function (data) {
                alert(data);
                // alert(data.id);
                // alert(data.username);
                // alert(data[0].username)
            }
        })
    })
</script>

</body>
</html>
