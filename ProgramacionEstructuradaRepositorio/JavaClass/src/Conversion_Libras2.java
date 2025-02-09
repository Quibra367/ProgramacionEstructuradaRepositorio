import javax.swing.*;

public class Conversion_Libras2 {
    public static void main(String[] args){

        //declaracion de constante

        final double Factor_convercion= 0.454;

        //declaracion de variables de 3 nuemros doubles a convertir

        double numero1 =0.0;
        double numero2 =0.0;
        double numero3 =0.0;

        //solicitar los 3 nuemros al calcular

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el primer numero: "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el segundo numero: "));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("introduce el tercer numero: "));


        String salida = "";

        //proceso de convercion

        salida = numero1 + "KG "+ "en libras es: " + String.format("%.3f", numero1 / Factor_convercion)+"\n"+
                numero2 + "kg " + " en libras es :" +String.format("%.3f", numero2 / Factor_convercion) + "\n"+
                numero3 + "kg "+ "en libras es: " + String.format("%.3f", numero3 / Factor_convercion);


        JOptionPane.showMessageDialog(null,salida);
    }
}

