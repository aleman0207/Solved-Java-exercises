package Ventas;

public class Producto {
    // Atributos
  private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProdusctos;

    // Constructor
    public Producto(String nombre, double precio){
        this.idProducto = ++Producto.contadorProdusctos;
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodos

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + this.idProducto +
                ", nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                '}';
    }
}
