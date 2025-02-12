package Ejercicios;

import java.util.Scanner;



public class Ejercicio7 {

   // Pide al usuario que ingrese una palabra y muestra en pantalla cuál es la última letra de esa palabra.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");

        String palabra = sc.nextLine();

        String ultimaLetra =palabra.substring(palabra.length()-1);

        System.out.println(" Ultima letra: " + ultimaLetra  );


    }

}
