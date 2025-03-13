package Funciones;

public class FuncionSumar {

    //Definimos la funcion de sumar

    static int sumar (int a , int b){

        int resultado  = a + b;
        return resultado;
    }

    public static void main(String[] args) {

        int arg1 = 3;
        int arg2 = 8;

        int resultadoFuncio = sumar(arg1, arg2);

        System.out.println("tu suma es: " + resultadoFuncio);

        resultadoFuncio = sumar(10, 20);

        System.out.println("La suma es: " + resultadoFuncio);


    }
}
