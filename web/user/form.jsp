

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
            <div class="regbox box">
                
                <h1>Register Account</h1>
<form action="../RegisterServlet" method="post">
   

                   <p>name</p>
<input type="text" placeholder="name" name="name" required>
    <p>surname</p>
<input type="text" placeholder="surname" name="surname" required>
    <p>Email</p>
<input type="text" placeholder="email" name="email" required>
                   
    <label for="phone">Enter your phone number:</label>
<input type="text" placeholder="phone" name="phone" >
   <p>Password</p>
<input type="password" placeholder="password" name="password" required> 
 <p>Yaş</p>
<input type="date" placeholder="date" name="date" required> 
    <p>Ehliyet</p>
<input type="text" placeholder="ehliyet" name="ehliyet" required> 
    
                   <input type="submit" value="Register"> 
                       
                       </form>
                 <a href="index.jsp">Zaten bir hesabınız varsa tıklayınız.</a>
                         <a href="../ilkGiris.jsp">Giriş sayfasına gidiniz</a>
                        
</div>
</div>
    </form>
</body>
</html>