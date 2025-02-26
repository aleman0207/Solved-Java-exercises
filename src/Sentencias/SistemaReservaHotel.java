package Sentencias;

import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        System.out.println("*** Sistema De Reserva De Hotel ***");

        Scanner sc = new Scanner(System.in);

        // Datos de reserva

        System.out.print("Nombre de cliente: ");

        String nombrecliente = sc.nextLine();

        System.out.print("Ingresa los dias de estadia: ");

        int diasEstadia = sc.nextInt();

        System.out.print("Quieres la habitacion con vista al mar (true/false): ");

        boolean habitacionConVistas = sc.nextBoolean();

        // Precio de las habitaciones

        double precioSinVistaAlMar = 150.50;
        double precioConVistaAlMar = 190.50;
        double precioHabitacion = 0.0;

        // Datos a imprimir

        if(habitacionConVistas == true){

            precioHabitacion = diasEstadia * precioConVistaAlMar;

            System.out.println("-----------Detalles de la reservacion-------------");
            System.out.println("Cliente: " + nombrecliente);
            System.out.println("Dias de estadia: " + diasEstadia);
            System.out.println("Habitacion con vista al mar" );
            System.out.println("Precio total de la habitacion: " + precioHabitacion);

        }else {

            precioHabitacion = diasEstadia * precioSinVistaAlMar;

            System.out.println("-----------Detalles de la reservacion-------------");
            System.out.println("Cliente: " + nombrecliente);
            System.out.println("Dias de estadia: " + diasEstadia);
            System.out.println("Habitacion sin vista al mar");
            System.out.println("Precio total de la habitacion: " + precioHabitacion);
        }
    }
}
