<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.core.Authentication" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="alert alert-success">
            <%
                Authentication auth = SecurityContextHolder.getContext().getAuthentication();
                String username = auth.getName();
            %>
            <h3>Welcome, <%= username %> 🎉</h3>
            <p>You have successfully logged in.</p>
        </div>

        <a href="${pageContext.request.contextPath}/dashboard" class="btn btn-primary">Go to Dashboard</a>
        <a href="${pageContext.request.contextPath}/logout" class="btn btn-danger">Logout</a>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
