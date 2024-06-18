# Sistema de Gestión de Pasajes Aéreos "Fly Easy"

### Laboratorio de Programación II ICC304

#### Nombre:
#### Carrera:

## Instrucciones generales
- No se permite el uso de smartphone, compartir material, uso de redes sociales, etc.
- La falta a estas restricciones se sancionará con nota 1.1.

## Objetivo
Mostrar el dominio de los conceptos revisados sobre el desarrollo de una aplicación web mediante gestión de bases de datos y POO.

## Contexto del Problema
"Fly Easy", una empresa de viajes, busca desarrollar un sistema web para la gestión y venta de pasajes aéreos. El sistema permitirá a los usuarios:
- Buscar vuelos por diferentes criterios (origen, destino, fecha, aerolínea, etc.).
- Ver información detallada de cada vuelo (horarios, escalas, precios, etc.).
- Reservar y comprar pasajes para los vuelos seleccionados.
- Gestionar sus reservas (modificar, cancelar, ver detalles).
- Acceder a su historial de viajes.

## Requerimientos Funcionales
Para gestionar el principal proceso de negocio de la empresa, se necesita diseñar y desarrollar un programa que cumpla con los siguientes requerimientos:

### Vuelo
- Información: número de vuelo, aerolínea, origen, destino, fecha de salida, fecha de llegada, horario de salida, horario de llegada, duración del vuelo, tipo de aeronave, capacidad de pasajeros.

### Aerolínea
- Información: nombre, código IATA, imagen corporativa.

### Pasajero
- Información de contacto: nombre completo, documento de identidad, número de teléfono, correo electrónico.
- Datos de viaje: fecha de nacimiento, nacionalidad.

### Pasaje
- Tipos de pasajes disponibles para cada vuelo (económico, ejecutivo, primera clase), precios y disponibilidad.
- Asociación de pasajes a un vuelo y a un pasajero.
- Selección de asientos durante el proceso de compra.

### Relaciones
- Un vuelo pertenece a una única aerolínea.
- Una aerolínea puede tener varios vuelos.
- Un pasajero puede reservar varios pasajes.
- Un pasaje está asociado a un único pasajero.
- Un vuelo puede tener varios pasajeros.

## Solución a Entregar
### Funcionalidades
- **Gestión de Vuelos:**
  - Creación de vuelos por personal autorizado.
- **Gestión de Pasajeros:**
  - Registro de nuevos pasajeros.
- **Gestión de Pasajes:**
  - Compra de pasajes para vuelos disponibles.

### Implementación
- **Modelo MVC:** Separación clara entre la lógica del negocio, la interfaz de usuario y la persistencia de datos.
- **DAO:** Capa de acceso a datos, asegurando la independencia de la lógica de negocio respecto a la base de datos.
- **Servlets:** Intermediarios entre interfaces de usuario y la lógica de negocio.
- **JSP y CSS:** Interacción de usuario y visualización de las páginas web.

### Validaciones y Buenas Prácticas
- Validaciones mínimas para las entradas de datos.
- Prevención de objetos duplicados.
- Uso de excepciones, gestión de errores y mensajes de usuario.
- Buenas prácticas de programación (nombres de clases, variables y métodos, indentación, extensión de métodos, uso de comentarios, etc.).
- Uso de patrones de diseño presentados.
- No uso de variables globales.

### Herramientas de Inteligencia Artificial
- Utilización de chatGPT para optimizar el proceso de construcción de la solución y búsqueda de validaciones mínimas.

### Entrega
- Repositorio Git con el código fuente Java.
- Evidencia de ejecución con capturas de pantalla de la ejecución del programa (2 capturas de pantalla por ventana).

## Descripción de Packages y Clases

### Package: `controller`
- **LoginServlet:** Maneja la lógica de autenticación de usuarios.
  - Atributos: Ninguno.
  - Métodos: `doPost(HttpServletRequest, HttpServletResponse)`.

### Package: `model`
- **Vuelo:** Representa un vuelo.
  - Atributos: `numeroVuelo`, `aerolinea`, `origen`, `destino`, `fechaSalida`, `fechaLlegada`, `horaSalida`, `horaLlegada`, `duracion`, `tipoAeronave`, `capacidad`.
  - Métodos: Getters y Setters.
- **Aerolínea:** Representa una aerolínea.
  - Atributos: `nombre`, `codigoIATA`, `imagenCorporativa`.
  - Métodos: Getters y Setters.
- **Pasajero:** Representa un pasajero.
  - Atributos: `nombreCompleto`, `documentoIdentidad`, `numeroTelefono`, `correoElectronico`, `fechaNacimiento`, `nacionalidad`.
  - Métodos: Getters y Setters.
- **Pasaje:** Representa un pasaje.
  - Atributos: `tipo`, `precio`, `disponibilidad`, `vuelo`, `pasajero`, `asiento`.
  - Métodos: Getters y Setters.

### Package: `model.data`
- **DBConnector:** Gestiona la conexión a la base de datos.
  - Métodos: `getConnection()`.

### Package: `model.data.dao`
- **VueloDAO:** Gestiona la persistencia de los vuelos.
  - Métodos: `crearVuelo(Vuelo)`, `buscarVueloPorCriterios(...)`.
- **AerolíneaDAO:** Gestiona la persistencia de las aerolíneas.
  - Métodos: `crearAerolínea(Aerolínea)`, `buscarAerolíneaPorNombre(String)`.
- **PasajeroDAO:** Gestiona la persistencia de los pasajeros.
  - Métodos: `registrarPasajero(Pasajero)`, `buscarPasajeroPorCorreo(String)`.
- **PasajeDAO:** Gestiona la persistencia de los pasajes.
  - Métodos: `comprarPasaje(Pasaje)`, `buscarPasajePorVueloYPasajero(...)`.

### Package: `vista`
- **JSP Files:** Archivos JSP para la interfaz de usuario.
  - `login.jsp`: Página de inicio de sesión.
  - `registro.jsp`: Página de registro de pasajeros.
  - `perfilPasajero.jsp`: Página de perfil del pasajero.
  - `admin.jsp`: Página de administración de vuelos y aerolíneas.



## Capturas de Pantalla
Adjuntar capturas de pantalla del sistema en ejecución en cada ventana.

---

Este README proporciona una visión completa del sistema propuesto, la estructura del proyecto y las clases involucradas, siguiendo el patrón MVC y utilizando DAO para el acceso a datos.
