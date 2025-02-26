import javax.swing.*;
import java.awt.*;

public class ContinueAndBreak {
    public static void main(String[] args) {
        //Declaracion de variables
        int suma= 0;
        int numero =0;
        int n= 0;

        n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de numeros a ingrear"));

        for (int i=1; i<=n; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero" + i));

            if (numero == 0){
                continue;
            }
            if(numero<0){
                break;
            }
            suma=numero;
        }
        JOptionPane.showMessageDialog(null,"La suma de los numeros es: "  + suma);
    }
}
