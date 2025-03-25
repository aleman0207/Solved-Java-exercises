package ClaseObjeto;

import java.util.Scanner;

public class Persona {
    // Atributos
    String nombre;
    String apellido;

    // Metodos
    void mostrarPersona (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objetos Persona ***");

        // Primero Objeto
        Persona objeto1 = new Persona();
        objeto1.nombre="Luis";
        objeto1.apellido="Aleman";
        objeto1.mostrarPersona();

        System.out.println();
        // Segundo objeto
        Persona objeto2 = new Persona();
        objeto2.nombre="Jose";
        objeto2.apellido="Aleman";
        objeto2.mostrarPersona();
    }
}
