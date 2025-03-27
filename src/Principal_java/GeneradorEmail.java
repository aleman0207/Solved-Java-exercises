package Principal_java;

public class GeneradorEmail {

    public static void main(String[] args) {

        // variables

        String nombreCompleto = "Luis Aleman Palencia";
        String empresa = "La empresa de mi Casa";
        String dominio = "com.es";

         // Generando email

        String cadenaPunto = nombreCompleto.replace(" ",".");
        String usuario = cadenaPunto.toLowerCase();


        String cadenaPunto2 = "." + dominio;

        String cadena3 =empresa.replace(" ","");
        String arroba = "@" + cadena3;

        arroba = String.join("",arroba,cadenaPunto2);

        String resultado = String.join("",usuario,arroba);

        // Email Normalizado

        System.out.println("*** Genereador de Email ***");

        System.out.println("Nombre de usuario: " + nombreCompleto);
        System.out.println("Nombre usurio normalizado: " + usuario);
        System.out.print("\n");
        System.out.println("Nombre de empresa: " + empresa);
        System.out.println("Extencion del Dominio: " + cadenaPunto2 );
        System.out.println("Dominio de empresa normalizado: " + arroba );
        System.out.println(" ");
        System.out.println("Email final generado: " + resultado);



    }

}
