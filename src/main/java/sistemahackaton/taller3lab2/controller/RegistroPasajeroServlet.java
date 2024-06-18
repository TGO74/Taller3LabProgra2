package sistemahackaton.taller3lab2.controller;

import sistemahackaton.taller3lab2.model.Pasajero;
import sistemahackaton.taller3lab2.model.data.dao.PasajeroDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/registropasajero")
public class RegistroPasajeroServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        String rut = request.getParameter("RUT");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String fechaNacimientoStr = request.getParameter("fechaNacimiento");
        String nacionalidad = request.getParameter("nacionalidad");

        // Validar y convertir fecha de nacimiento a tipo Date
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimientoStr);
        } catch (ParseException e) {
            e.printStackTrace();
            // Manejar error de parseo de fecha
            response.sendRedirect("registropasajero.jsp?error=true");
            return;
        }

        // Crear objeto Pasajero con los datos recibidos
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre(nombre);
        pasajero.setRut(rut);
        pasajero.setTelefono(telefono);
        pasajero.setCorreo(correo);
        pasajero.setFechaNacimiento(fechaNacimiento);
        pasajero.setNacionalidad(nacionalidad);

        // Guardar pasajero en la base de datos usando PasajeroDAO
        PasajeroDAO pasajeroDAO = new PasajeroDAO();
        pasajeroDAO.registrarPasajero(pasajero);

        // Redirigir al usuario a una página de confirmación
        response.sendRedirect("registro_exitoso.jsp");
    }
}
