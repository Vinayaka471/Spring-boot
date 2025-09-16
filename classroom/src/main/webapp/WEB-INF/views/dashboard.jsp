<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { display: flex; min-height: 100vh; margin: 0; }
        .sidebar {
            width: 220px;
            background-color: #343a40;
            color: #fff;
            padding-top: 20px;
        }
        .sidebar a {
            display: block;
            color: #ddd;
            padding: 12px 20px;
            text-decoration: none;
        }
        .sidebar a:hover {
            background-color: #495057;
            color: #fff;
        }
        .main {
            flex: 1;
            padding: 20px;
            background-color: #f8f9fa;
        }
    </style>
</head>
<body>
    <!-- Sidebar -->
    <div class="sidebar">
        <h4 class="text-center text-white">Dashboard</h4>
        <a href="#">Home</a>
        <a href="#">Users</a>
        <a href="#">Subjects</a>
        <a href="#">MCQ Tests</a>
        <a href="#">Reports</a>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </div>

    <!-- Main Content -->
    <div class="main">
        <h2>Welcome to Dashboard 🎯</h2>
        <p>Select an option from the sidebar.</p>

        <div class="row mt-4">
            <div class="col-md-4">
                <div class="card shadow-sm">
                    <div class="card-body">
                        <h5 class="card-title">Users</h5>
                        <p class="card-text">Manage faculty and student users.</p>
                        <a href="#" class="btn btn-primary">View Users</a>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card shadow-sm">
                    <div class="card-body">
                        <h5 class="card-title">Subjects</h5>
                        <p class="card-text">View and assign subjects to users.</p>
                        <a href="#" class="btn btn-primary">Manage Subjects</a>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card shadow-sm">
                    <div class="card-body">
                        <h5 class="card-title">MCQ Tests</h5>
                        <p class="card-text">Create and assign tests to students.</p>
                        <a href="#" class="btn btn-primary">View Tests</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
