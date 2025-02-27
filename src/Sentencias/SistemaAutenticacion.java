package Sentencias;

import java.util.Scanner;

public class SistemaAutenticacion {

    public static void main(String[] args) {

        System.out.println("*** Systema de Autenticacion ***");

        Scanner sc = new Scanner(System.in);

        final String usuario = "admin";
        final int clave = 123;

        // Datos ingresado por el usuario

        System.out.print("Ingresa tu Usuario: ");

        String usuarioValido = sc.nextLine();

        System.out.print("Ingresa tu password: ");

        int claveCorrecta = Integer.parseInt(sc.nextLine());

        // Validacion de usurio

        if ( usuarioValido.equals(usuario) && claveCorrecta == clave  ){

            System.out.println("Bienvenido al Sistema");

        } else if (!usuarioValido.equals(usuario)  && claveCorrecta == clave) {

            System.out.println("Usuario invalido");

        } else if (usuarioValido.equals(usuario) && claveCorrecta != clave) {

            System.out.println("Password incorrecta");

        }else {
            System.out.println("Usuario y Password incorrecta por favor intentelo de nuevo");
        }

    }
}
