package Ejercicios;

public class FormateoDeCadenas {

    public static void main(String[] args) {

        // Formateo de Cadenas

        System.out.println("*** Formateo de Cadenas ***");

        String nombre = "Luis";
        int edad = 28;
        double salario = 210000.20;

        // String.format

        String mensaje = String.format("Nombre: %s, edad: %d salario: %.2f", nombre, edad, salario );
        System.out.println(mensaje);


        // metodo prinf

        System.out.printf("Nombre: %S, Edad: %d, Salario: %.2f", nombre, edad, salario);

        // formateo con text block
        System.out.println();

        mensaje = """
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tEdad: %d
                \tSalario: %.2f
                
                
                """.formatted(nombre,edad, salario);
        System.out.println(mensaje);
    }

}
