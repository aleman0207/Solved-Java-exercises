public class ReemplazarSubcadenas {
    public static void main(String[] args) {

        // Remplazar Subcadenas

        String cadena = " Hola Mundo";
        System.out.println("cadena = " + cadena);

        // Remplazar cadenas

        String nuevaCadena = cadena.replace("Mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Remplazar hola  por adios
        nuevaCadena = cadena.replace("Hola","Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);

    }
}
