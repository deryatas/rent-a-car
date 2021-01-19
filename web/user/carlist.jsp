

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
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

  
        <style>
            .inner{
                margin: 15px 0;
            }
        </style>
    </head>
<body>
     <div  class="container-fluid">
            <nav class="navbar navbar-light">
                <a class="navbar-brand"></a>
                <form class="form-inline">
                    <li><a class="nav-link text-dark " href="../AdminLogoutServlet">ÇIKIŞ</a></li>
                </form>
</nav>
        </div>
    <div class="container">
            <div class="inner">
                <div class="row">
                    <div class="col-md-3">
                        <h3>Araç Ekleme</h3>
<form action="../AddAracServlet" method="post">
                            <div class="form-group">
                                <label>Arac Tipi</label>
                                <input class="form-control" name="arac_tipi" place-holder="Book Name" required>
                            </div>
<div class="form-group">
                                <label>Marka</label>
                                <input class="form-control" name="marka" place-holder="Book Name" required>
                            </div>
<div class="form-group">
                                <label>Renk</label>
                                <input class="form-control" name="renk" place-holder="Book Name" required>
                            </div>
<div class="form-group" >
                                <label>Ucret</label>
                                <select id="inputState" class="form-control" name="ucret" required>
                                    <option selected disabled>Ücreti Belirle</option>
                                    <option value="900">900</option>
                                    <option value="1000">1000</option>
                                    <option value="300">300</option>
                                    <option value="450">450</option>
                                </select>
                                <div class="form-group">
                                <label>Durum</label>
                                <input class="form-control" name="durum" place-holder="Book Name" required>
                            </div>
                            </div>
<button type="submit" class="btn btn-primary">Submit</button>
                            <button type="reset" class="btn btn-primary">Reset</button>
                        </form>
</div>
    
   

                                 <div  class="container-fluid">
            <nav class="navbar navbar-light">
                <a class="navbar-brand">Kayıtlı Araç Listesi</a>               
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
                                
                                <td><a href="../AracDeleteServlet?id=<c:out value='${aracliste.id}'/>">Sil</a></td>
                               
                            </tr>
                      
                        </c:forEach>
                    </tbody>
                    </table>
</div>
                           </div>
                    </div>
                    
    
   


         <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>

