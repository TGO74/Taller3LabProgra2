package sistemahackaton.taller3lab2.model.data.dao;



import sistemahackaton.taller3lab2.model.Vuelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static sistemahackaton.taller3lab2.model.data.DBConnector.getConnection;

public class VueloDAO {

    private static final String INSERT_VUELO_SQL = "INSERT INTO vuelo (numero_vuelo, aerolinea, origen, destino, fecha_salida, fecha_llegada, horario_salida, horario_llegada, duracion, tipo_aeronave, capacidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public void registrarVuelo(Vuelo vuelo) {
        try (Connection connection = (Connection) getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_VUELO_SQL)) {
            preparedStatement.setString(1, vuelo.getNumeroVuelo());
            preparedStatement.setString(2, vuelo.getAerolinea());
            preparedStatement.setString(3, vuelo.getOrigen());
            preparedStatement.setString(4, vuelo.getDestino());
            preparedStatement.setDate(5, new java.sql.Date(vuelo.getFechaSalida().getTime()));
            preparedStatement.setDate(6, new java.sql.Date(vuelo.getFechaLlegada().getTime()));
            preparedStatement.setString(7, vuelo.getHorarioSalida());
            preparedStatement.setString(8, vuelo.getHorarioLlegada());
            preparedStatement.setString(9, String.valueOf(vuelo.getDuracionVuelo()));
            preparedStatement.setString(10, vuelo.getTipoAeronave());
            preparedStatement.setInt(11, vuelo.getCapacidadPasajeros());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones, logueo o lanzamiento de excepciones personalizadas
        }
    }

    private static final String SELECT_VUELOS_BY_CRITERIOS_SQL = "SELECT * FROM vuelo WHERE origen = ? AND destino = ? AND fecha_salida = ?";

    public List<Vuelo> buscarVuelos(String origen, String destino, Date fechaSalida) {
        List<Vuelo> vuelos = new ArrayList<>();
        try (Connection connection = (Connection) getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_VUELOS_BY_CRITERIOS_SQL)) {
            preparedStatement.setString(1, origen);
            preparedStatement.setString(2, destino);
            preparedStatement.setDate(3, new java.sql.Date(fechaSalida.getTime()));
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Vuelo vuelo = new Vuelo();
                vuelo.setNumeroVuelo(resultSet.getString("numero_vuelo"));
                vuelo.setAerolinea(resultSet.getString("aerolinea"));
                vuelo.setOrigen(resultSet.getString("origen"));
                vuelo.setDestino(resultSet.getString("destino"));
                vuelo.setFechaSalida(resultSet.getDate("fecha_salida"));
                vuelo.setFechaLlegada(resultSet.getDate("fecha_llegada"));
                vuelo.setHorarioSalida(resultSet.getString("horario_salida"));
                vuelo.setHorarioLlegada(resultSet.getString("horario_llegada"));
                vuelo.setDuracionVuelo(Integer.parseInt(resultSet.getString("duracion")));
                vuelo.setTipoAeronave(resultSet.getString("tipo_aeronave"));
                vuelo.setCapacidadPasajeros(resultSet.getInt("capacidad"));
                vuelos.add(vuelo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones, logueo o lanzamiento de excepciones personalizadas
        }
        return vuelos;
    }
}
