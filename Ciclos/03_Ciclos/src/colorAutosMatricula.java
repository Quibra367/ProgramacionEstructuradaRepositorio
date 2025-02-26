import java.util.Scanner;

public class colorAutosMatricula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de autos
        System.out.print("Ingrese el número de autos que entran a la CDMX: ");
        int numAutos = scanner.nextInt();

        // Contadores para cada color de calcomanía
        int amarillo = 0, rosa = 0, roja = 0, verde = 0, azul = 0;

        int contador = 1; // Contador para los autos

        // Ciclo while para procesar cada auto
        while (contador <= numAutos) {
            System.out.print("Ingrese el último dígito de la placa del auto " + contador + ": ");
            int ultimoDigito = scanner.nextInt();

            // Determinar el color de la calcomanía según el último dígito
            if (ultimoDigito == 1 || ultimoDigito == 2) {
                amarillo++;
            } else if (ultimoDigito == 3 || ultimoDigito == 4) {
                rosa++;
            } else if (ultimoDigito == 5 || ultimoDigito == 6) {
                roja++;
            } else if (ultimoDigito == 7 || ultimoDigito == 8) {
                verde++;
            } else if (ultimoDigito == 9 || ultimoDigito == 0) {
                azul++;
            } else {
                System.out.println("Dígito inválido. Ingrese un número entre 0 y 9.");
                continue; // Saltar el incremento del contador para que el usuario ingrese un dato válido
            }

            contador++; // Pasar al siguiente auto
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Autos con calcomanía amarilla: " + amarillo);
        System.out.println("Autos con calcomanía rosa: " + rosa);
        System.out.println("Autos con calcomanía roja: " + roja);
        System.out.println("Autos con calcomanía verde: " + verde);
        System.out.println("Autos con calcomanía azul: " + azul);

        scanner.close(); // Cerrar el scanner
    }
}
