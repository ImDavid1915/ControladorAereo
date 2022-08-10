package main;

import co.uniquindio.edu.controlador.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Datos Ingresados
        int precioFinal = 895000;
        String tipoClase = "Clase Turista";
        String nombreCompleto = MetodoDatos.leerString("Nombre completo del pasajero\n");
        int numCedula = MetodoDatos.leerInt("Numero de cedula del pasajero\n");
        String ciudadOrigen = MetodoDatos.leerString("¿Desde que ciudad desea viajar?").toUpperCase();
        //String ciudadDestino = MetodoDatos.leerString("Digite la ciudad de destino \n\nMedellin \nBogota \nCali \nCartagena").toUpperCase();

        String ciudadDestino;
        do {
            ciudadDestino = MetodoDatos.leerString("Digite la ciudad de destino \n\nMedellin \nBogota \nCali \nCartagena").toUpperCase();

            if(!ciudadDestino.equalsIgnoreCase("medellin")){
                MetodoDatos.imprimirTexto("Ha digitado una ciudad erronea.");
            }
        }while (!ciudadDestino.equalsIgnoreCase("medellin") || !ciudadDestino.equalsIgnoreCase("cali"));


        //if(ciudadDestino == null || ciudadDestino != "MEDELLIN" || ciudadDestino != "BOGOTA" || ciudadDestino != "CALI" || ciudadDestino != "CARTAGENA"){
          //  ciudadDestino = MetodoDatos.leerString("\nHa digitado una ciudad erronea \n\nDigite la ciudad de destino \n\nMedellin \nBogota \nCali \nCartagena").toUpperCase();
        //}

        String fechaVuelo = seleccionarFechaVuelo(ciudadDestino);
        boolean esClaseEjecutiva = MetodoDatos.leerBoolean("¿Desea cambiar su tiquete a clase ejecutiva? \n\nHabra un cargo extra en el precio");

        if (esClaseEjecutiva == true){
            precioFinal = precioFinal + 257000;
            tipoClase = "Clase Ejecutiva";
        }

        //Creacion de objetos
        Cliente cliente = new Cliente(nombreCompleto, numCedula, null);
        Tiquete tiquete = new Tiquete(cliente, null, precioFinal);
        Date fechaCompra = new Date();
        Vuelo vuelo = new Vuelo(cliente, ciudadOrigen, ciudadDestino, tipoClase, fechaVuelo, fechaCompra);
        cliente.setVuelo(vuelo);
        tiquete.setVuelo(vuelo);

        //Mensaje Final
        MetodoDatos.imprimirTexto(tiquete.toString());
    }

    public static String seleccionarFechaVuelo(String ciudadOrigen){

        String fechas = "(fecha no escogida)";

        if(ciudadOrigen.equalsIgnoreCase("Medellin")){
            int seleccionNumero = MetodoDatos.leerInt("Seleccione el horario a conveniencia \n\n1) 10 de Septiembre 5:17pm \n2) 12 de Septiembre 10:26am \n3) 15 de Septiembre 12:58pm");
            switch (seleccionNumero){
                case 1: fechas = "10 de Septiembre 5:17pm";
                    break;
                case 2: fechas = "12 de Septiembre 10:26am";
                    break;
                case 3: fechas = "15 de Septiembre 12:58pm";
                    break;
            }
        } else if(ciudadOrigen.equalsIgnoreCase("Bogota")){
            int seleccionNumero = MetodoDatos.leerInt("Seleccione el horario a conveniencia \n\n1) 16 de Octubre 4:28pm \n2) 18 de Octubre 7:54am \n3) 19 de Octubre 1:20pm");
            switch (seleccionNumero){
                case 1: fechas = "16 de Octubre 4:28pm";
                    break;
                case 2: fechas = "18 de Octubre 7:54am";
                    break;
                case 3: fechas = "19 de Octubre 1:20pm";
                    break;
            }
        } else if (ciudadOrigen.equalsIgnoreCase("Cali")) {
            int seleccionNumero = MetodoDatos.leerInt("Seleccione el horario a conveniencia \n\n1) 2 de Octubre 5:58pm \n2) 5 de Octubre 5:45am \n3) 8 de Octubre 8:40pm");
            switch (seleccionNumero){
                case 1: fechas = "2 de Octubre 5:58pm";
                    break;
                case 2: fechas = "5 de Octubre 5:45am";
                    break;
                case 3: fechas = "8 de Octubre 8:40pm";
                    break;
            }
        } else if (ciudadOrigen.equalsIgnoreCase("Cartagena")) {
            int seleccionNumero = MetodoDatos.leerInt("Seleccione el horario a conveniencia \n\n1) 11 de Noviembre 9:25pm \n2) 8 de Noviembre 5:22am \n3) 14 de Noviembre 3:40pm");
            switch (seleccionNumero){
                case 1: fechas = "11 de Noviembre 9:25pm";
                    break;
                case 2: fechas = "8 de Noviembre 5:22am";
                    break;
                case 3: fechas = "14 de Noviembre 3:40pm";
                    break;
            }
        }

        return fechas;
    }

}
