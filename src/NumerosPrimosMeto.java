import java.util.Scanner;

public class NumerosPrimosMeto {
    // Función para verificar si un número es primo
    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para calcular el máximo común divisor (MCD) usando el algoritmo de Euclides
    static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero positivo: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero positivo: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {
            if (esPrimo(num1) && esPrimo(num2)) {
                int mcd = calcularMCD(num1, num2);
                if (mcd == 1) {
                    System.out.println("Los números " + num1 + " y " + num2 + " son primos entre sí.");
                } else {
                    System.out.println("Los números " + num1 + " y " + num2 + " no son primos entre sí.");
                }
            } else {
                System.out.println("Ambos números deben ser primos para ser primos entre sí.");
            }
        } else {
            System.out.println("Por favor, ingrese números enteros positivos.");
        }
        sc.close();
    }
}
