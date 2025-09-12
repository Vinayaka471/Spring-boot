<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f4f4; }
        .login-container {
            width: 300px;
            margin: 100px auto;
            padding: 30px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0,0,0,0.3);
            border-radius: 8px;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover { background-color: #0056b3; }
        .error { color: red; text-align: center; }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <form action="login" method="post">
        <label>Email:</label>
        <input type="text" name="userEmail" required /><br/>
        <label>Password:</label>
        <input type="password" name="userPassword" required /><br/>
        <button type="submit">Login</button>
    </form>
    <c:if test="${not empty param.error}">
        <p class="error">Invalid email or password</p>
    </c:if>
</div>
</body>
</html>
