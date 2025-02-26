import java.util.Scanner;

public class clinica {
    public static void main(String[] args) {

        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad, sexo y nivel de hemoglobina
        System.out.print("Ingresa la edad de la persona (en años): ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa el sexo de la persona (1 para mujer, 2 para hombre): ");
        int sexo = scanner.nextInt();

        System.out.print("Ingresa el nivel de hemoglobina (en g%): ");
        double hemoglobina = scanner.nextDouble();

        // Determinar si la persona tiene anemia según la edad, sexo y nivel de hemoglobina
        boolean tieneAnemia = false;

        // Definir los rangos de hemoglobina según la edad y el sexo
        if (edad >= 0 && edad <= 1) { // 0-1 mes
            if (hemoglobina < 13 || hemoglobina > 26) {
                tieneAnemia = true;
            }
        } else if (edad > 1 && edad <= 6) { // > 1 y <= 6 meses
            if (hemoglobina < 10 || hemoglobina > 18) {
                tieneAnemia = true;
            }
        } else if (edad > 6 && edad <= 12) { // > 6 y <= 12 meses
            if (hemoglobina < 11 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edad > 1 && edad <= 5) { // > 1 y <= 5 años
            if (hemoglobina < 11.5 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edad > 5 && edad <= 10) { // > 5 y <= 10 años
            if (hemoglobina < 12.6 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else if (edad > 10 && edad <= 15) { // > 10 y <= 15 años
            if (hemoglobina < 13 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else if (edad > 15 && sexo == 1) { // Mujeres > 15 años
            if (hemoglobina < 12 || hemoglobina > 16) {
                tieneAnemia = true;
            }
        } else if (edad > 15 && sexo == 2) { // Hombres > 15 años
            if (hemoglobina < 14 || hemoglobina > 18) {
                tieneAnemia = true;
            }
        }

        // Mostrar el resultado
        if (tieneAnemia) {
            System.out.println("Resultado: Positivo (Tiene anemia)");
        } else {
            System.out.println("Resultado: Negativo (No tiene anemia)");
        }
    }
}