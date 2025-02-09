/*
*Escribir un programa que convierta tres numeros de kilogramo a libras (1 libra es = a 0.454)
 */


import javax.swing.*;
import java.lang.invoke.StringConcatFactory;

public class Conversion_Libras {
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

        double c1 = numero1 / Factor_convercion;
        double c2 = numero2 / Factor_convercion ;
        double c3 = numero3 / Factor_convercion ;
        String salida = "";

        //proceso de convercion

        salida = numero1 + "KG "+ "en libras es: " + String.format("%.3f", c1)+"\n"+
                numero2 + "kg " + " en libras es :" +String.format("%.3f", c2) + "\n"+
                numero3 + "kg "+ "en libras es: " + String.format("%.3f",c3);


        JOptionPane.showMessageDialog(null,salida);
    }
}
