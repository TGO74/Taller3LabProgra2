package sistemahackaton.taller3lab2.controller;

import sistemahackaton.taller3lab2.model.Vuelo;
import sistemahackaton.taller3lab2.model.Aerolinea;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuscarVuelosServlet")
public class BuscarVuelosServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Obtener los criterios de búsqueda
        String origen = request.getParameter("origen");
        String destino = request.getParameter("destino");
        String fechaSalida = request.getParameter("fechaSalida");

        // Buscar vuelos en la base de datos
        List<Vuelo> vuelos = buscarVuelos(origen, destino, fechaSalida);

        // Mostrar los resultados de la búsqueda
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Fly Easy - Resultados de búsqueda</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Vuelos disponibles</h1>");
        out.println("<table border=1>");
        out.println("<tr><th>Número de vuelo</th><th>Aerolínea</th><th>Origen</th><th>Destino</th><th>Salida</th><th>Llegada</th><th>Duración</th><th>Precio</th></tr>");
        for (Vuelo vuelo : vuelos) {
            out.println("<tr>");
            out.println("<td>" + vuelo.getNumeroVuelo() + "</td>");
            out.println("<td>" + vuelo.getAerolinea().stripTrailing() + "</td>");
            out.println("<td>" + vuelo.getDestino() + "</td>");
            out.println("<td>" + vuelo.getHorarioSalida() + "</td>");
            out.println("<td>" + vuelo.getHorarioLlegada() + "</td>");
            out.println("<td>" + vuelo.getDuracionVuelo() + "</td>");
            out.println("<td>" + vuelo.getPrecio() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

    private List<Vuelo> buscarVuelos(String origen, String destino, String fechaSalida) {
        // Implementar la lógica para buscar vuelos en la base de datos
        return null; // Debería devolver una lista de objetos Vuelo
    }
}
