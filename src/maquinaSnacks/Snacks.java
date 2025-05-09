package maquinaSnacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    private static final List <Snack> snacks;


    // Bloque de tipo estatico Inicializador

    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 120));
        snacks.add(new Snack("Hielo", 2));
    }

    public static void agregarSnacks(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){

        var inventariosSnacks = " ";

        for(var snack: snacks){
            inventariosSnacks += snack.toString() + "\n";

        }

        System.out.println("*** Snacks en el Inventario ***");
        System.out.println();
        System.out.println(inventariosSnacks);

    }

    public static List<Snack> getSnacks (){

        return snacks;
    }



}
