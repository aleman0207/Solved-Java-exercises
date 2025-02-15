package Ejercicios;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        System.out.println("*** Numeros aleatorios ***");

         Random numeroRanmdon = new Random();


         //Generar numero ramdon

        int numeroAleatorio = numeroRanmdon.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        //generar un numero aleatorio entre 1 y 10

        numeroAleatorio = numeroRanmdon.nextInt(10) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Generando un numero flotante enre 0.0 y 1.0

        float flotanteAleatorio = numeroRanmdon.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular el lanzamiento de un dado (1 y 6)

        int dado = numeroRanmdon.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dado = " + dado);

    }
}
