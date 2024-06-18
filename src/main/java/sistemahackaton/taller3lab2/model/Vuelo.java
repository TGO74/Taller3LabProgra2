package sistemahackaton.taller3lab2.model;

import sistemahackaton.taller3lab2.model.Aerolinea;


import java.util.Date;

public class Vuelo {
    private String numeroVuelo;
    private String aerolinea;
    private String origen;
    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String horarioSalida;
    private String horarioLlegada;
    private int duracionVuelo;
    private String tipoAeronave;
    private int capacidadPasajeros;
    private int precio;

    // Constructor vacío
    public Vuelo() {}

    // Constructor con todos los atributos
    public Vuelo(String numeroVuelo, String aerolinea, String origen, String destino, Date fechaSalida,
                 Date fechaLlegada, String horarioSalida, String horarioLlegada, int duracionVuelo,
                 String tipoAeronave, int capacidadPasajeros) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horarioSalida = horarioSalida;
        this.horarioLlegada = horarioLlegada;
        this.duracionVuelo = duracionVuelo;
        this.tipoAeronave = tipoAeronave;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precio = 0;
    }

    // Getters y Setters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    public int getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(int duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Método para mostrar la información del vuelo
    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", aerolinea='" + aerolinea + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaSalida=" + fechaSalida +
                ", fechaLlegada=" + fechaLlegada +
                ", horarioSalida='" + horarioSalida + '\'' +
                ", horarioLlegada='" + horarioLlegada + '\'' +
                ", duracionVuelo=" + duracionVuelo +
                ", tipoAeronave='" + tipoAeronave + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                ", precio=" + precio +
                '}';
    }
}
