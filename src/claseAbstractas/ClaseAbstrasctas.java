package claseAbstractas;

public class ClaseAbstrasctas {

    public static void main(String[] args) {

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Cuadrado();
        figuraGeometrica.dibujar();



    }
}

abstract class   FiguraGeometrica {
    public abstract void dibujar ();


}

class  Rectangulo extends  FiguraGeometrica {

    public void dibujar (){
        System.out.println("Esto es Rectangulo");
    }
}

class  Cuadrado extends  FiguraGeometrica {
    public  void dibujar (){
        System.out.println("Esto es un cuadrado");
    }

}