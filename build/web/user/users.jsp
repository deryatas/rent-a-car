

<%@page import="userdao.Userlist"%>
<%@page import="java.util.List"%>
<%@page import="userdao.User"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 List<User> userliste = new Userlist().getirTumListe();
 request.setAttribute("userliste", userliste);
%>
<%
 int toplamUser = new Userlist().getirTumKullanici();
 request.setAttribute("toplamUser",toplamUser);
%>
<!DOCTYPE html>
<html>
     <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

        <title>CRUD Application</title>

        <style>
            .inner{
                margin: 15px 0;
            }
        </style>
    </head>
<body>
    <div  class="container-fluid">
            <nav class="navbar navbar-light">
                <a class="navbar-brand">Üye Listesi</a>
               
                   <li><a class="nav-link text-dark " href="../AdminLogoutServlet">ÇIKIŞ</a></li>
                   
                
</nav>
        </div>
 <table class="table table-sm table-hover table-bordered table-striped" style="text-align:center">
                        <thead class="thead-light">
                            <tr>
                               
                                <th>Name</th>
                                <th>Surname</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Yaş</th>
                                <th></th>
                            </tr>
                         </thead>
                        <tbody>
                        <c:forEach items="${userliste}" var="userliste">
                            <tr>
                                <td class="align-middle">${userliste.name}</td>
                                <td class="align-middle">${userliste.surname}</td>
                                <td class="align-middle">${userliste.email}</td>
                                <td class="align-middle">${userliste.phone}</td>
                                <td class="align-middle">${userliste.date}</td>
                                
                                <td><a href="../DeleteServlet?id=<c:out value='${userliste.id}' />">Sil</a></td>
                               
                            </tr>
                      
                        </c:forEach>
                    </tbody>
                    </table>
         <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>


