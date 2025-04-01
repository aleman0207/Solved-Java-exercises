package Ventas;

public class PruebaVentas {

    public static void main(String[] args) {

        System.out.println("*** Sistema de ventas ***");
        Producto producto1 = new  Producto("Blusa", 30.0);
        //System.out.println(producto1);

        Producto producto2 = new Producto("Zapatos", 50.0);
        //System.out.println(producto2);

        // objeto de tipo orden

        Orden orden1 = new Orden();
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        System.out.println(orden1);
        //orden1.mostrarOrden();

        // Segunda Orden

        Producto producto3 = new Producto("Gorro", 70.0);
        Producto producto4 = new Producto("Pantalon", 45.0);

        Orden orden2 = new Orden();
        orden2.agregarProductos(producto3);
        orden2.agregarProductos(producto4);
        orden2.agregarProductos(producto1);
        System.out.println(orden2);
        //orden2.mostrarOrden();
    }
}
