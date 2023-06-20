<%-- 
    Document   : login
    Created on : 15-Jun-2023, 23:48:46
    Author     : minhf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
            <meta charset="UTF-8">
            <title>Login</title>
            <link rel="stylesheet"  href="${pageContext.request.contextPath}/CSS/login.css">
        </head>
        <body>
            <div class="login-container">
                <h2>Login</h2>
                <form action="login" method="POST">
                    <div class="form-group">
                        <label for="username">Username:</label>
                        <input type="text" id="username" name="username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" id="password" name="password" required>
                    </div>
                     <button type="submit">Login</button>
                    </form>
                
            </div>
             <img src="img/trung-dung-ki-tuc-xa-sinh-vien-_dh_fpt.jpg" alt="Background Image">
                     </body>
</html>
             