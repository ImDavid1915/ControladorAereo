package co.uniquindio.edu.controlador;

public class Persona {

    private String nombreCompleto;
    private int numCedula;

    public Persona(){
    }

    public Persona(String nombreCompleto, int numCedula) {
        this.nombreCompleto = nombreCompleto;
        this.numCedula = numCedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }
}
