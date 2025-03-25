package ClaseObjeto;

public class Aritmetica {

    // Atributos
    int operando1;
    int operando2;


    // Constructor
    public Aritmetica(int op1, int op2){

        operando1 = op1;
        operando2 = op2;

    }

    // Metodos
    void sumar (){
        int resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void resta (){
        int resultado = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado);
    }
    public static void main(String[] args) {

        System.out.println("*** Calculadora de numero ***");

        Aritmetica aritmetica1 = new Aritmetica(5, 7);

        // Primer Objeto
//        aritmetica1.operando1 = 5;
//        aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.resta();





    }

}
