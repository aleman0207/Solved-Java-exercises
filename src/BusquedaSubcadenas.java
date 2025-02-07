public class BusquedaSubcadenas {
    public static void main(String[] args) {

        // Buscar subcadenas
        String cadena1 = "Hola Mundo";
        //subcadena a buscar "Hola"
        int indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // Subcadena de mundo

        int indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        // Subcadena no encontrada devuelve -1

        int indice3 = cadena1.indexOf("java");
        System.out.println("indice3 = " + indice3);



    }
}
