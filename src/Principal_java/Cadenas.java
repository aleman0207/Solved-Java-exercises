package Principal_java;

public class Cadenas {

    public static void main(String[] args) {

        // Manejos de cadenas

        String cadena1 =  "Hola";
        System.out.println("cadena1 = " + cadena1);
        String cadena2 = new String ("mundo");
        System.out.println("cadena2 = " + cadena2);
        String cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        // Principal_java.Cadenas multipes
        String cadena4 = """
                Esta es una cadena 
                multilinia
                """;
        System.out.println("cadena4 = " + cadena4);


    }
}
