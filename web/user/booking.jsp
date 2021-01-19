
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
    <link href="../csss/3.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        
    <title>JSP Page</title>
</head>
<body>
     <div class="container">
            <div class="regbox box">
    <h1>Kiralama İşlemleri</h1>
    <form action="../KiralaServlet" method="post">
        <p>Alış Tarihi</p>
        <input type="date" placeholder="AlisTarihi" name="alis_tarihi" required>
        <p>Veris Tarihi</p>
        <input type="date" placeholder="VerisTarihi" name="veris_tarihi" required>
        <p>Email</p>
        <input type="text" placeholder="odeme" name="odeme" required>
           
            <input type="submit" value="Kirala"> 
            </div>
     </div>
</form>
</body>
</html>
