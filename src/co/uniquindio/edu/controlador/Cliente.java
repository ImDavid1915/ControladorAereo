package co.uniquindio.edu.controlador;

public class Cliente extends Persona{

    private Vuelo vuelo;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, int numCedula, Vuelo vuelo) {
        super(nombreCompleto, numCedula);
        this.vuelo = vuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombreCompleto() + "\nNumero de Documento: " + getNumCedula();
    }
}
