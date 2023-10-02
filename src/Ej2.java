import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10");
        int numero = teclado.nextInt();

        switch (numero) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Tabla de multiplicar del " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
                break;
            default:
                System.out.println("Número fuera del rango permitido.");
                break;
        }
    }
}