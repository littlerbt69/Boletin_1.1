import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = teclado.nextInt();
        } while (numero < 0);

        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + numero + " números es: " + suma);
    }
}
