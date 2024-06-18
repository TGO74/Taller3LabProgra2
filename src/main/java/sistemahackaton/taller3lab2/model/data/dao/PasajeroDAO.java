package sistemahackaton.taller3lab2.model.data.dao;


import sistemahackaton.taller3lab2.model.Pasajero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static sistemahackaton.taller3lab2.model.data.DBConnector.getConnection;

public class PasajeroDAO {

    private static final String INSERT_PASAJERO_SQL = "INSERT INTO pasajero (nombre, documento, telefono, correo, fechaNacimiento, nacionalidad) VALUES (?, ?, ?, ?, ?, ?)";

    public void registrarPasajero(Pasajero pasajero) {
        try (Connection connection = (Connection) getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PASAJERO_SQL)) {
            preparedStatement.setString(1, pasajero.getNombre());
            preparedStatement.setString(2, pasajero.getRut());
            preparedStatement.setString(3, pasajero.getTelefono());
            preparedStatement.setString(4, pasajero.getCorreo());
            preparedStatement.setDate(5, new java.sql.Date(pasajero.getFechaNacimiento().getTime()));
            preparedStatement.setString(6, pasajero.getNacionalidad());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones, logueo o lanzamiento de excepciones personalizadas
        }
    }

    private static final String SELECT_PASAJERO_BY_CORREO_SQL = "SELECT * FROM pasajero WHERE correo = ? AND contrasena = ?";

    public Pasajero validarPasajero(String correo, String contrasena) {
        Pasajero pasajero = null;
        try (Connection connection = (Connection) getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PASAJERO_BY_CORREO_SQL)) {
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2, contrasena);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                pasajero = new Pasajero();
                pasajero.setNombre(resultSet.getString("nombre"));
                pasajero.setRut(resultSet.getString("documento"));
                pasajero.setTelefono(resultSet.getString("telefono"));
                pasajero.setCorreo(resultSet.getString("correo"));
                pasajero.setFechaNacimiento(resultSet.getDate("fechaNacimiento"));
                pasajero.setNacionalidad(resultSet.getString("nacionalidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones, logueo o lanzamiento de excepciones personalizadas
        }
        return pasajero;
    }
}
