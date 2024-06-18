package sistemahackaton.taller3lab2.model;



import java.util.Date;

public class Pasajero {
    private String nombreCompleto;
    private String rut;
    private String numeroTelefono;
    private String correoElectronico;
    private Date fechaNacimiento;
    private String nacionalidad;

    // Constructor vacío
    public Pasajero() {}

    // Constructor con todos los atributos
    public Pasajero(String nombreCompleto, String rut, String numeroTelefono,
                    String correoElectronico, Date fechaNacimiento, String nacionalidad) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombreCompleto;
    }

    public void setNombre(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return numeroTelefono;
    }

    public void setTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correoElectronico;
    }

    public void setCorreo(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }



    // Método para mostrar la información del pasajero
    @Override
    public String toString() {
        return "Pasajero{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", documentoIdentidad='" + rut + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
