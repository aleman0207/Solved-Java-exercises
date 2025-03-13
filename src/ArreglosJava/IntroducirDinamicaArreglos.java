package ArreglosJava;

import java.util.Scanner;

public class IntroducirDinamicaArreglos {
    public static void main(String[] args) {
        // Intucir de manera Dinamica a un arreglo

        Scanner sc = new Scanner(System.in);


        // Declaracion de nuesto arreglo

        System.out.print("Proporciona el largo del arreglo: ");
        int largoArreglo = Integer.parseInt(sc.nextLine());

        //Creamos la manera dinamica el arreglo

        int [] enteros = new int [largoArreglo];

        //solicitar los valores del arreglo

        for (int i=0;i <largoArreglo; i++){

            System.out.print("Proporcionaste enteros[ " + i + " ] = ");
            enteros[i]= sc.nextInt();
        }

        // imprimir los valores del arreglo

        System.out.println("\nImprimir el arreglo: ");

        for (int i = 0 ; i < largoArreglo; i ++ ){
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        }



    }
}
