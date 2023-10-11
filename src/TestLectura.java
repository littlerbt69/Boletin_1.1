public class TestLectura {
    public static void main(String[] args) {
        int i = MiEntradaSalida.leerEnteroDeRango("Introduce un numero del 1 al 10: ", 1, 10);

        System.out.printf("El valor introducido es %d", i);
    }
}
