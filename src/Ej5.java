import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;
        int contadorPositivos = 0;
        int sumaPositivos = 0;
        int numeroMinimo = Integer.MAX_VALUE;
        int numeroMaximo = Integer.MIN_VALUE;

        do {
            System.out.println("Introduce números (negativos para terminar)");
            numeros = teclado.nextInt();

            if (numeros > 0) {
                sumaPositivos += numeros;
                contadorPositivos++;
                if (numeros < numeroMinimo) {
                    numeroMinimo = numeros;
                }
                if (numeros > numeroMaximo) {
                    numeroMaximo = numeros;
                }
            }
        } while (numeros > 0);

        if (contadorPositivos > 0) {
            double media = (double) sumaPositivos / contadorPositivos;
            
            System.out.println("Se han introducido " + contadorPositivos + " números positivos (incluyendo 0).");
            System.out.println("La media de los números positivos es: " + media);
            System.out.println("El número mínimo es: " + numeroMinimo);
            System.out.println("El número máximo es: " + numeroMaximo);

            // Ahora, solicitemos los números mayores que la media
            System.out.println("Números superiores a la media:");
            numeros = teclado.nextInt();

            do {
                System.out.println("Introduce un número (negativo para terminar)");
                numeros = teclado.nextInt();

                if (numeros > media) {
                    System.out.println(numeros + " es mayor que la media.");
                }
            } while (numeros > 0);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
    }
}
