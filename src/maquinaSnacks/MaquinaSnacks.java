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
              case 2 -> mostrartiket(productos);
              case 3 -> agregarSnack(consola);
              case 4 -> {
                  System.out.println("Regresa pronto");
                  salir = true;
              }
             default -> System.out.println("Opcion invalida" + opcion);
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


        private static void mostrartiket(List<Snack> productos){
            var tikect = "*** Tikect de venta ***";
            var total = 0.0;
            for (var prodcuto: productos){
                tikect += "\n\t- " + prodcuto.getNombre() + " - $" + prodcuto.getPrecio();
                total += prodcuto.getPrecio();
            }
            tikect += "\n\tTotal -> $" + total;
            System.out.println(tikect);
        }


        private  static void agregarSnack (Scanner consola){
            System.out.print("Nombre del Snack nuvo que se quiere agregar: ");
            var nombre = consola.nextLine();
            System.out.print("Precio del snack: ");
            var precio = Double.parseDouble(consola.nextLine());
            Snacks.agregarSnacks(new Snack(nombre, precio));
            System.out.println("Tu snack se agregado correctamente");
            Snacks.mostrarSnacks();
        }




 }
