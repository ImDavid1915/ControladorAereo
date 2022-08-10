package co.uniquindio.edu.controlador;

import java.util.Date;

public class Vuelo {

    private Cliente cliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String tipoClase;
    private String fechaVuelo;
    private Date fechaCompra;

    public Vuelo(){
    }

    public Vuelo(Cliente cliente, String ciudadOrigen, String ciudadDestino, String tipoClase, String fechaVuelo, Date fechaCompra) {
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.tipoClase = tipoClase;
        this.fechaVuelo = fechaVuelo;
        this.fechaCompra = fechaCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
