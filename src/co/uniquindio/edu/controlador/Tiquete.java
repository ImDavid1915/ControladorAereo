package co.uniquindio.edu.controlador;

public class Tiquete {

    private Cliente cliente;
    private Vuelo vuelo;
    private double precio;

    public Tiquete (){
    }

    public Tiquete(Cliente cliente, Vuelo vuelo, double precio) {
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + cliente.getNombreCompleto() + "\nNumero de documento: "+cliente.getNumCedula()+
                "\nCiudad de origen: "+ vuelo.getCiudadOrigen() + "\nCiudad de destino: "+ vuelo.getCiudadDestino()+
                "\nTipo de clase: " + vuelo.getTipoClase() + "\nFecha seleccionada: "+vuelo.getFechaVuelo()+
                "\n\nFecha de compra: "+vuelo.getFechaCompra()+
                "\nTotal a pagar: COP$"+precio;

    }
}
