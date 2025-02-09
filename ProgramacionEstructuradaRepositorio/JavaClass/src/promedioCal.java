import javax.swing.*;

public class promedioCal {
    public static void main(String[] args) {

        double cal1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la primera calificacion " ));
        double cal2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la primera calificacion " ));
        double cal3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la primera calificacion " ));
        double cal4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la primera calificacion " ));

        double promedio = (cal1 +cal2+cal3+cal4) /4 *(10);

        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
}
