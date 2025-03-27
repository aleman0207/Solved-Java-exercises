package Persona.PruebaPersona;

import Persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Mostrar nombre y apellido del usuario ***");

        Persona persona1 = new Persona("Luis", "Aleman");

       /* System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        persona1.setNombre("Jose");
        persona1.setApellido("Aleman");
        System.out.println();
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());*/
        persona1.MostrarDatos();
        System.out.println();
        persona1.setNombre("Jose");
        persona1.setApellido("Aleman");
        persona1.MostrarDatos();
    }
}
