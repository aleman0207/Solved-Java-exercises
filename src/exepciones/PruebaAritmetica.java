package exepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try {
            int resultado = Aritmetica.division(10,2);
            System.out.println(resultado);

        }catch (Exception e){
            System.out.println("No de puede dividir entre 0 : " + e);
        }

        finally {
            System.out.println("Se reviso la division entre cero");
        }

    }
}
