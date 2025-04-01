package Ventas;

public class Orden {
    // Atributos
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private  static int contadorOrdenes;

    // Constructor

    public Orden(){
        this.idOrden= ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    // Metodos

    public void agregarProductos(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS)
        this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Se ha superado el maximo de prodcutos: " + Orden.MAX_PRODUCTOS);
    }

    public double cacularTotal(){
        double total = 0;
        for (int i = 0;i < this.contadorProductos;i++){
            Producto producto = this.productos[i];
            total = total + producto.getPrecio();
        }

        return total;
    }


//    public void mostrarOrden (){
//        System.out.println("Id Orden: " + this.idOrden);
//        double totalOrden = this.cacularTotal();
//        System.out.println("\tTotal de la orden: $" + totalOrden );
//        System.out.println("\tProdcutos de la orden: ");
//        for(int i = 0; i < this.contadorProductos; i++){
//            System.out.println("\t\t"+ this.productos[i]);
//        }
//    }

  @Override
    public String toString(){
        String resultado = "Id Orden: " + this.idOrden + "\n";
        double totalOrden = this.cacularTotal();
       resultado += "\tTotal de la orden: $" + totalOrden + "\n";
        resultado += "\tProdcutos de la orden: " + "\n";
        for(int i = 0; i < this.contadorProductos; i++){
            resultado += "\t\t"+ this.productos[i] + "\n";

        }

      return resultado;

  }


}
