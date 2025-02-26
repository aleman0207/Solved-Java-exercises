package Sentencias;

import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {

        System.out.println("*** Aplicacion de Salud y Fitnes ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Inrgesa tu nombre de usurio: ");

        String nombre = sc.nextLine();

        System.out.print("Ingresa los pasos camino en el dia: ");

        int pasosCaminados = sc.nextInt();

        final int META_PASOS_DIARIO = 10000;

        final double CALORIAS_POR_PASO = 0.04;

        double caloriasQuemadas = pasosCaminados * CALORIAS_POR_PASO;

        if (pasosCaminados >= META_PASOS_DIARIO){

            System.out.println();
            System.out.println("Hola: " + nombre );
            System.out.println("Enhorabuena llegaste a la meta de pasos dirios tus pasos son: " + pasosCaminados);
            System.out.println("Calorias quemas el dia de hoy: " + caloriasQuemadas);

        }else {

            System.out.println();
            System.out.println("Hola: " + nombre );
            System.out.println("hoy no llegamos al meta de los pasos diarios: " + META_PASOS_DIARIO);
            System.out.println("Tus pasos caminados hoy son: " + pasosCaminados);
        }



    }

}
