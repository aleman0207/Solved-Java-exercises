package Operadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RangoDeUnaVariable    {
    public static void main(String[] args) {

        System.out.println("*** Rango de una Variable ***");

        Scanner sc = new Scanner(System.in);


        System.out.print("Escribe un numero que este dentro del rango: ");
        int dato = sc.nextInt();

        boolean dentroDeRango = dato >= 1 && dato <= 10;


        System.out.println("el numero es de rango: " + dentroDeRango );


        // logica inversa

        boolean fueraRango = !(dato >= 1 && dato <= 10);

        System.out.println("Variable fuera de rango entre uno y 10: " + fueraRango );

    }
}
