package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    // pide al usuario que ingrese un numero y determina si es par o impar

    public static void main(String[] args) {

        System.out.println("*** Ingresa un numero ***");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num % 2 == 0 ? "Es par " : "Es impar");



    }
}
