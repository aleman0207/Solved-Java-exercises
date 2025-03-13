package Funciones;

import java.util.Scanner;

public class FuncionPar {
    // Funcion para saber si un numero es par

    static  int numeroPar (int a ){

        int num = a;

       if (num % 2 == 0){

           System.out.print("Tu numero " + num + " es par");
       }else {
           System.out.print("Tu numero " + num + " es impar");

       }

       return num;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*** Ingresa un numero para comprobar si es par o no ***");

        System.out.print("Ingresa un numero: ");
        int num2 = sc.nextInt();

        numeroPar(num2);


    }

}
