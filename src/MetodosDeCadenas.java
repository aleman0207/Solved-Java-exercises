public class MetodosDeCadenas {
    public static void main(String[] args) {
        //metodos de cadenas

        String cadena1 = "Hola mundo";

        // Obtener el largo de una cadena

        int longitud = cadena1.length();
        System.out.println("Longitud: " + longitud);

        // Remplazar caracter

        String nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);


        // Convertir a maysuculas

        String Mayusculas = cadena1.toUpperCase();
        System.out.println("Mayusculas = " + Mayusculas);

        // Convertir a minusculas
        System.out.println("Minusculas = " + cadena1.toLowerCase());

        // Metodo para eliminar espacios al inicio y al final

        String cadena2 = "Luis Aleman   ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());




    }
}
