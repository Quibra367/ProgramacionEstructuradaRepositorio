
// Evlauat si un nuemro es mayou a 10, utilizando el operador ternario (?)
// (Expreicon)? parte true : para false

import javax.swing.*;
 public class NumeroMayor {
    public static void main(String[] args) {
        double numero= 0.0;
        String salida= "";

        //Entrada

        numero=Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero"));

        salida = !(numero < 10)? "El numero es mayor a 10":"El numero es menor a 10";

        JOptionPane.showMessageDialog(null, salida);


        }
    }
//tambien puede ser

//String respuesta=" ";
//respuesta =(numero >10)?"El numero es mayor a 10":
//System.out.println(respuesta;)