package Ciclos;

import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Proporciona el numero de filas: ");
        int numeroFilas = sc.nextInt();

        // Iteramos sobre cada fila de triangulo
        for(int fila = 1;fila <= numeroFilas;fila++){

            String espaciosBlanco = " ".repeat(numeroFilas-fila);
            String asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);

        }
    }
}
