package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    /*Solicita al usuario que ingrese una frase y un carácter que desee reemplazar. Luego, solicita el nuevo carácter por el cual desea hacer el cambio y muestra la frase modificada.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingrese el caracter a remplazar: ");
        String remplazarfrase = sc.nextLine();

        System.out.print("Ingre el nuevo caracter: ");
        String nuevoCaracter = sc.nextLine();


        String nuevaFrase = frase.replace(remplazarfrase,nuevoCaracter);

        System.out.print("Frase modificada: " + nuevaFrase );





    }
}
