package Sentencias;

import java.util.Scanner;

public class MayorDedosNumeros {

    public static void main(String[] args) {

        System.out.println("Ingresa dos numero para ver cual es el mayor");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");

        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo numero: ");

        int num2 = sc.nextInt();

        if (num1 > num2){

            System.out.println("\nEl numero: " + num1 + " Es mayor que " + num2);
        }else {
            System.out.println("\nEl numero: " + num2 + " Es mayor que " + num1);

        }

    }
}
