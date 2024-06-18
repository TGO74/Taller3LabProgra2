package sistemahackaton.taller3lab2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModificarPerfilServlet")
public class ModificarPerfilServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Obtener los datos actualizados del perfil del usuario
        String nombreCompleto = request.getParameter("nombreCompleto");
        String documentoIdentidad = request.getParameter("documentoIdentidad");
        String numeroTelefono = request.getParameter("numeroTelefono");
        String correoElectronico = request.getParameter("correoElectronico");

        // Validar los datos actualizados
        // ...

        // Actualizar el perfil del usuario en la base de datos
        actualizarPerfil(nombreCompleto, documentoIdentidad, numeroTelefono, correoElectronico);

        // Redireccionar al perfil del usuario
        response.sendRedirect("perfilPasajero.jsp");
    }

    private void actualizarPerfil(String nombreCompleto, String documentoIdentidad, String numeroTelefono, String correoElectronico) {
        // Implementar la lógica para actualizar el perfil del usuario en la base de datos
    }
}
