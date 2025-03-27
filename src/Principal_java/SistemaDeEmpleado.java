package Principal_java;

import java.util.Scanner;

public class SistemaDeEmpleado {

    public static void main(String[] args) {

        Scanner respuesta = new Scanner (System.in);

        System.out.println("*** Sistema de empleados ***");

        //Nombre Empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = respuesta.nextLine();

        //Edad de empleado

        System.out.print("Edad del empleado: ");
        int edad = Integer.parseInt(respuesta.nextLine());

        // Salarios del empleado

        System.out.print("Salario del empleado: ");
        double salario = Double.parseDouble(respuesta.nextLine());

        // Es jefe de departamento

        System.out.print("Es jefe de departamento (true/false)?: ");
        boolean esJefeDepartamento = Boolean.parseBoolean(respuesta.nextLine());


        // Imprimer los valores del empleado

        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + edad);
        System.out.println("\tSalario: $%.2f ".formatted(salario)); // formato de dos digitos digitales
        System.out.println("\tEs jefe de departamento: " + esJefeDepartamento);




    }
}
