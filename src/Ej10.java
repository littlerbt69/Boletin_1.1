import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero no negativo (positivo o cero): ");
            while (!sc.hasNextInt()) {
                System.out.println("Eso no es un número entero válido.");
                System.out.print("Introduce un número entero no negativo (positivo o cero): ");
                sc.next();
            }
            numero = sc.nextInt();
        } while (numero < 0);

        sc.close();

        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
