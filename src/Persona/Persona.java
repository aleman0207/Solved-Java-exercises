package Persona;

public class Persona {

    // Atributos
    private String nombre;
    private String apellido;

    //Constructor

    public Persona  (String nombre, String apellido){
        this.nombre= nombre;
        this.apellido = apellido;
    }

    // Metodo

    public void MostrarDatos () {

        System.out.println("Nombre de usuario: " + this.nombre);
        System.out.println("Apellido de Usuario: " + this.apellido);
    }

    // get y set


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
