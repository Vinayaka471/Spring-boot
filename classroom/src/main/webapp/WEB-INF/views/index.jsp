<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accounts Portal</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login"
							method="post">
							<div class="mb-3">
								<label for="userEmail" class="form-label">Email </label>
								<div class="input-group">
									<span class="input-group-text"> <i
										class="fas fa-envelope"></i>
									</span> <input type="email" class="form-control" id="userEmail"
										name="userEmail" placeholder="Enter your email" required>
								</div>
							</div>
							<div class="mb-3">
								<label for="userPassword" class="form-label">Password </label>
								<div class="input-group">
									<span class="input-group-text"> <i class="fas fa-lock"></i>
									</span> <input type="password" class="form-control" id="userPassword"
										name="userPassword" placeholder="Enter your password" required>
									<button class="btn btn-outline-secondary" type="button"
										id="togglePassword">
										<i class="fas fa-eye" id="toggleIcon"></i>
									</button>
								</div>
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input" id="rememberMe"
									name="rememberMe" checked="checked"> <label
									class="form-check-label" for="rememberMe">Remember me</label>
							</div>
							<div>
								<button type="submit" class="btn btn-primary">Login</button>
							</div>
						</form>
						</body>
</html>