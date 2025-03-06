package Ciclos;

public class AcomuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulada ***");

       final int MAXIMO = 5;
       int acomuladorSuma = 0;

       //Iterar los valores
        int numero = 1;

        while (numero <= MAXIMO){
            //Imprimir lo que va a sumar
            System.out.println("Acomulador suma + numero -> " + acomuladorSuma + " + " + numero);

            // Realizar la suma acumulativa
            acomuladorSuma += numero;
            numero++;

            //Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acomuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros " + MAXIMO + " numeros =  " + acomuladorSuma);
    }

}
