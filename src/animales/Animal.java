package animales;

public class Animal {

    protected void hacerSonido(){
        System.out.println("El animal hace un sinido");
    }

}


class Perro extends  Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace wauf");
    }
}

    class Gato extends Animal {

        @Override
        protected void hacerSonido() {
            System.out.println("El gato hace miau");

        }
    }

    class PruebaAnimal {

        // metodo polimorfico
       static void imprimirSonido ( Animal animal){
            animal.hacerSonido();
        }

        public static void main(String[] args) {
            //objeto de la calse padre
            Animal animal = new Animal();
            imprimirSonido(animal);

            //Metodo de la clase perro
            Animal animal1 = new Perro();
            imprimirSonido(animal1);

            //Metodo de la clase gato
            Animal animal2= new Gato();
            imprimirSonido(animal2);




        }
    }
