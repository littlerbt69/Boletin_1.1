import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;
        double menor = Double.MAX_VALUE;

        do {
            System.out.println("Introduce un numero: ");
            numero = teclado.nextDouble();

            if (numero < menor) {
                menor = numero;
            }

            System.out.println("¿Quieres introducir mas numeros? (S/N): ");
            String respuesta = teclado.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);

        System.out.println("El número menor de los introducidos es: " + menor);
    }
}
