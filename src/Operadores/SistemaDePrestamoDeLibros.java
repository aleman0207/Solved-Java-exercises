package Operadores;

import java.util.Scanner;

public class SistemaDePrestamoDeLibros {

    public static void main(String[] args) {

        System.out.println("*** Prestamo de libros ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Tienes credencial de Estudiante (true/flase): ");
        boolean credencialEstudiante = sc.nextBoolean();

        System.out.print("Tu vivineda queda al menos 3km de distancia de la bibloteca (true/flase)? ");
        boolean distacia = sc.nextBoolean();

        boolean condiciones = credencialEstudiante || distacia;

        System.out.print("Tu prestamo de libros es: " + condiciones);


    }
}
