package Operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        System.out.println("*** Operadores and ***");

        boolean a = true, b = true;

        boolean resultado = a && b;

        System.out.println("resultado = " + resultado);

        // operador Or

        boolean c = true, d = false;

        boolean resultado2 = a || b;

        System.out.println("resultado2 = " + resultado2);


        // Operador not

        boolean e = true;

        boolean resultado3 = !e;

        System.out.println("resultado3 = " + resultado3);

    }
}
