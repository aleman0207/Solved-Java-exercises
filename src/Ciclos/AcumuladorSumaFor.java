package Ciclos;

public class AcumuladorSumaFor {
    public static void main(String[] args) {
        System.out.println("*** Acumulador Suma for ***");

        final int MAXIMO = 5;
        int acumulador = 0;

        for (int numero = 1;numero <= MAXIMO;numero++){
            acumulador += numero;
            System.out.println("EL acumulado de la suma es: " + acumulador);
        }
    }
}
