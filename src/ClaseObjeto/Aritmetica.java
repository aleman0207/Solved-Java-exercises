package ClaseObjeto;

public class Aritmetica {

    // Atributos
   private int operando1;
   private int operando2;


    // Constructor
    public Aritmetica(int operando1, int operando2 ){

        this.operando1 = operando1;
        this.operando2 = operando2;

    }

    // Metodos
    public void sumar (){
        int resultado = this.operando1 + this.operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    public void resta (){
        int resultado = this.operando1 - this.operando2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    public int getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }


    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
