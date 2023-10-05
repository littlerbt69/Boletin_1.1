import java.util.Scanner;

public class Ej10_sin_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero positivo para saber su factorial: ");
        int num = Integer.parseInt(teclado.nextLine());

        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }

    public static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }

        return a * factorial(a - 1);
    }
}
