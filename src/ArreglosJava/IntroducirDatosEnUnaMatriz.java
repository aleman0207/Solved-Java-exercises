package ArreglosJava;

import java.util.Scanner;

public class IntroducirDatosEnUnaMatriz {
    public static void main(String[] args) {
        System.out.println("Introducir valores a una matriz");
        int reglones , columnas;
        Scanner sc = new Scanner(System.in);

        // Definir  la matriz
        System.out.print("Ingresa los renglones de la matriz: ");
        reglones = sc.nextInt();
        System.out.print("Ingresa las columnas de la matriz: ");
        columnas = sc.nextInt();

        int[][] matriz = new int [reglones][columnas];

        // Solicitar  los valores

        for (int ren = 0; ren < reglones; ren++){

            for (int col = 0; col < columnas; col++){
                System.out.print("Valores[" + ren + "][" + col + "] = ");
                matriz[ren][col]= sc.nextInt();
            }
        }

        //Iterar  los valores de la matriz (Imprimir)
        System.out.println(" ");

        for(int ren = 0; ren < reglones; ren++){

            for(int col = 0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }


    }
}
