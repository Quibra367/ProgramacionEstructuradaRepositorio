import javax.swing.*;

public class Cuadrados_deNum_Enteros {
    public static void main(String[] args) {

        double numE= 0.0;

        numE=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero entero"));

        double r= numE*numE;

        String res= "El cuadrado de tu numero entero es: " + r;

        JOptionPane.showMessageDialog(null, res);
    }
}
