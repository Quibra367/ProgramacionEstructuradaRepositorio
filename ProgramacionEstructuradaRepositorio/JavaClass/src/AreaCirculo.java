import javax.swing.*;

public class AreaCirculo {
    public static void main(String[]args){
        double r = Double.parseDouble(JOptionPane.showInputDialog("Intruduce el valor del radio: "));
        double operacion = 3.14 * Math.pow(r, 2);
        String area ;

        area= "El resultado es: " + operacion;
        JOptionPane.showMessageDialog(null,"El Area del circulo es : " + operacion);
    }
}
