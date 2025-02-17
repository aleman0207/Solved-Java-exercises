package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        //Solicita al usuario que ingrese dos números y muestra el resultado de sumarlos, restarlos, multiplicarlos y dividirlos.

        System.out.println("*** Caculadora Basica ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");

        int a = sc.nextInt();

        System.out.print("Ingresa el segundo numero: ");

        int b = sc.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multipli = a * b;
        double divi = a / b;


        System.out.println();
        System.out.println("\tSuma: " + suma);
        System.out.println("\tResta: " + resta);
        System.out.println("\tMultiplicacion: " + multipli);
        System.out.println("\tDivicion: " + divi);

    }
}
