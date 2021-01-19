
<%@page import="Kontroller.KiralaList"%>
<%@page import="Kontroller.Kirala"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
 List<Kirala> kiraliste = new KiralaList().getirTumKiralaListe();
 request.setAttribute("kiraliste", kiraliste);
%>
<%
 int toplamkira = new  KiralaList().getirTumKira();
 request.setAttribute("toplamkira",toplamkira);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
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
      <div  class="container-fluid">
            <nav class="navbar navbar-light">
                <a class="navbar-brand">Kayıtlı Rezervasyonlar</a>               
</nav>
        </div>
 <table class="table table-sm table-hover table-bordered table-striped" style="text-align:center">
                        <thead class="thead-light">
                            <tr>
                               
                                <th>Alış Tarihi</th>
                                <th>Veriş Tarihi</th>
                                <th>Ödeme</th>
                                <th></th>
                                <th></th>
                                <th></th>
                            </tr>
                         </thead>
                        <tbody>
                        <c:forEach items="${kiraliste}" var="kiraliste">
                            <tr>
                                <td class="align-middle">${kiraliste.alis_tarihi}</td>
                                <td class="align-middle">${kiraliste.veris_tarihi}</td>
                                <td class="align-middle">${kiraliste.odeme}</td>
                                <td></td>
                                <td></td>
                                
                             
                                <td><a href="../KiralaDeleteServlet?id=<c:out value='${kiraliste.id}'/>">Sil</a></td>
                               
                            </tr>
                      
                        </c:forEach>
                    </tbody>
                    </table>
</div>
</body>
</html>
