import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce un numero positivo:");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce otro numero positivo:");
        num2 = Integer.parseInt(teclado.nextLine());

        boolean sonPrimos = false;

        for (int i = 2; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                sonPrimos = true;
                break;
            }
        }

        if (sonPrimos) {
            System.out.println("Los numeros son primos entre si");
        } else {
            System.out.println("Los numeros no son primos entre si");
        }
    }
}
