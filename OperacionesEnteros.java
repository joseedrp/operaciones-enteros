import java.util.Scanner;

public class OperacionesEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos numeros enteros.
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        // Realizar las operaciones y mostrar los resultados.
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (num2 != 0) {
            int division = num1 / num2; // Division entera.
            int modulo = num1 % num2; // Resto de la division.
            System.out.println("Division (cociente entero): " + division);
            System.out.println("Modulo (resto): " + modulo);
        } else {
            System.out.println("No se puede calcular la division ni el modulo entre cero.");
        }

        scanner.close();
    }
}
