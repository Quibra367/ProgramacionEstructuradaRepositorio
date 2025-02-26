import javax.swing.*;
import java.awt.*;

public class Calificaciones_Acumulativas_1 {
    public static void main(String[] args) {
        double calif= 0.0;
        double acumCalif = 0.0;
        int numcal= 0;

        numcal=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones"));

        for (int i = 0; i < numcal; i++) {
            acumCalif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificaion: " + (i+1)));



        }
            acumCalif= acumCalif+calif;

        JOptionPane.showMessageDialog(null,"El promedio es: " + acumCalif);
        }
        }
