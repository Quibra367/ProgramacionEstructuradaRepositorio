import javax.swing.*;

public class Ecuacion1 {
    public static void main(String[] args) {

        //Declaracion de variables

        int n= 0;
        int denSup= 0;
        int deno= 0;
        double x = 0.0;
        double s = 0.0;

        do if (x<=0.0) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de Fracciones"));

            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x:"));

            if (n<=0 && x<=0.0){
                JOptionPane.showMessageDialog(null,"Los dos valores no deben ser negativos");
            }else if(n<0) {
                JOptionPane.showMessageDialog(null, "El valor de n no puede ser negativo ");

            }else{
                JOptionPane.showMessageDialog(null,"El valor de n no puede ser negativo+");
            }
        }while(n<=0 || x<0.0);{
        }
        //Inicializar las variables

        denSup= 3;
        deno = 1;

        for (int i = 0; i <n; i++) {
            s = Math.pow(x,3.0/denSup)/deno;
            denSup+=3;
            deno+=2;


        }
    JOptionPane.showMessageDialog(null, "El valor de 'S' es: " + String.format("%.3f",s));

    }
}
