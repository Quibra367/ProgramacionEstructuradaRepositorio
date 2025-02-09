import javax.swing.*;
public class Sueldo_Empleado {
    public static void main(String[]args) {
        String nombre = "";
        int hT = 0;
        double cuotaH= 0.0;
        double sueldo= 0.0;

                //Entrada de valores

        nombre = JOptionPane.showInputDialog("Introduce el nombre del trabajador");
        cuotaH = Double.parseDouble(JOptionPane.showInputDialog("introduce la cuota por hora: "));
        hT = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));

        //Calculo de sueldo

        sueldo = cuotaH*hT;

        JOptionPane.showMessageDialog(null,"El empleado: "+ nombre + "\n" +                "con: " + hT + "\n" + "Horas trabajadas con una cuota de: " + cuotaH + "\n" + "Tiene un sueldo de: $" + String.format("%.2f", sueldo));
     }

}
