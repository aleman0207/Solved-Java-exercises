package Operadores;

import java.util.Scanner;

public class TiketVenta {

    public static void main(String[] args) {

        System.out.println("*** Generacion tiket de venta ***");

        Scanner sc = new Scanner(System.in);


        System.out.print("Preciio Leche: ");
        double precioleche =sc.nextDouble();
        System.out.print("Precio Arroz: ");
        double precioArroz =sc.nextDouble();
        System.out.print("precio azucar: ");
        double precioAzucar =sc.nextDouble();
        System.out.print("Precio jugo de Manzana: ");
        double precioJugoManzana =sc.nextDouble();


        // descuento

        System.out.print("algun descuento (%)? ");
        int descuentoPorcentaje = sc.nextInt();


        double subtotal = precioleche + precioAzucar + precioArroz + precioJugoManzana;

        double descuento = subtotal * (descuentoPorcentaje/100.0);

        double subtotalConDescuento = subtotal - descuento;

        double impuesto = subtotalConDescuento * 0.21;

        double total = impuesto + subtotalConDescuento;

        System.out.println();
        System.out.println("subtotal = " + subtotal);
        System.out.println("impuesto = " + impuesto);
        System.out.println("descuento = " + descuento);
        System.out.println("El total de tu compra es (con IVA): " + total);




    }
}
