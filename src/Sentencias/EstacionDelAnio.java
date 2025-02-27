package Sentencias;

import java.util.Scanner;

public class EstacionDelAnio {

    public static void main(String[] args) {

        System.out.println("*** Indenfica la Estacion del anio ***");

        Scanner sc = new Scanner (System.in);

        // Solicitud de los meses en valor numerico

        System.out.print("Ingresa en valor numerico el mes del anio (1/12): ");

        int mesDelAnio = Integer.parseInt(sc.nextLine());



       /* if ( mesDelAnio == 1 || mesDelAnio == 2 || mesDelAnio == 12 ){

            System.out.println("La estacion del anio es Invierno");


        } else if (mesDelAnio == 3 || mesDelAnio == 4 || mesDelAnio == 5) {

            System.out.println("La estacion del anio es Primavera");

        } else if (mesDelAnio == 6 || mesDelAnio == 7 || mesDelAnio == 8) {

            System.out.println("La estacion del anio es Verano");

        } else if (mesDelAnio == 9 || mesDelAnio == 10 || mesDelAnio == 11) {

            System.out.println("La estacion del anio es Otonio");
        }else {
            System.out.println("Estacion Desconocida");
        }*/



           switch (mesDelAnio){
           case 1,2,12 -> System.out.println("Invierno");
           case 3,4,5 -> System.out.println( "Primavera");
           case 6,7,8 -> System.out.println( "Verano");
           case 9,10,11 -> System.out.println("Otonio");
           default -> System.out.println("Estacion desconodicida" + mesDelAnio);
       };


    }
}
