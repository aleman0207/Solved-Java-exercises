package Ciclos;

public class NumerosImpares {

    public static void main(String[] args) {
        System.out.println("*** Numeros impares con Do-While ***");

        int contador = 0;

        do {
            if (contador % 2 != 0)

                System.out.print(contador + " ");
                contador++;


        }while (contador <= 20);

    }
}
