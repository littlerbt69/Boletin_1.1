import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int producto = 0;

        System.out.println("Introduce primer numero");
        int num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce segundo numero");
        int num2 = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < num2; i++) {
            producto += num1;
        }

        // Ajustar el signo del resultado según los números originales
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            producto = -producto;
        }

        // Mostrar el resultado
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
    }
}