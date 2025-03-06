package Ciclos;

public class AcumuladorSumaDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Acumulador suma do-while");

        final int MAXIMO = 5;
        int acumulador = 0;

        int numero = 1;

        do {

            acumulador += numero;
            numero++;

            System.out.println("La suma acumulada del numero es: " + acumulador);

        }while(numero <= MAXIMO);
    }
}
