package Sentencias;

import java.util.Scanner;

public class EsMayorDeEdad {

    public static void main(String[] args) {

        System.out.print("Ingresa tu edad: ");

        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();

        if (edad >= 18) {

            System.out.println("Eres mayor de edad");


        }else if ( edad >= 13 && edad < 18) {

            System.out.println("Eres un adolecente");

        }else {

            System.out.println("Eres un nino");
        }


    }

}
