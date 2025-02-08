package Ejercicios;

public class Ejercicio4 {

    //Declara dos variables a y b con valores numéricos diferentes. Luego, intercambia sus valores sin pedir una tercera variable auxiliar y muestra los valores después del intercambio.

    public static void main(String[] args) {


        int num1 = 15;
        int num2 = 20;

        System.out.println("Antes del intercambio ");
        System.out.println("a= " + num1 + " b= " + num2);


       num1 = num2 + num1;
       num2 = num1 +num2;


        System.out.println("Despues del intercambio");
        System.out.println("a= " + num1 + " b= " + num2);



    }
}
