package co.uniquindio.edu.controlador;

import javax.swing.*;

public class MetodoDatos {

    public static double leerDouble (String mensaje) {
        double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }


    public static int leerInt (String mensaje) {
        int dato= Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "Información del usuario", JOptionPane.QUESTION_MESSAGE));
        return dato;
    }


    public static char leerChar(String mensaje) {
        char dato= (JOptionPane.showInputDialog(mensaje)).toUpperCase().charAt(0);
        return dato;
    }


    public static String leerString (String mensaje) {
        String dato= JOptionPane.showInputDialog(null, mensaje, "Información del usuario", JOptionPane.QUESTION_MESSAGE);
        return dato;
    }


    public static boolean leerBoolean (String mensaje) {
        boolean centinela=false;
        int result = JOptionPane.showConfirmDialog(null, mensaje, "Escoger tipo de clase", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            centinela=true;
        }
        return centinela;
    }


    public static void imprimirTexto (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Informacion de compra", JOptionPane.INFORMATION_MESSAGE );
    }

    //////////Arreglos////////////


    public static double[] leerArregloDouble (String pregunta, int num) {

        double arreglo[] = new double [num];
        for (int i=0; i<num; i++) {
            arreglo[i]= leerDouble(pregunta+" ( "+(i + 1)+" de "+num+" )");
        }
        return arreglo;
    }


    public static int[] leerArregloEnteros(String pregunta, int num) {

        int arreglo[] = new int [num];
        for(int i=0; i<num; i++) {
            arreglo[i] = leerInt(pregunta+" ( "+(i + 1)+" de "+num+" )");
        }
        return arreglo;
    }

    public static String[] leerArregloString(String pregunta, int num) {

        String arreglo[] = new String [num];
        for(int i=0; i<num; i++) {
            arreglo[i] = leerString(pregunta+" ( "+(i + 1)+" de "+num+" )");
        }
        return arreglo;
    }

    public static String devolverStringArreglo ( int[] arreglo ) {
        String salida;


        salida = "[";
        for ( int i = 0 ; i < arreglo.length ; i++ ) {
            salida += arreglo[ i ] + " ";
        }
        salida +="]";
        return ( salida );
    }

    public static String devolverStringArreglo ( char[] arreglo ) {
        String salida;


        salida = "[";
        for ( int i = 0 ; i < arreglo.length ; i++ ) {
            salida += arreglo[ i ] + " ";
        }
        salida +="]";
        return ( salida );
    }

    public static String devolverStringArregloInt ( int[] arreglo ) {
        String salida;


        salida = "[";
        for (int i = 0; i < arreglo.length; i++) {
            salida += arreglo[i] + " ";
        }
        salida += "]";
        return (salida);
    }

}
