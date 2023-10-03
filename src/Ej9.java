import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero positivo: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Eso no es un número entero positivo válido.");
                System.out.print("Introduce un número entero positivo: ");
                teclado.next();
            }
            numero = teclado.nextInt();
        } while (numero <= 0);

        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }

    public static boolean esNumeroPerfecto(int num) {
        int sumaDivisores = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == num;
    }
}
