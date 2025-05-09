package manejoDeMapas;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "flores");
        persona.put("edad","28");
        persona.put("edad", "31"); // no se permiten duplicados
        System.out.println("Valores de mapa");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", " 35");// modificar el valor de la llave existente
        persona.remove("apellido");
        persona.entrySet().forEach(System.out::println);


        // iterar sobre los elementos del mapa por separado

        System.out.println("\nIterando los elementos por separado");
        persona.forEach((llave, valor) ->{
            System.out.println("Llave " + llave + ", Valor" + valor);
        });


    }
}
