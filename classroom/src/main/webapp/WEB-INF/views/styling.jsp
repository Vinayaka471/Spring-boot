<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom Styles -->
<style>
    body {
        background-color: #f8f9fa;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    /* Navbar */
    .navbar {
        background-color: #ffffff !important;
    }
    .navbar-brand {
        font-weight: bold;
        font-size: 1.2rem;
    }

    /* Sidebar */
    .sidebar {
        width: 250px;
        min-height: 100vh;
        background-color: #343a40;
    }
    .sidebar h5 {
        text-align: center;
        padding: 15px;
        color: #fff;
        border-bottom: 1px solid #495057;
    }
    .sidebar .nav-link {
        color: #adb5bd;
        padding: 10px 20px;
    }
    .sidebar .nav-link:hover, 
    .sidebar .nav-link.active {
        background-color: #495057;
        color: #fff;
        border-radius: 5px;
    }

    /* Dashboard Cards */
    .card {
        border: none;
        border-radius: 10px;
        transition: transform 0.2s, box-shadow 0.2s;
    }
    .card:hover {
        transform: translateY(-5px);
        box-shadow: 0 6px 20px rgba(0,0,0,0.1);
    }
    .card h4 {
        font-size: 1.8rem;
        font-weight: bold;
        color: #0d6efd;
    }
    .card p {
        margin-bottom: 10px;
        font-size: 0.95rem;
        color: #555;
    }
    .card .btn {
        font-size: 0.85rem;
        padding: 5px 15px;
        border-radius: 20px;
    }

    /* Responsive */
    @media (max-width: 768px) {
        .sidebar {
            width: 200px;
        }
        .card h4 {
            font-size: 1.4rem;
        }
    }
</style>
