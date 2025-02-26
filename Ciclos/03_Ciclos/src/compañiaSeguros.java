import java.util.Scanner;

public class compañiaSeguros {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Variables de entrada
        double sueldoBase;
        double totalVentas;
        double comision;
        double totalPagar;
        int numVendedores;

        // Leer el número de vendedores
        System.out.print("Ingrese el número de vendedores: ");
        numVendedores = scanner.nextInt();

        int vendedorActual = 1;

        // Bucle while para calcular las comisiones y el total a pagar para cada vendedor
        while (vendedorActual <= numVendedores) {
            // Solicitar el sueldo base del vendedor
            System.out.print("Ingrese el sueldo base del vendedor " + vendedorActual + ": ");
            sueldoBase = scanner.nextDouble();

            // Variable para sumar el total de las ventas del vendedor
            totalVentas = 0;

            // Bucle para ingresar las tres ventas realizadas por el vendedor
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese el monto de la venta " + i + " del vendedor " + vendedorActual + ": ");
                totalVentas += scanner.nextDouble();  // Acumulamos el total de ventas
            }

            // Calcular la comisión (10% de las ventas)
            comision = totalVentas * 0.10;

            // Calcular el total a pagar (sueldo base + comisiones)
            totalPagar = sueldoBase + comision;

            // Imprimir los resultados
            System.out.println("Comisión del vendedor " + vendedorActual + ": $" + comision);
            System.out.println("Total a pagar al vendedor " + vendedorActual + " (Sueldo + Comisiones): $" + totalPagar);
            System.out.println();

            // Incrementar el vendedor actual
            vendedorActual++;
        }

        // Cerrar el scanner
        scanner.close();
    }
}