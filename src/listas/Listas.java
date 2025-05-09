package listas;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        List <String> miLista = new ArrayList <>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Feliz fin de semana");

//        for (String elemeneto: miLista){
//            System.out.println("Dia de la semana: " + elemeneto);
//        }

        // funciones Lambda (funcion anonima de un codigo muy compacto)

//        miLista.forEach( elemento -> {
//            System.out.println("Elemento: " + elemento);
//        } );

        miLista.forEach(System.out::println);



        List<String> nombres = Arrays.asList("Luis", "Carlos", "Jesus");
        System.out.println("\nLista de nombres ");
        nombres.forEach(System.out::println);








    }
}
