package ArreglosJava;

import java.util.Scanner;

public class PromedioDeCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Promedio de Calificaciones ***");

        System.out.print("Introduce el numero de calificaiones: ");
        int calificaciones = Integer.parseInt(sc.nextLine());

        // arreglo

        int[] notas =  new int  [calificaciones];

        // contenedor
        int suma = 0;

        //solictud de notas

         for(int i=0; i < calificaciones; i++){

             System.out.print("Introduce tus notas " + i + " = ");
             notas[i]= sc.nextInt();

             suma += notas[i];
         }

         // promedio de las notas

        double promedio = (double) suma / calificaciones;

        System.out.println("\nEl promedio de calificaiones es: " + promedio);

    }


}
