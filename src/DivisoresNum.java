import java.util.Scanner;

public class DivisoresNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;

        System.out.println("Introduce primer numero positivo");
        num1 = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.println("El divisor de " + num1 + " es: " + i);
            }
        }
    }
}
