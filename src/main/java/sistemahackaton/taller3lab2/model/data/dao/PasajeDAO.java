package sistemahackaton.taller3lab2.model.data.dao;


import sistemahackaton.taller3lab2.model.Pasaje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static sistemahackaton.taller3lab2.model.data.DBConnector.getConnection;

public class PasajeDAO {

    private static final String INSERT_PASAJE_SQL = "INSERT INTO pasaje (tipo_pasaje, precio, disponibilidad, vuelo_id, pasajero_id) VALUES (?, ?, ?, ?, ?)";

    public void comprarPasaje(Pasaje pasaje) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PASAJE_SQL)) {
            preparedStatement.setString(1, pasaje.getTipoPasaje());
            preparedStatement.setDouble(2, pasaje.getPrecio());
              preparedStatement.setInt(3, Integer.parseInt(pasaje.getAsiento()));
            preparedStatement.setInt(4, pasaje.getVuelo());
            preparedStatement.setInt(5, Integer.parseInt(String.valueOf(pasaje.getPasajero())));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones, logueo o lanzamiento de excepciones personalizadas
        }
    }

    private static final String SELECT_PASAJES_BY_PASAJERO_SQL = "SELECT * FROM pasaje WHERE pasajero_id = ?";

    public List<Pasaje> obtenerPasajesPorPasajero(int pasajeroId) {
        List<Pasaje> pasajes = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PASAJES_BY_PASAJERO_SQL)) {
            preparedStatement.setInt(1, pasajeroId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setId(resultSet.getInt("id"));
                pasaje.setTipoPasaje(resultSet.getString("tipo_pasaje"));
                pasaje.setPrecio(resultSet.getDouble("precio"));
                pasaje.setAsiento(resultSet.getString("disponibilidad"));
                pasaje.setId(resultSet.getInt("vuelo_id"));
                pasajes.add(pasaje);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones, logueo o lanzamiento de excepciones personalizadas
        }
        return pasajes;
    }
}
