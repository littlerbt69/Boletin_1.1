public class TestLectura {
    public static void main(String[] args) {
        int i = MiEntradaSalida.leerEnteroDeRango("Introduce un numero del 1 al 10: ", 1, 10);

        int x = MiEntradaSalida.leerEnteroPositivo("Introduce un numero positivo: ");

        System.out.printf("\nEl valor introducido es %d", i);

        System.out.printf("\nEl numero introducido es %d", x);
    }
}
