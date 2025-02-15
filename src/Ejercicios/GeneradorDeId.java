package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class GeneradorDeId {

    public static void main(String[] args) {

        System.out.println("*** Ingrese el Ususario ***");

        Scanner sc = new Scanner(System.in);
        Random id = new Random();

        // Datos ingresados por el usuario

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese ano de nacimiento: ");
        String anoDeNacimiento = Integer.toString(sc.nextInt());

        // Generador de Id unico
        int idRamdon = id.nextInt(9999 ) + 1;

        // Convertir los datos



        String subCadena1 = nombre.toUpperCase().substring(0,2);

        String subCadena2 = apellido.toUpperCase().substring(0,2);

        String subCadena3 = anoDeNacimiento.substring(anoDeNacimiento.length() - 2);


        String idFormatiado=String.format("%04d" , idRamdon);


        String mensaje = subCadena1+subCadena2+subCadena3+idFormatiado;
        System.out.println("ID Unico: " + mensaje);




    }
}
