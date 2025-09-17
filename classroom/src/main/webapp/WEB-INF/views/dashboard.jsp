<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <jsp:include page="styling.jsp"/>
</head>
<body>

    <!-- Header -->
    <jsp:include page="header.jsp"/>

    <!-- Sidebar -->
    <jsp:include page="sidebar.jsp"/>

    <!-- Main Content -->
    <div class="main">
        <h2>Welcome to Dashboard 🎯</h2>
        <p>Select an option from the sidebar.</p>
    </div>

    <jsp:include page="scripts.jsp"/>
</body>
</html>
