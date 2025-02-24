package Sentencias;

import java.util.Scanner;

public class TiendaEnLinea {

    public static void main(String[] args) {

        System.out.println("*** Tienda en linea ***");

        final int Monto_Para_Descuento = 1000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el monto gastado: ");

        double montoInicial = sc.nextDouble();

        System.out.print("Eres miembro de la tienda? (true/false): ");

        boolean miembro = sc.nextBoolean();

        double descuento = 0.0;


        if (montoInicial >= Monto_Para_Descuento && miembro ){

          descuento = 0.10;

          double montoFinal = montoInicial * descuento;

          double totalFinal = montoInicial - montoFinal;

            System.out.print("\nPor ser miembro y una compra superior a 1000$ tienes un descuento del 10%");
            System.out.print("\nTotal de la compra: " + montoInicial +"$" );
            System.out.print("\nDescuento del 10%: " + montoFinal +"$");
            System.out.print("\nMonto final de la compra: " + totalFinal +"$");

        } else if (miembro) {

             descuento =0.05;

            double montoFinal2 = montoInicial * descuento;

            double totalFinal2 = montoInicial - montoFinal2;

            System.out.print("\nPor ser miembro solo se te aplica un 5% de descunto ");
            System.out.print("\nTotal de la compra: " + montoInicial + "$");
            System.out.print("\nDescunto del 5%: " + montoFinal2 + "$");
            System.out.print("\nMonto final de la compra: " + totalFinal2 + "$");

        }else {

            System.out.print("\nMonto por no ser miembro de la tienda");
            System.out.print("\nTe invitamos a ser miembro");
            System.out.print("\nTotal de la compra: " + montoInicial);
        }


    }
}
