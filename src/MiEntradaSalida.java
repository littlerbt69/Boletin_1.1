import java.util.Scanner;

public class MiEntradaSalida {
    public static Scanner teclado = new Scanner(System.in);

    /**
     * El siguiente metodo lee numeros enteros comprendidos en un rango minimo y maximo (EXCLUIDOS)
     * @param min Representa el numero minimo introducido
     * @param max Representa el numero maximo introdducido
     * @return Numero leido
     */
    public static int leerEnteroDeRango(String mensaje, int min, int max) {
        if (min >= max) {
            //TODO: Hacer cuando conozcamos las excepciones
        }
        System.out.printf(mensaje + ": ");

        int numeroLeido;

        do {
            numeroLeido = Integer.parseInt(teclado.nextLine());

            if (numeroLeido < min || numeroLeido > max) {
                System.out.printf("Por favor, introduce un valor entre %d y %d", min, max);
            }
        } while (numeroLeido < min || numeroLeido > max);

        return numeroLeido;
    }

    public static int leerEntero (String mensaje){
        System.out.printf(mensaje + ": ");

        //TODO: controlar excepcion

        return Integer.parseInt(teclado.nextLine());
    }

    public static int leerEnteroPositivo (String mensaje) {
        System.out.printf(mensaje + ": ");

        int numLeido;

        do {
            numLeido = Integer.parseInt(teclado.nextLine());

            if (numLeido < 0) {
                System.out.println("Por favor, Introduce un numero positivo");
            }
        } while (numLeido < 0);

        return numLeido;

    }
}
