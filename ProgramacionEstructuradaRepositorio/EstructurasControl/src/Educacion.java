import java.util.Scanner;

public class Educacion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.print("Ingresa el promedio del alumno: ");
        double promedio = scanner.nextDouble();

        System.out.print("Ingresa el número de materias reprobadas (si las tiene): ");
        int reprobadas = scanner.nextInt();

        System.out.print("Ingresa el tipo de alumno (1 para preparatoria, 2 para profesional): ");
        int tipoAlumno = scanner.nextInt();

        // Inicializar las variables de unidades y descuento
        int unidades = 0;
        double descuento = 0;
        double precioUnitario = 0;

        // Lógica de decisiones basadas en las condiciones descritas
        if (tipoAlumno == 1) { // Alumno de preparatoria
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.25; // 25% de descuento
            } else if (promedio >= 9) {
                unidades = 50;
                descuento = 0.10; // 10% de descuento
            } else if (promedio > 7) {
                unidades = 50;
                descuento = 0; // Sin descuento
            } else if (promedio <= 7 && reprobadas <= 3) {
                unidades = 45;
                descuento = 0; // Sin descuento
            } else if (promedio <= 7 && reprobadas >= 4) {
                unidades = 40;
                descuento = 0; // Sin descuento
            }
            precioUnitario = 180; // Precio por 5 unidades para preparatoria
        } else if (tipoAlumno == 2) { // Alumno de profesional
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.20; // 20% de descuento
            } else {
                unidades = 55;
                descuento = 0; // Sin descuento
            }
            precioUnitario = 300; // Precio por 5 unidades para profesional
        }

        // Calcular el costo sin descuento
        double costoTotal = (unidades / 5) * precioUnitario;

        // Aplicar el descuento
        double descuentoTotal = costoTotal * descuento;
        double totalPagar = costoTotal - descuentoTotal;

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Unidades que podrá cursar: " + unidades);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
