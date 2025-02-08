package Ejercicios;

import java.util.Scanner;

public class Ejercico5 {
    /*Solicita al usuario que ingrese una frase y muestra la misma frase en:
        Mayúsculas
        Minúsculas
        Longitud de la frase (cantidad de caracteres)*/

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("*** Ingrese una frase ***");

        String frase = sc.nextLine();

        //String mayusculas = frase.toUpperCase();
        //String minisculas = frase.toLowerCase();

        System.out.println("Masysuculas: " + frase.toUpperCase());
        System.out.println("minisculas: " + frase.toLowerCase());
        System.out.println("Longitud de la frese: " + frase.length());

    }


}
