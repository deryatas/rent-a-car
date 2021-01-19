

<%@page import="araclist.araclarDatabase"%>
<%@page import="java.util.List"%>
<%@page import="araclist.Araclar"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 List<Araclar> aracliste = new araclarDatabase().getirTumAraclarListe();
 request.setAttribute("aracliste", aracliste);
%>
<%
 int toplamArac = new  araclarDatabase().getirTumAraclar();
 request.setAttribute("toplamArac",toplamArac);
%>
<html>
   
    <head>

       <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

  
        <style>
            .inner{
                margin: 15px 0;
            }
        </style>

        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../csss/1.css" rel="stylesheet" type="text/css"/>
       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
        </head>

        
        <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

        <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
         <div class="navbar-header">  
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
              
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            </button>
             
             </div>
            <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
            <li><a  href="../LogoutServlet"  >Çıkış</a></li>
            
             
            
            </ul>       
            </div>
            </div>
            </nav>
            
            
                
                
                 <div  class="container-fluid">
            <nav class="navbar navbar-light">
                
                <a class="navbar-brand">Araç Listesi</a>               
</nav>
        </div>
 <table class="table table-sm table-hover table-bordered table-striped" style="text-align:center">
                        <thead class="thead-light">
                            <tr>
                               
                                <th>Araç Tipi</th>
                                <th>Marka</th>
                                <th>Renk</th>
                                <th>Ucret</th>
                                <th>Durum</th>
                                <th></th>
                            </tr>
                         </thead>
                        <tbody>
                        <c:forEach items="${aracliste}" var="aracliste">
                            <tr>
                                <td class="align-middle">${aracliste.arac_tipi}</td>
                                <td class="align-middle">${aracliste.marka}</td>
                                <td class="align-middle">${aracliste.renk}</td>
                                <td class="align-middle">${aracliste.ucret}</td>
                                <td class="align-middle">${aracliste.durum}</td>
                               <td><a href="booking.jsp">Kirala</a></td>
                            </tr>
                        
                        </c:forEach>
                           
                    </tbody>
                    </table>
</div>
                

      
        
        
      </div>
            
    </div>
</form>


<!-- Container (Portfolio Section) -->
            <div id="portfolio" class="container-fluid text-center bg-grey">
            <h2>KİRALIK ARAÇLAR</h2><br>
            <div class="row text-center slideanim">
            <div class="col-sm-4">
            <div class="thumbnail">
            <img src="../resimler/slide-3.jpg" alt="" alt="" width="400" height="300"/>
           
            
            <p><strong>MERCEDES-BENZ</strong></p>

      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
         <img src="../resimler/slide-1.jpg" alt="" width="400" height="300"/>
        <p><strong>FİAT PALİO</strong></p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
         <img src="../resimler/slide-2.jpg" alt="" width="400" height="300"/>
        
        <p><strong>FORD FOCUS</strong></p>
      </div>
    </div>
  </div><br>
  

  
  
  <h2>SEN DE TERCİH ET KAZANAN OL</h2>
  <div id="myCarousel" class="carousel slide text-center" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

 



<footer class="container-fluid text-center">
  <a href="#myPage" title="To Top">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a>
</footer>


<script>
$(document).ready(function(){
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {
    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {
      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){
   
        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
  
  $(window).scroll(function() {
    $(".slideanim").each(function(){
      var pos = $(this).offset().top;

      var winTop = $(window).scrollTop();
        if (pos < winTop + 600) {
          $(this).addClass("slide");
        }
    });
  });
});
</script>


</body>
</html>