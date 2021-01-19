<%-- 
    Document   : index
    Created on : 15.Oca.2021, 19:02:44
    Author     : ASUS
--%>

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
                
                <h1>Login Account</h1>
                <form action="../LoginServlet" method="post">
                    <p>Username</p>
<input type="text" placeholder="email" name="email" required>
                    <p>Password</p>
<input type="password" placeholder="Password" name="password" required>
                    <input type="submit" value="Login">
                    <a href="form.jsp">Create New Account</a>
                    
                </form>
                 <a href="ilkGiris.jsp">Giriş sayfasına gidiniz</a>
</div>
</div>
</body>
</html>
