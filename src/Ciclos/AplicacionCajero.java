package Ciclos;

import java.util.Scanner;

public class AplicacionCajero {
    public static void main(String[] args) {
        System.out.println("*** Aplicacion de cajero Automatico ***");

        Scanner sc = new Scanner(System.in);

        int saldo = 1000;

        boolean salir = false;

        int saldoRetirar =0 ;
        int saldoDepositar = 0;

        while (!salir){
            System.out.print("""
                    
                    Operaciones que puedes Realizar: 
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s""" + " ");

            int consola = sc.nextInt();



            switch (consola){

                case 1: System.out.println("Tu saldo es de: " + saldo +"$" );
                        break;
                case 2: System.out.print("Ingresa el monto a retirar: ");
                {
                    consola = sc.nextInt();
                    if (consola > saldo) {
                        System.out.print("El saldo es insuficiente. Saldo actual es: " + saldo +"$");
                    } else {
                       saldoRetirar = saldo - consola;
                    }
                    System.out.println("Nuevo saldo: " + saldoRetirar +"$");
                    break;
                }
                case 3: System.out.print("Depositar saldo: ");
                {
                    consola = sc.nextInt();

                    saldoDepositar = saldoRetirar + consola;

                    System.out.println("Nuevo saldo: " + saldoDepositar + "$");
                    break;
                }
                case 4: System.out.println("Saliendo del cajero Automatico. Hasta Pronto!");{
                    salir=true;
                    break;
                }

                default: System.out.println("Opcion Invaida. " +
                        "Seleciona otra opcion.\n");
            }

        }

    }


}
