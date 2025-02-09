import javax.swing.*;

public class AreaDeUnTriangulo {
    public static void main(String[] args) {

        double b = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de la base del triangulo: "));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la altura del triangulo"));
        double operacion = (b+h)/2 ;
        String area ;

        area = "El resultado es: " + operacion;

        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + operacion);

    }
}
