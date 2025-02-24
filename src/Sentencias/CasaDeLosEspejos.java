package Sentencias;

import java.util.Scanner;

public class CasaDeLosEspejos {

    public static void main(String[] args) {

        System.out.println("Reglas para entrar a la casa de los espejos ");

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingresa tu edad: ");

        int mayor = sc.nextInt();

        System.out.print("No le temes a la oscuridad (true/false)?: ");

        boolean oscuridad = sc.nextBoolean();

        if (mayor < 10 ){

            System.out.println("\nNo puedes entrar por ser menor de 10year");

        } else if (!oscuridad) {

            System.out.println("\nNo puedes entrar por tener miedo a la oscuridad");
        }else {

            System.out.println("\nDisfurta de la casa de los espejos");
        }


    }
}
