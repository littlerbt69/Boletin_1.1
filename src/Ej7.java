import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadNumeros;

        do {
            System.out.print("Ingrese la cantidad de números");
            cantidadNumeros = teclado.nextInt();
        } while (cantidadNumeros <= 0);

        double suma = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese los numeros" + i + ": ");
            double numero = teclado.nextDouble();
            suma += numero;
        }

        double media = suma / cantidadNumeros;
        System.out.println("La media de los " + cantidadNumeros + " números es: " + media);
    }
}
