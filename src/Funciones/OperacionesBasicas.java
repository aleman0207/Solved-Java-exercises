package Funciones;


import java.util.Scanner;

public class OperacionesBasicas {


    static int suma ( int a , int b){

        int contenedorSuma;

        contenedorSuma  = a + b;


        return  contenedorSuma;
    }

    static  int resta (int a , int b ){

        int contenedorResta;

        contenedorResta = a - b;

        return contenedorResta;

    }

    static int multiplicacion ( int a , int b){

        int contenedorMulti;

        contenedorMulti = a * b;

        return contenedorMulti;
    }

    static double  division ( double a, double b){

        double contenedorDivi;

        contenedorDivi = a / b;

        return contenedorDivi;
    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Programa para calcular numero ***");

        System.out.println("Ingrese dos numeros para hacer la operacion");

        System.out.print("Ingresa el primer numero: ");

        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo numero: ");

        int num2 = sc.nextInt();

        System.out.print("\nEl resultado de la suma es= " + suma(num1,num2));
        System.out.print("\nEl resultado de la resta es= " + resta(num1,num2));
        System.out.print("\nEl resultado de la multiplicacion es= " + multiplicacion(num1,num2));
        System.out.print("\nEl resultado de la divivicion es= " + division(num1,num2));



    }

}
