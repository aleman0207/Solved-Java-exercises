package Ciclos;

import java.util.Scanner;

public class AplicacionCalculadora {

    public static void main(String[] args) {
        System.out.println("*** Caluladora en Java ***");

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        double resultado=0.0;

        boolean salir = false;

        while (!salir){

            System.out.print("""  
                    
                    Operaciones que puedes ralizar:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5.Salir
                    Escoje una opcion:\s""");

            int menu = sc.nextInt();

           /* if(menu >=1 && menu <+4){
                System.out.print("Dame el valor 1: ");
                num1= sc.nextInt();
                System.out.print("Dame el valor 2: ");
                num2= sc.nextInt();
            }*/

            switch (menu){
                case 1: {
                    System.out.print("Dame el valor 1: ");
                    num1 = sc.nextInt();
                    System.out.print("Dame el valor 2: ");
                    num2 = sc.nextInt();
                    resultado = num1 + num2;
                    System.out.println("Resultado de la suma es: " + resultado);
                }
                break;
                case 2: {
                    System.out.print("Dame el valor 1: ");
                    num1 = sc.nextInt();
                    System.out.print("Dame el valor 2: ");
                    num2 = sc.nextInt();
                    resultado = num1 - num2;
                    System.out.println("Resultado de la Resta es: " + resultado);
                }
                break;
                case 3: {
                    System.out.print("Dame el valor 1: ");
                    num1 = sc.nextInt();
                    System.out.print("Dame el valor 2: ");
                    num2 = sc.nextInt();
                    resultado = num1 * num2;
                    System.out.println("Resultado de la Multiplicacion es: " + resultado);
                }
                break;
                case 4: {
                    System.out.print("Dame el valor 1: ");
                    num1 = sc.nextInt();
                    System.out.print("Dame el valor 2: ");
                    num2 = sc.nextInt();
                    if (num2 < 1){
                        System.out.println("Error Division por cero.");
                    }else {
                        resultado = num1 % num2;
                        System.out.println("Resultado de la division es: " + resultado);
                    }
                }
                break;
                case 5:
                    System.out.println("Hata Pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Lo siento pero eso no es un numero ");

            }






        }

    }

}
