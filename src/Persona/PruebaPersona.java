package Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Mostrar nombre y apellido del usuario ***");
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());

        Persona persona1 = new Persona("Luis", "Aleman");

       /* System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        persona1.setNombre("Jose");
        persona1.setApellido("Aleman");
        System.out.println();
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());*/

        System.out.println(persona1);

        System.out.println("Variable estatica: " + Persona.getContadorPersonas());

        // segundo Objeto
        Persona persona2 = new Persona("Jose", "Aleman" );
        System.out.println(persona2);
        System.out.println("Varibale estatica: " + Persona.getContadorPersonas());


       /* persona1.MostrarDatos();
        System.out.println();
        persona1.setNombre("Jose");
        persona1.setApellido("Aleman");
        persona1.MostrarDatos();*/
    }
}
