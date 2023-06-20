<%-- 
    Document   : StudentHome
    Created on : 20-Jun-2023, 22:24:54
    Author     : minhf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/home.css">   
    </head>
    <body>
        <div>
            <header>
                <img src="../../img/fpt-university.jpg">
                <img src="../../img/download-application-button-apple-app-store-free-vector.jpg">
                <img src="../../img/download.jpg">
                <p>FAP mobile app (myFAP) is ready at</p>
            </header>
            <div class="header-bar">
                <a class="Home" href="../../view/home/StudentHome.jsp">Home</a>
                <div class="dropdown">
                    <img id="dropbtn" src="../../img/128-1280406_view-user-icon-png-user-circle-icon-png.jpg">
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
            </div>
            
         
            <a href="../../logout">Logout</a>
        </div>
        
        <div class="rooter">
            <p> Mọi góp ý, thắc mắc xin liên hệ: Phòng dịch vụ sinh viên: Email: <span>dichvusinhvien@fe.edu.vn.</span> Điện
                thoại: <span class="PhoneNumber">(024)7308.13.13</span></p>
            <p> © Powered by <span>University</span> | <span>CMS</span> | <span>library</span> | <span>books24x7</span></p>
        </div>
    </body>
</html>
