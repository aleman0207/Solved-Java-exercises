package maquinaSnacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MaquinaSnacks extends  Snacks {
  public static void main(String[] args) {

   maquinaSnacks();

  }

  private static void maquinaSnacks() {
   var salir = false;
   Scanner consola = new Scanner(System.in);

   // creamo la lista de prodcutos de tipos snack

   List<Snack> productos = new ArrayList<>();
   System.out.println("*** Maquina de Snacks ***");
   Snacks.mostrarSnacks();// Mostrar el inventario de Snacks disponible
   while (!salir){
     try{
        var opcion = mostrarMenu(consola);

        salir = ejecutarOpciones(opcion,consola,productos);

      } catch (Exception e){
           System.out.println("Ocurrio un erro: " + e.getMessage());
      }
      finally {
        System.out.println();// imprime un salto de linea con cada iteracion
      }
   }

  }

      private  static int mostrarMenu (Scanner consola){
     System.out.print("""
               Menu: 
               1. Comprar snack
               2. Mostrar snack
               3. Agregar nuevo snack
               4. Salir
               Elige una opcion: \s """);
     // leemos y retornamos la opcion por el usuario
     return Integer.parseInt(consola.nextLine());

 }

      private  static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){

         var salir = false;
         switch (opcion){
              case 1 -> comprarSnack(consola,productos);
             // case 2 ->
         }
         return salir;
      }

        private static void comprarSnack(Scanner consola, List <Snack> productos){
          System.out.print("Que snack quieres comprar (id)?: ");
            var idSnack = Integer.parseInt(consola.nextLine());
             var snackEncontrado = false;
               for (var snack: getSnacks()){
               if(idSnack == snack.getIdSncack()){
                productos.add(snack);
                System.out.println("Ok: Snack agregado: " + snack);
                snackEncontrado = true;
                break;
          }
       }
           if (!snackEncontrado){
              System.out.println("Id de snack no encontrado: " + idSnack);
           }


      }

 }
