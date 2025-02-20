package Operadores;

import java.util.Scanner;

public class SistemaAutenticacion {

    public static void main(String[] args) {

        System.out.println("*** Autenticacion de contrasena ***");

        Scanner sc = new Scanner(System.in);

        final String valoresUsuario = "Luis Aleman";

        final String valoresContrasena = "123Aleman-";

        System.out.print("Ingresa el Usuario: ");

        String usuario = sc.nextLine();

        System.out.print("Ingresa la contrasena: ");

        String contrsena = sc.nextLine();

        boolean usuarioValido = usuario.equals(valoresUsuario);

        boolean contrasenaValida =contrsena.equals(valoresContrasena);


        System.out.println("Su usuario es: " + usuarioValido);
        System.out.println("Su contrasena es: " + contrasenaValida);

    }
}
