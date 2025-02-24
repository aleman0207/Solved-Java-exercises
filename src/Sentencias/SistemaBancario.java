package Sentencias;

import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        System.out.println("*** Sistema Bancario ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Desea salir del sistema (true/false): ");

        boolean sistema = sc.nextBoolean();

        if (!sistema ){

            System.out.println("Continuando dentro del sistema...");
        }else {

            System.out.println("Saliendo del sistema...");
        }
    }
}
