package ArreglosJava;

public class Matrices {
    public static void main(String[] args) {

        // Definicmos una matriz

        int [][] matriz = new  int [2] [3];

        // Modificar elementos de una matriz

        matriz[0][0]=100;
        matriz[0][1]=200;
        matriz[0][2]=400;
        matriz[1][0]=400;
        matriz[1][1]=500;
        matriz[1][2]=600;

        // acceder a los valores

        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);


    }
}
