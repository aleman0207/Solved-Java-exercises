package Ciclos;

import java.util.Scanner;

public class CreacionDePassword {
    public static void main(String[] args) {

        System.out.println("*** Validacion de password ***");

        Scanner sc = new Scanner(System.in);
        //  String password = " ";

        boolean valida = false;

        while(!valida ) {

            System.out.println("Ingresa una password que contenga como minimo 6 caracteres ");

            System.out.print("Ingrese la password: ");

            String password= sc.nextLine();

            if (password.length() < 6 ){

                System.out.println("Error. Ingrese nuevamente la password ");
            }else {

                System.out.println("Password guardada correctamete. Hasta luego!");

                valida = true;
            }
        }

    }
}
