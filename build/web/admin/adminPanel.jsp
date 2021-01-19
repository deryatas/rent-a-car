<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Admin Paneli</title>
    <link rel="stylesheet" href="css/Home.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">

</head>

<body class=".bg-dark">

    <div class="nava fx" style="width: 100%">
        <nav class="navbar navbar-primary ml">

            
            <ul class="nav justify-content-end mt-3 mr-5 " style="margin-left: 1200px;">
                <li class="nav-item  ">
                    <a class="nav-link text-dark " href="../LogoutServlet">Çıkış</a>
                
                </li>
                
            </ul>
        </nav>

        <div class="alert  bg-primary opak2 fx " style="width:100%;" role="alert">
            <ul class="mb-4 ml-5 ul1">

                <div id="list-example">
                    
                    <li class="li1"><a class="nav-link text-dark " href="../user/users.jsp">Musteriler</a></li>
                    <li class="li1"><a class="nav-link text-dark " href="../user/carlist.jsp">Arac Listesi</a></li>
                    
                    <li class="li1"><a class="nav-link text-dark " href="../user/newjsp.jsp">Rezervasyonlar</a></li>
                </div>

            </ul>
            
        </div>
    </div>






    <div data-spy="scroll" data-target="#list-example" data-offset="0" class="scrollspy-example mt-3">



 </div>




        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>

</html>


