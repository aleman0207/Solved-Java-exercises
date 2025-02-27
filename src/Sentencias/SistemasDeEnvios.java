package Sentencias;

import java.util.Scanner;

public class SistemasDeEnvios {

    public static void main(String[] args) {

        System.out.println("*** Sistemas de envios ***");

        Scanner sc = new Scanner(System.in);

        final double  tarifaNacional = 10;
        final double  tarifaInternacional = 20;

        System.out.print("Ingresa el destino (Nacional/Internacional): ");

        String destino = sc.nextLine();

        System.out.print("Ingresa el peso del paquete: ");

        double peso = Double.parseDouble(sc.nextLine());

        double tarifa=0.0;

        if (destino.equalsIgnoreCase("nacional")){

           tarifa = tarifaNacional * peso;

            System.out.println("El envio Nacional ");
            System.out.println("Tarifa por Kilos: " + peso + " su precio es: " + tarifa);

        }else if (destino.equalsIgnoreCase("internacional")){
            tarifa = tarifaInternacional * peso;

            System.out.println("El envio Internacional ");
            System.out.println("Tarifa por Kilos: " + peso + " su precio es: " + tarifa);
        }else {
            System.out.println("Destino no valido ");
        }
    }
}
