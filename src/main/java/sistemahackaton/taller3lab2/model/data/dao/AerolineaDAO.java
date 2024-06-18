package sistemahackaton.taller3lab2.model.data.dao;

import sistemahackaton.taller3lab2.model.Aerolinea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static sistemahackaton.taller3lab2.model.data.DBConnector.getConnection;

public class AerolineaDAO {

    private static final String INSERT_AEROLINEA_SQL = "INSERT INTO aerolinea (nombre, codigo_iata, imagen) VALUES (?, ?, ?)";

    public void crearAerolinea(Aerolinea aerolinea) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_AEROLINEA_SQL)) {
            preparedStatement.setString(1, aerolinea.getNombreAerolinea());
            preparedStatement.setString(2, aerolinea.getCodigoIATA());
            preparedStatement.setString(3, aerolinea.getImagenCorporativa());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private static final String SELECT_AEROLINEA_BY_ID_SQL = "SELECT * FROM aerolinea WHERE id = ?";

    public Aerolinea obtenerAerolineaPorId(int aerolineaId) {
        Aerolinea aerolinea = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_AEROLINEA_BY_ID_SQL)) {
            preparedStatement.setInt(1, aerolineaId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                aerolinea = new Aerolinea();
                aerolinea.setNombre(resultSet.getString("nombre"));
                aerolinea.setCodigoIATA(resultSet.getString("codigo_iata"));
                aerolinea.setImagenCorporativa(resultSet.getString("imagen"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones, logueo o lanzamiento de excepciones personalizadas
        }
        return aerolinea;
    }
}
