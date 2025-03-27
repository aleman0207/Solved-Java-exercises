package Principal_java;

public class TiposDatos {

    public static void main(String[] args) {

        //tipos de datos en Java

        //entero ( su valor por default es 0)
        byte tipoByte =127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong= 987654321;
        System.out.println("tipoLong = " + tipoLong);

        //tipo de datos de puntos flotantes (valor default 0.0)

        float tipofloat = 3.14F; //f o F para indicar que es tipo float
        System.out.println("tipofloat = " + tipofloat);
        double tipoDouble= 31315;
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter ( valor por default '\Uoooo')

        char tipoChar = 'A'; // caracter del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Boolean (valor por default (false) )

        boolean tipoboolean = true;
        System.out.println("tipoboolean = " + tipoboolean);
        tipoboolean =false;
        System.out.println("tipoboolean = " + tipoboolean);

        // tipos Object (referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre ="Luis";
        System.out.println("nombre = " + nombre);



    }

}
