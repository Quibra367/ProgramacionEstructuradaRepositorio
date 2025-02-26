import java.util.Scanner;
public class calMediaBaja {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de alumnos
        System.out.print("Ingresa la cantidad de alumnos: ");
        int n = scanner.nextInt();

        // Inicializar variables para la calificación total y la calificación más baja
        double sumaCalificaciones = 0;
        double calificacionBaja = Double.MAX_VALUE;  // Iniciar con el valor máximo posible

        // Solicitar las calificaciones y calcular la media y la más baja
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa la calificación del alumno " + i + ": ");
            double calificacion = scanner.nextDouble();

            // Sumar la calificación a la total
            sumaCalificaciones += calificacion;

            // Verificar si la calificación es la más baja
            if (calificacion < calificacionBaja) {
                calificacionBaja = calificacion;
            }
        }

        // Calcular la calificación media
        double calificacionMedia = sumaCalificaciones / n;

        // Mostrar los resultados
        System.out.println("\nCalificación media del grupo: " + calificacionMedia);
        System.out.println("Calificación más baja del grupo: " + calificacionBaja);
    }

    }


