package Sentencias;

import java.util.Scanner;

public class NumeroPositivo {

    public static void main(String[] args) {

        System.out.println("*** Numero positivo ***");

        Scanner sc = new  Scanner (System.in);

        System.out.print("Ingresa un numero: ");

        int num = sc.nextInt();

        if (num >= 1){

            System.out.print("tu nummero " + num + " es postivo");
        }else {

            System.out.println("Tu numero es negativo " + num + " es negativo");
        }

    }
}
