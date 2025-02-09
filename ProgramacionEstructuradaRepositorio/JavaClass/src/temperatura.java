import javax.swing.*;

public class temperatura {
    public static void main(String[] args) {

        double c= Double.parseDouble(JOptionPane.showInputDialog("Introduce los grados celcius para su convercion: "));

        double F= (c* 1.8 )+32;

        JOptionPane.showMessageDialog(null, c +" grados celcius = " + F +" grados farengeit");
    }
}
