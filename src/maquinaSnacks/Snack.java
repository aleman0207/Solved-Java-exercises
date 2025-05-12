package maquinaSnacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack  implements Serializable {

    //variables

    private static int contadorSnacks = 0;
    private int idSncack;
    private String nombre;
    private double precio;

    // Constructores


    public Snack (){
        this.idSncack = ++ Snack.contadorSnacks;

    }


    public Snack(String nombre, double precio) {
        this(); // debe ser la primera linea la llamada del constructor
        this.nombre = nombre;
        this.precio = precio;

    }


    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    public int getIdSncack() {
        return idSncack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSncack=" + idSncack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSncack == snack.idSncack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSncack, nombre, precio);
    }
}
