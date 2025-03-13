package ArreglosJava;

public class RecorridoDeMatriz {
    public static void main(String[] args) {
        System.out.println("*** Recorrido de una Matriz ***");


        int [][] matriz = new int [][]{
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };
        // Modificar valores de la matriz

        // Recorrido una matriz

        //1. Ciclo mas externos para recorrer los renglones
        for(int ren = 0; ren < matriz.length; ren++){
            // 2. cliclo mas internoRecorrer las columnas
            for (int col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }

        }

    }
}
