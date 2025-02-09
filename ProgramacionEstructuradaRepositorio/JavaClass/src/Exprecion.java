/*
*Calcular la exprecion de n=x+y/y-1 para ,os valores de x y y cualquiera
 */


import javax.swing.*;

public class Exprecion {
    public static void main(String[ ] args){


        double x= 0.0;
        double y= 0.0;

        String resultado = "";
        x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y: "));
        double n= (x+y)/(y-1);

        resultado= "El reultado es: " + n;

        JOptionPane.showMessageDialog(null, resultado);

    }
}
