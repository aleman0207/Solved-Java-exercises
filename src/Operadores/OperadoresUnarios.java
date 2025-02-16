package Operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {

        System.out.println("*** Operedares Unarios ***");

        int a = 3 , b= -2, resultado;

        boolean c = true;

        // Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        // Operador Unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operador unarios incremento / decremento

        //Pre-Incremento
        a=3;
        resultado =++a; // primero se incrementa el valor

        System.out.println("resultado ++a = " + resultado);

        // Pos-Incremento
        a= 3;
        resultado = a++; // primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a++ en este momento se incrementa = " + a);

        // Pre-Decremento
        b=-2;
        resultado = --b; //primero se incrementa y despues se usa el valor de la variable
        System.out.println("resultado --b = " + resultado);

        // Pos-Decremento
        b=-2;
        resultado=b--; //primero se usa el valor y despues se incrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b-- = " + b);




    }
}
