import javax.swing.JOptionPane;
public class Calificaciones {
    public static void main(String[] args) {

        double calif=0.0;
        double califAcum= 0.0;

        int numcalif= 0;

        numcalif=Integer.parseInt(JOptionPane.showInputDialog("Introduce el nmero de calificaciones: "));

        for(int i=0; i<numcalif; i++){
            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion "+ (i+1)));
            califAcum=califAcum+calif;

        }
        JOptionPane.showMessageDialog(null, "la sumatoria es de: "+ califAcum);
    }
}
