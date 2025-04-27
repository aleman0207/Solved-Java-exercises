package traductor;

public interface Traductor {
    // public y abtract

    void traducir ();

    // Metodos con implementacion con default

    default  void iniciarTraductor (){
        System.out.println("Iniciando traductor...");
    }

    class ingles implements Traductor {
        @Override
        public void traducir (){

            System.out.println("Traduzco a Ingles ");

        }
    }

    class frances implements Traductor {

        public  void traducir (){

            System.out.println("Traduciendo a Frances");

        }

        @Override
        public void iniciarTraductor() {

            System.out.println("Iniciando traductor en Frances....");

        }


    }


    class PruebaTraductor{
        public static void main(String[] args) {
            Traductor ingles = new ingles();
            ingles.iniciarTraductor();
            ingles.traducir();

            System.out.println();

            Traductor frances = new frances();
            frances.iniciarTraductor();
            frances.traducir();



        }
    }





}
