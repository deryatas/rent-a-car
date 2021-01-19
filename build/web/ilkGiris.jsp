

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>İLK SAYFA</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  .bg-1 { 
    background-color: #f6f6f6;
    color: #01579B;
  }
  .bg-2 { 
    background-color: #f6f6f6;
    color: #01579B;
  }
  .bg-3 { 
    background-color: #f6f6f6;
    color:#01579B ;
  }
  .container-fluid {
    padding-top: 70px;
    padding-bottom: 70px;
    
  }


  </style>
</head>
<body>
    

<div class="container-fluid bg-1 text-center">
  <h3>AKDENİZ ARAÇ KİRALAMA</h3>
</div>

<div class="container-fluid bg-2 text-center">
  <input type="button" id="btn2" value="YÖNETiCİ GİRİŞ">
    <script>      
        document.getElementById("btn2")
            .onclick = function(){
                window.setTimeout(function(){location.href = "user/admin.jsp";}, 1500);                        
             };
    </script>
      
</div>

<div class="container-fluid bg-3 text-center">
<input type="button" id="btn" value="KULLANICI GİRİŞ">
    <script>      
        document.getElementById("btn")
            .onclick = function(){
                window.setTimeout(function(){location.href = "user/form.jsp";}, 1500);                        
             };
    </script>

  
</div>
<div class="container-fluid bg-3 text-center">
    <h1>İLK ÖNCE GİRİŞ YAPMALISINIZ</h1>
</div>

</body>
</html>
