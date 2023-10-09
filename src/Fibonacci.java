import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nivel (x) hasta el cual desea calcular la sucesión de Fibonacci: ");
        int nivel = teclado.nextInt();

        if (nivel < 0) {
            System.out.println("Debes introducir un numero positivo: (ERROR)");
        } else {
            System.out.println("Sucesion de fibonacci hasta el nivel" + nivel + " :");
            for (int i = 0; i < nivel; i++) {
                System.out.println(calcularFibonacci(i) + " ");
            }
        }
    }

    public static int calcularFibonacci (int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1)
            return 1;
        else {
            return calcularFibonacci(num - 1) + calcularFibonacci(num - 2);
        }
    }
}
