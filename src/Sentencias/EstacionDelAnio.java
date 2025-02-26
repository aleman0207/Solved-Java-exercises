package Sentencias;

import java.util.Scanner;

public class EstacionDelAnio {

    public static void main(String[] args) {

        System.out.println("*** Indenfica la Estacion del anio ***");

        Scanner sc = new Scanner (System.in);

        // Solicitud de los meses en valor numerico

        System.out.print("Ingresa en valor numerico el mes del anio (1/12): ");

        int mesDelAnio = sc.nextInt();

        if ( mesDelAnio == 1 || mesDelAnio == 2 || mesDelAnio == 12 ){

            System.out.println("La estacion del anio es Invierno");


        } else if (mesDelAnio == 3 || mesDelAnio == 4 || mesDelAnio == 5) {

            System.out.println("La estacion del anio es Primavera");

        } else if (mesDelAnio == 6 || mesDelAnio == 7 || mesDelAnio == 8) {

            System.out.println("La estacion del anio es Verano");

        } else if (mesDelAnio == 9 || mesDelAnio == 10 || mesDelAnio == 11) {

            System.out.println("La estacion del anio es Otonio");
        }else {
            System.out.println("Estacion Desconocida");
        }


    }
}
