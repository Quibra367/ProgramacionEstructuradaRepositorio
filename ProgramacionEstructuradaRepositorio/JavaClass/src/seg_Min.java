import javax.swing.*;
import java.time.chrono.JapaneseChronology;
import java.util.jar.JarOutputStream;

public class seg_Min {
    public static void main(String[] args) {

        double seg= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de segundos: "));

        double conv= seg / 60;

        JOptionPane.showMessageDialog(null, seg + " segundos se convierte a: " + conv + " min");
    }
}
