package FuncionesRecursiva;

public class FuncionesRecursivas {
    // Imprimir los valores del 1 al 5 usuando funcion recursiva
    static  void funcionRecursiva (int numero){

        // Caso base
        if (numero == 1) {
            System.out.print(numero + " ");

        }else {
            funcionRecursiva(numero -1);
            System.out.print(numero + " ");
        }

    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
