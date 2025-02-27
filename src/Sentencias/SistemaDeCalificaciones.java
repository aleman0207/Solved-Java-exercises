package Sentencias;

import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String[] args) {


        System.out.println("*** Sistema de calificacion ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la calificacion en valor numerico: ");

        double calificacion = Double.parseDouble(sc.nextLine());

       if (calificacion >= 9 && calificacion <= 10){

           System.out.println("Calificacion es A" );
       } else if ( calificacion >= 8 && calificacion <9) {

           System.out.println("Calificacion es B" );
       } else if (calificacion >= 7 && calificacion < 8) {

           System.out.println("Calificacion es C" );
       } else if (calificacion >=6 && calificacion < 7) {

           System.out.println("Calificacion es D" );

       } else if (calificacion >= 0 && calificacion < 6) {

           System.out.println("Calificacion es F" );

       }else {

           System.out.println("Valor desconocido");
       }

    }
}
