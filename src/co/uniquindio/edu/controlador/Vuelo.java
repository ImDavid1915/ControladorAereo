package co.uniquindio.edu.controlador;

import java.util.Date;

public class Vuelo {

    private Cliente cliente;
    private String ciudadOrigen;
    private int ciudadDestino;
    private Enum tipoClase;
    private String fechaVuelo;
    private Date fechaCompra;

    public Vuelo(){
    }

    public Vuelo(Cliente cliente, String ciudadOrigen, int ciudadDestino, Enum tipoClase, String fechaVuelo, Date fechaCompra) {
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
        String ciudadString = "";
        if(ciudadDestino == 1){
            ciudadString = "MEDELLIN";
        } else if (ciudadDestino == 2) {
            ciudadString = "BOGOTA";
        } else if (ciudadDestino == 3) {
            ciudadString = "CALI";
        } else if (ciudadDestino == 4) {
            ciudadString = "CARTAGENA";
        }
        return ciudadString;
    }

    public void setCiudadDestino(int ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Enum getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(Enum tipoClase) {
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
