package ClaseObjeto.Prueba;

import ClaseObjeto.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {

        System.out.println("*** Calculadora de numero ***");

        Aritmetica aritmetica1 = new Aritmetica(5, 7);


        System.out.println("Atributo de operando1: " + aritmetica1.getOperando1() );
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        // Primer Objeto
//        aritmetica1.operando1 = 5;
//        aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.resta();





    }

}
