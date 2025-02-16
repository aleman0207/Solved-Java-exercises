package Operadores;

public class OperadoresDeAsignacion {
    public static void main(String[] args) {

        System.out.println("*** Operadores de Asignacion ***");

        //Asignacion simple

        int numero =10;

        // Operadores de asignacion compuestos

        //+=

        numero += 5;

        System.out.println("numero = " + numero);

        //-=, *=, /= y %=
        numero *= 2;
        System.out.println("numero = " + numero);

        // Asignacion de variables multiples

        int a = 10, b = 15, c = 20;

        System.out.printf("a = %d; b = %d, c = %d", a,b,c);

    }
}
