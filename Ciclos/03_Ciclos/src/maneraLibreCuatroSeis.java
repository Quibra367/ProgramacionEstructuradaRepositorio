import javax.swing.*;
public class maneraLibreCuatroSeis {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog("Elige el ejercicio: \n1. Ejercicio 4\n2. Ejercicio 5\n3. Ejercicio 6");

        if (opcion.equals("4")) {
            ejercicio4();
        } else if (opcion.equals("5")) {
            ejercicio5();
        } else if (opcion.equals("6")) {
            ejercicio6();
        } else {
            JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }

    // Ejercicio 4: Calcular porcentaje de aprobados y reprobados
    public static void ejercicio4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos alumnos?"));
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 1; i <= n; i++) {
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Calificación del alumno " + i + ":"));
            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        JOptionPane.showMessageDialog(null, "Aprobados: " + (aprobados * 100 / n) + "%\nReprobados: " + (reprobados * 100 / n) + "%");
    }

    // Ejercicio 5: Sucesión 20, 25, 30, 35, ..., hasta N
    public static void ejercicio5() {
        int N = Integer.parseInt(JOptionPane.showInputDialog("¿Hasta qué número llega la sucesión?"));
        int suma = 0;
        StringBuilder resultado = new StringBuilder("Sucesión: ");

        for (int i = 20; i <= N; i += 5) {
            resultado.append(i).append(" ");
            suma += i;
        }

        JOptionPane.showMessageDialog(null, resultado + "\nSuma: " + suma);
    }

    // Ejercicio 6: Sucesión de cuadrados 1, 4, 9, 16, ..., hasta N
    public static void ejercicio6() {
        int N = Integer.parseInt(JOptionPane.showInputDialog("¿Hasta qué número llega la sucesión de cuadrados?"));
        int suma = 0;
        StringBuilder resultado = new StringBuilder("Sucesión: ");

        for (int i = 1; i <= N; i++) {
            int cuadrado = i * i;
            resultado.append(cuadrado).append(" ");
            suma += cuadrado;
        }

        JOptionPane.showMessageDialog(null, resultado + "\nSuma: " + suma);
    }
}