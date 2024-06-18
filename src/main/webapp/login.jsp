<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Fly Easy - Inicio de Sesión</title>
  <link rel="stylesheet" href="css/estilo.css">
</head>
<body>
<header>
  <h1>Fly Easy</h1>
  <nav>
    <ul>
      <li><a href="index.jsp">Inicio</a></li>
      <li><a href="registro.jsp">Registrarse</a></li>
    </ul>
  </nav>
</header>
<section class="login">
  <h2>Inicio de Sesión</h2>
  <form action="LoginServlet" method="post">
    <label for="correoElectronico">Correo electrónico:</label>
    <input type="email" id="correoElectronico" name="correoElectronico" required>

    <label for="contrasena">Contraseña:</label>
    <input type="password" id="contrasena" name="contrasena" required>

    <button type="submit">Iniciar sesión</button>

    <p>¿No tienes una cuenta? <a href="registro.jsp">Regístrate aquí</a></p>
  </form>
</section>
<footer>
  <p>&copy; 2024 Fly Easy</p>
</footer>
</body>
</html>
