import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        int contadorPositivos = 0;

        do {
            System.out.println("Introduce numeros (negativos para terminar)");
            numeros = teclado.nextInt();

            if (numeros > 0) {
                contadorPositivos++;
            }
        } while (numeros > 0);

        System.out.println("Se han introducido " + contadorPositivos + " números positivos (incluyendo 0).");
    }
}
