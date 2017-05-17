package com.company.PrimeraVentana;

import javax.swing.*;

/**
 * Created by Manu on 15/05/2017.
 */
public class EjemploSencilloVentana {

    public static void main(String[] args) {
        VentanaSencilla miVentana = new VentanaSencilla();
    }
}
class VentanaSencilla extends JFrame{

    public VentanaSencilla(){

        /**
         * Dar tamaño
         */
        setSize(500,500);
        /**
         * Dar visibilidad
         */
        setVisible(true);
        /**
         * Para que se cierre la ventana
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
