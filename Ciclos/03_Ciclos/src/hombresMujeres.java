import java.util.Scanner;

public class hombresMujeres {
    public static void main(String[] args) {
            // Crear objeto Scanner para leer datos del usuario
            Scanner scanner = new Scanner(System.in);

            // Variables para contar hombres y mujeres
            int hombres = 0, mujeres = 0;
            int totalPersonas;

            // Pedir la cantidad de personas
            System.out.print("Ingrese el número total de personas: ");
            totalPersonas = scanner.nextInt();

            int contador = 1;  // Contador para el ciclo while

            // Ciclo while para procesar cada persona
            while (contador <= totalPersonas) {
                System.out.print("Ingrese el sexo de la persona " + contador + " (H para hombre, M para mujer): ");
                char sexo = scanner.next().toUpperCase().charAt(0);  // Convertimos a mayúscula para evitar errores

                // Contar según el sexo ingresado
                if (sexo == 'H') {
                    hombres++;
                } else if (sexo == 'M') {
                    mujeres++;
                } else {
                    System.out.println("Entrada inválida. Debe ingresar H o M.");
                    continue; // Evita contar esta iteración y vuelve a pedir la entrada
                }

                contador++; // Incrementar el contador
            }

            // Mostrar los resultados
            System.out.println("\nCantidad de hombres: " + hombres);
            System.out.println("Cantidad de mujeres: " + mujeres);

            // Cerrar el scanner
            scanner.close();
        }
    }
