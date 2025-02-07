public class InmutabulidadCadenas {
    public static void main(String[] args) {

        String cadena1 = "hola";
        System.out.println("cadena1 = " + cadena1);
        cadena1 = "Adios";
        String cadena2 = cadena1;
        System.out.println("cadena1 modificado = " + cadena1);
        System.out.println("cadena2 = " + cadena2);


    }
}
