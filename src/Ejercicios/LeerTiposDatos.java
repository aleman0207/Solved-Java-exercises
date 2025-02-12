package Ejercicios;

import java.util.Scanner;

public class LeerTiposDatos {

    public static void main(String[] args) {

        // connvercion de datos

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona un valor entero");

        int entero = Integer.parseInt(sc.nextLine());
        System.out.println("entero = " + entero);


    }
}
