package Operadores;

import java.util.Scanner;

public class CalcularRectangulo {

    public static void main(String[] args) {

        System.out.println("*** Ingresa los valores para calcular tu rectangulo ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la base: ");

        int base = sc.nextInt();

        System.out.print("Ingresa la Altura: ");

        int altura = sc.nextInt();

        int area = base * altura;

        int perimetro = 2 * (base + altura);


        System.out.println("El area de tu rectangulo es: " + area);

        System.out.println("El perimetro de tu rectangulo es: " + perimetro);


    }
}
