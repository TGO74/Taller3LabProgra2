<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Fly Easy - Perfil de Pasajero</title>
  <link rel="stylesheet" href="css/estilo.css">
</head>
<body>
<header>
  <h1>Fly Easy</h1>
  <nav>
    <ul>
      <li><a href="index.jsp">Inicio</a></li>
      <li><a href="perfilPasajero.jsp">Perfil</a></li>
      <li><a href="salir.jsp">Salir</a></li>
    </ul>
  </nav>
</header>
<section class="perfil">
  <h2>Perfil de Pasajero</h2>
  <%
    // Obtener los datos del usuario actual (por ejemplo, desde la sesión)
    String nombreCompleto = "Juan Pérez";
    String correoElectronico = "juan.perez@email.com";
    String documentoIdentidad = "123456789";
    String numeroTelefono = "+56 9 1234 5678";
    String fechaNacimiento = "1980-01-01";
    String nacionalidad = "Chile";
  %>
  <p><strong>Nombre completo:</strong> ${nombreCompleto}</p>
  <p><strong>Correo electrónico:</strong> ${correoElectronico}</p>
  <p><strong>Documento de identidad:</strong> ${documentoIdentidad}</p>
  <p><strong>Número de teléfono:</strong> ${numeroTelefono}</p>
  <p><strong>Fecha de nacimiento:</strong> ${fechaNacimiento}</p>
  <p><strong>Nacionalidad:</strong> ${nacionalidad}</p>

  <a href="modificarPerfil.jsp">Modificar perfil</a>
  <a href="historialViajes.jsp">Ver historial de viajes</a>
</section>
<footer>
  <p>&copy; 2024 Fly Easy</p>
</footer>
</body>
</html>
