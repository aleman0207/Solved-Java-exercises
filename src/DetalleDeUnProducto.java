public class DetalleDeUnProducto {

    public static void main(String[] args) {

        System.out.println("*** Tienda en linea (Detalle Producto) ***");

        String nombreProducto = "Arroz";
        double precio = 5.82;
        int cantidadDisponible = 0;
        boolean disponible = false;

        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad de producto: " + cantidadDisponible);
        System.out.println("Disponible: " + disponible);


        // Modificar valores de las variables

        nombreProducto = "Pasta";
        precio = 7.82;
        cantidadDisponible = 15;
        disponible= true;

        System.out.println();
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad de producto: " + cantidadDisponible);
        System.out.println("Disponible: " + disponible);


    }
}
