package sistemahackaton.taller3lab2.model;



public class Aerolinea {
    private String nombre;
    private String codigoIATA;
    private String imagenCorporativa;

    // Constructor vacío
    public Aerolinea() {}

    // Constructor con todos los atributos
    public Aerolinea(String nombre, String codigoIATA, String imagenCorporativa) {
        this.nombre = nombre;
        this.codigoIATA = codigoIATA;
        this.imagenCorporativa = imagenCorporativa;
    }

    // Getters y Setters
    public String getNombreAerolinea() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }

    public String getImagenCorporativa() {
        return imagenCorporativa;
    }

    public void setImagenCorporativa(String imagenCorporativa) {
        this.imagenCorporativa = imagenCorporativa;
    }

    // Método para mostrar la información de la aerolínea
    @Override
    public String toString() {
        return "Aerolinea{" +
                "nombre='" + nombre + '\'' +
                ", codigoIATA='" + codigoIATA + '\'' +
                ", imagenCorporativa='" + imagenCorporativa + '\'' +
                '}';
    }
}
