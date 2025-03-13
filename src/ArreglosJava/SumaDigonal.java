package ArreglosJava;

import java.util.Scanner;

public class SumaDigonal {
    public static void main(String[] args) {
        System.out.println("*** Suma Matriz ***");

        int renglones , columnas;
        Scanner sc = new Scanner(System.in);

        //definir los valores
        System.out.print("Introduce los renglones: ");
        renglones = sc.nextInt();
        System.out.print("Introduce las columnas: ");
        columnas = sc.nextInt();

        // definir la matriz
        int [][] matriz = new int[renglones][columnas];
        int suma = 0;

        // Recorrer la matriz

        for(int ren = 0; ren < renglones; ren++){

            for(int col = 0;  col < columnas; col ++){
                System.out.print("introduce los datos: [" + ren + "][" + col + "] = ");
                matriz[ren][col] = sc.nextInt();

                }
            }

        for (int ren  = 0; ren < renglones; ren ++){
            for(int col = 0;  col < columnas; col ++) {

                if (ren == col){

                    suma += matriz[ren][col];
                }

            }
        }

        System.out.println("La suma de la matriz es: " + suma);
    }
}
