<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Registro de Pasajero</title>
  <link rel="stylesheet" type="text/css" href="style.css"> <!-- Archivo CSS para estilos -->
</head>
<body>
<div class="registro-container">
  <h2>Registro de Pasajero</h2>
  <form action="registropasajero" method="post">
    <div class="form-group">
      <label for="nombre">Nombre Completo:</label>
      <input type="text" id="nombre" name="nombre" required>
    </div>
    <div class="form-group">
      <label for="documento">Documento de Identidad:</label>
      <input type="text" id="documento" name="documento" required>
    </div>
    <div class="form-group">
      <label for="telefono">Número de Teléfono:</label>
      <input type="text" id="telefono" name="telefono" required>
    </div>
    <div class="form-group">
      <label for="correo">Correo Electrónico:</label>
      <input type="email" id="correo" name="correo" required>
    </div>
    <div class="form-group">
      <label for="fechaNacimiento">Fecha de Nacimiento:</label>
      <input type="date" id="fechaNacimiento" name="fechaNacimiento" required>
    </div>
    <div class="form-group">
      <label for="nacionalidad">Nacionalidad:</label>
      <input type="text" id="nacionalidad" name="nacionalidad" required>
    </div>
    <button type="submit">Registrarse</button>
  </form>
  <%-- Manejo de errores de registro --%>
  <% String error = request.getParameter("error");
    if (error != null && error.equals("true")) { %>
  <p class="error-message">Error al registrar. Inténtelo nuevamente.</p>
  <% } %>
</div>
</body>
</html>
