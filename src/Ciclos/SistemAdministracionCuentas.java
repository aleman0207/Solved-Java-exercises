package Ciclos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemAdministracionCuentas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        while (!salir){
            System.out.print("""
                    *** Sistema de Administracion de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3.Salir
                    Escoje una opcion:\s""");

            int consola = sc.nextInt();
            //Evaluar cada opcion

            switch (consola){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminado tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del Sistema");
                     salir = true;
                }

                default -> System.out.println("Opcion Invalida...\n");
            }


        }

        System.out.println("Fin del Sistema de administracion de Cuentas");
    }
}
