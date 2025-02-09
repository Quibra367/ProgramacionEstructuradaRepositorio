import javax.swing.*;

public class sueldoBase {
    public static void main(String[] args) {

        double sueldoB= Double.parseDouble(JOptionPane.showInputDialog("Introduce tu sueldo base: "));

        double exComicion= (sueldoB *.10) + sueldoB;

        JOptionPane.showMessageDialog(null, "El sueldo base del trabajador por consegir todas las ventas y por su comicion seria de: " + exComicion);
    }
}
