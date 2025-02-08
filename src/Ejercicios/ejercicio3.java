package Ejercicios;

import java.util.Scanner;

public class ejercicio3 {

    //Solicita al usuario que ingrese una palabra y luego muestra en pantalla cuántos caracteres tiene esa palabra.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Escribe una palabra ***");

        String palabra =sc.next();


        System.out.println("Tu palabra tiene " + palabra.length() + " de caracteres");


    }
}
