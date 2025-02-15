package Ejercicios;

import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Ingresa los datos de la receta ***");

        // datos a rellenar


        System.out.print("Ingrese el nombre de: ");
        String  nombreReseta = sc.nextLine();
        System.out.print("Ingrese los Ingredientes: ");
        String ingredientes = sc.nextLine();
        System.out.print("Ingrese el tiempo de la receta (min): ");
        int tiempoReceta = sc.nextInt();
        System.out.print("Ingrese la difilcutad (facil/medio/dificil): ");
        String difilcutad = sc.next();

        // Imprimer los datos de la receta


        System.out.println();
        System.out.println("--- Ingredientes para receta ---");
        System.out.println("\tNombre de la receta: " + nombreReseta);
        System.out.println("\tIngredientes de la receta: " + ingredientes);
        System.out.println("\tTimepo de la receta: " + tiempoReceta +("min") );
        System.out.println("\tDifilcutad: " + difilcutad);



    }

}
