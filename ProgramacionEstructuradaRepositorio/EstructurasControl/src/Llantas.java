import java.util.Scanner;

public class Llantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de llantas
        System.out.print("Ingrese la cantidad de llantas a comprar: ");
        int cantidad = scanner.nextInt();

        // Determinar el precio por llanta
        int precio;
        if (cantidad < 5) {
            precio = 300;
        } else if (cantidad <= 10) {
            precio = 250;
        } else {
            precio = 200;
        }

        // Calcular el costo total
        int total = cantidad * precio;

        // Mostrar resultados
        System.out.println("Precio por llanta: $" + precio);
        System.out.println("Total a pagar: $" + total);

        scanner.close();
    }
}


