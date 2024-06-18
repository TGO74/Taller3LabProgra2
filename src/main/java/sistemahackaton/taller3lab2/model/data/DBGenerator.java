package sistemahackaton.taller3lab2.model.data;



import org.jooq.DSLContext;

import static org.jooq.impl.DSL.constraint;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

public class DBGenerator {

    public static void generateDatabase() {
        DSLContext create = (DSLContext) DBConnector.getConnection();

        // Crear tabla Aerolineas
        create.createTableIfNotExists("aerolineas")
                .column("id", org.jooq.impl.SQLDataType.INTEGER.identity(true))
                .column("nombre", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("codigoIATA", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false))
                .column("imagenCorporativa", org.jooq.impl.SQLDataType.VARCHAR(255))
                .constraints(
                        constraint("PK_AEROLINEAS").primaryKey("id"),
                        constraint("UNIQUE_CODIGO_IATA").unique("codigoIATA")
                ).execute();

        // Crear tabla Vuelos
        create.createTableIfNotExists("vuelos")
                .column("id", org.jooq.impl.SQLDataType.INTEGER.identity(true))
                .column("numeroVuelo", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("aerolinea", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("origen", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("destino", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("fechaSalida", org.jooq.impl.SQLDataType.DATE.nullable(false))
                .column("fechaLlegada", org.jooq.impl.SQLDataType.DATE.nullable(false))
                .column("horarioSalida", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("horarioLlegada", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("duracionVuelo", org.jooq.impl.SQLDataType.INTEGER.nullable(false))
                .column("tipoAeronave", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("capacidadPasajeros", org.jooq.impl.SQLDataType.INTEGER.nullable(false))
                .constraints(
                        constraint("PK_VUELOS").primaryKey("id"),
                        constraint("FK_VUELO_AEROLINEA").foreignKey("aerolinea").references("aerolineas", "nombre")
                ).execute();

        // Crear tabla Pasajeros
        create.createTableIfNotExists("pasajeros")
                .column("id", org.jooq.impl.SQLDataType.INTEGER.identity(true))
                .column("nombreCompleto", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("documentoIdentidad", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("telefono", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("correoElectronico", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("fechaNacimiento", org.jooq.impl.SQLDataType.DATE.nullable(false))
                .column("nacionalidad", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .constraints(
                        constraint("PK_PASAJEROS").primaryKey("id"),
                        constraint("UNIQUE_DOCUMENTO_IDENTIDAD").unique("documentoIdentidad")
                ).execute();

        // Crear tabla Pasajes
        create.createTableIfNotExists("pasajes")
                .column("id", org.jooq.impl.SQLDataType.INTEGER.identity(true))
                .column("vuelo", org.jooq.impl.SQLDataType.INTEGER.nullable(false))
                .column("pasajero", org.jooq.impl.SQLDataType.INTEGER.nullable(false))
                .column("tipoPasaje", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .column("precio", org.jooq.impl.SQLDataType.DOUBLE.nullable(false))
                .column("asiento", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false))
                .constraints(
                        constraint("PK_PASAJES").primaryKey("id"),
                        constraint("FK_PASAJE_VUELO").foreignKey("vuelo").references("vuelos", "id"),
                        constraint("FK_PASAJE_PASAJERO").foreignKey("pasajero").references("pasajeros", "id")
                ).execute();
    }

    public static void main(String[] args) {
        generateDatabase();
        System.out.println("Database generated successfully.");
        DBConnector.closeConnection();
    }
}
