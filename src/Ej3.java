import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadNumeros;

        do {
            System.out.print("Ingrese la cantidad de números a comprobar");
            cantidadNumeros = teclado.nextInt();
        } while (cantidadNumeros <= 0);

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese los numeros" + i + ": ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        }
    }
}
