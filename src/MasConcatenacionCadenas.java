public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en java

        String cadena1 = "Hola";

        String cadena2 = "Mundo";

        String cadena3 = cadena1 + " " + cadena2;

        System.out.println("cadena3 usando + = " + cadena3);

        // Metodo concat

        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando el metodo concat = " + cadena3);

        // StringBuilder

        StringBuilder constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        String reultado = constructorCadenas.toString();
        System.out.println("reultado = " + reultado);

        // StringBuffer

        StringBuffer Buffer = new StringBuffer();
        Buffer.append(cadena1).append(" ").append(cadena2);
        reultado = Buffer.toString();
        System.out.println("Resusltado de tipo StringBuffer = " + reultado);

        // Join

        reultado = String.join(" ", cadena1 , cadena2 , "Adios!" );
        System.out.println("reultado con join = " + reultado);




    }
}
