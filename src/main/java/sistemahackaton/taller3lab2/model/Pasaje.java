package sistemahackaton.taller3lab2.model;


public class Pasaje {

    private int id;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private String tipoPasaje;
    private double precio;
    private String asiento;

    // Constructor vacío
    public Pasaje() {}

    // Constructor con todos los atributos
    public Pasaje(Vuelo vuelo, Pasajero pasajero, String tipoPasaje, double precio, String asiento) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.tipoPasaje = tipoPasaje;
        this.precio = precio;
        this.asiento = asiento;
        this.id = 0;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVuelo() {
        return Integer.parseInt(vuelo.getNumeroVuelo());
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getPasajero() {
        return pasajero.toString();
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getTipoPasaje() {
        return tipoPasaje;
    }

    public void setTipoPasaje(String tipoPasaje) {
        this.tipoPasaje = tipoPasaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    // Método para mostrar la información del pasaje
    @Override
    public String toString() {
        return "Pasaje{" +
                "vuelo=" + vuelo +
                ", pasajero=" + pasajero +
                ", tipoPasaje='" + tipoPasaje + '\'' +
                ", precio=" + precio +
                ", asiento='" + asiento + '\'' +
                '}';
    }


}
