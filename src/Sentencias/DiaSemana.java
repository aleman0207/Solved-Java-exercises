package Sentencias;

import java.util.Scanner;

public class DiaSemana  {

    public static void main(String[] args) {

        System.out.println("*** Ingresa un dia se la Semana en valor numerico ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un dia: ");

        int dia = sc.nextInt();

        switch (dia){

            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido: " + dia);
                break;
        }
    }
}
