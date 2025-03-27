package Principal_java;

public class ReservaHoteles {

    public static void main(String[] args) {

        System.out.println("*** Reserva de Hoteles ***");

        String nombreCliente = "Luis Aleman";
        int diasEstancia = 8;
        double tarifaDiria = 50.25;
        boolean vistaMar = false;

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dais de estancia: " + diasEstancia);
        System.out.println("Tarifa: " + tarifaDiria );
        System.out.println("Vista al Mar: " + vistaMar);

        // Cambiar valores


        diasEstancia = 7;
        tarifaDiria = 80.50;
        vistaMar = true;

        System.out.println();
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dais de estancia: " + diasEstancia);
        System.out.println("Tarifa: " + tarifaDiria );
        System.out.println("Vista al Mar: " + vistaMar);


    }

}
