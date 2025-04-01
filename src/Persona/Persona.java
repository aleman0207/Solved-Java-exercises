package Persona;

public class Persona {

    // Atributos
   private static int contadorPersonas = 0;
    private String nombre;
    private String apellido;
    private int ideUnico = 0;


    //Constructor
    public Persona  (String nombre, String apellido){
        this.nombre= nombre;
        this.apellido = apellido;

        //Incrementar el atributo statico
        Persona.contadorPersonas++;

        //Imcremantar variable
        this.ideUnico = Persona.contadorPersonas;
    }

    @Override
    public String toString() {
        return "ID: " + this.ideUnico
                +", Nombre: " + this.nombre
                + ", Apellido: " + this.apellido
                + ", para impirmir direcion de memoria " + super.toString();
    }





    // Metodo

   /* public void MostrarDatos () {

        System.out.println("Nombre de usuario: " + this.nombre);
        System.out.println("Apellido de Usuario: " + this.apellido);
    }*/

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

    public int getIdeUnico() {
        return this.ideUnico;
    }

    public void setIdeUnico(int ideUnico) {
        this.ideUnico = ideUnico;
    }


    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }


}
