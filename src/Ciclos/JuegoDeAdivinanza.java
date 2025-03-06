package Ciclos;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** juego de adivinanzas ****");

        Random numeroRando = new Random();

        int numeroAleatorio = numeroRando.nextInt(1,51);

        boolean numeroCorrecto = false;
        int intentos = 0;
        int maxIntentos =10;

        System.out.println("Adivina el numero que estoy pensando del (1/50) tendras 10 intentos");

        while (!numeroCorrecto && intentos < maxIntentos) {
            System.out.print("Ingresa el número: ");
            int numerovalido = sc.nextInt();
            intentos++;

            if (numerovalido < numeroAleatorio) {
                System.out.println("Tu número " + numerovalido + " es menor. Intenta de nuevo.");
            } else if (numerovalido > numeroAleatorio) {
                System.out.println("Tu número " + numerovalido + " es mayor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número " + numeroAleatorio + " en " + intentos + " intentos.");
                numeroCorrecto = true;
            }

            if (intentos == maxIntentos && !numeroCorrecto) {
                System.out.println("Lo siento, has alcanzado el número máximo de intentos. El número era " + numeroAleatorio);
            }
        }


    }
}
