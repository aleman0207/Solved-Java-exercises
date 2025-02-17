package Operadores;

import java.util.Scanner;

public class SistemasDeDescuento {

    public static void main(String[] args) {


        System.out.println("*** Sistema de descuentyo VIP ***");

        final int NO_PRODUCTOS_DESCUENTO = 10;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy? ");
        int cantidadProductos = sc.nextInt();

        System.out.print("tienes Menbresia de la tienda (true/false)");
        boolean membresia = sc.nextBoolean();

        boolean esElegiobleElDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && membresia;

        System.out.print("Tienes acceso al descuento vip= " + esElegiobleElDescuento);


    }
}
