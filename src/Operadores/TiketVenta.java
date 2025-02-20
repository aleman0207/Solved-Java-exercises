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


        double subtotal = precioleche + precioAzucar + precioArroz + precioJugoManzana;

        double impuesto = subtotal * 0.21;

        double total = impuesto + subtotal;

        System.out.println();
        System.out.println("subtotal = " + subtotal);
        System.out.println("impuesto = " + impuesto);
        System.out.println("El total de tu compra es (con IVA): " + total);




    }
}
