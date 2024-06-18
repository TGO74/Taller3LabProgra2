<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Fly Easy - Registro de Pasajero</title>
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
<section class="registro">
  <h2>Registro de Pasajero</h2>
  <form action="RegistroServlet" method="post">
    <label for="nombreCompleto">Nombre completo:</label>
    <input type="text" id="nombreCompleto" name="nombreCompleto" required>

    <label for="documentoIdentidad">Documento de identidad:</label>
    <input type="text" id="documentoIdentidad" name="documentoIdentidad" required>

    <label for="numeroTelefono">Número de teléfono:</label>
    <input type="tel" id="numeroTelefono" name="numeroTelefono" required>

    <label for="correoElectronico">Correo electrónico:</label>
    <input type="email" id="correoElectronico" name="correoElectronico" required>

    <label for="contrasena">Contraseña:</label>
    <input type="password" id="contrasena" name="contrasena" required>

    <button type="submit">Registrarse</button>

    <p>¿Ya tienes una cuenta? <a href="login.jsp">Iniciar sesión</a></p>
  </form>
</section>
<footer>
  <p>&copy; 2024 Fly Easy</p>
</footer>
</body>
</html>
