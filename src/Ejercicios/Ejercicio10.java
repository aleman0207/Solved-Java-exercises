package Ejercicios;

import java.util.Scanner;



public class Ejercicio10 {

    public static void main(String[] args) {

        System.out.println("*** Calcular area de un circulo ***");

        System.out.print("Ingrese un valor para calcualr: ");

        Scanner sc = new Scanner(System.in);

        double  radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio,2);


        System.out.println("El area de circulo es: " + area );
    }
}
