package Principal_java;

public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Manejon de subcadena

        String cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena

        String subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        String subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);

    }
}
