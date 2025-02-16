package Ejercicios;

import java.util.Scanner;

public class ValorDentroRango {

    public static void main(String[] args) {

        System.out.println("*** El valor esat dentro del rango ***");

        Scanner sc = new Scanner(System.in);


        final int minimo = 0;
        final int maximo = 5;

        System.out.print("Introduce un numero verificar si esta dentro del rango: ");

        int dato = sc.nextInt();

        // Verificar si el dato esta dentro del rango

        boolean dentroRango = dato >= minimo && dato <= maximo;

        System.out.println("Esta dentro del rango = " + dentroRango);



    }
}
