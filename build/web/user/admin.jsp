
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        
    <link href="../csss/3.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <div class="container">
            <div class="box">
                <form action="../AdminLoginServlet" method="post">
                <h1>Admin Login Account</h1>
                <form action="adminCreate.jsp" method="post">
                <p>Username</p>
                <input type="text" placeholder="username" name="username" required>
                <p>Email</p>
                <input type="text" placeholder="email" name="email" required>
                <p>Password</p>
                <input type="password" placeholder="password" name="password" required>
                <input type="submit" value="Login">
                
                <a href="../ilkGiris.jsp">Giris sayfasına geri dön.</a>
                </form>
</div>
</div>

</body>
</html>