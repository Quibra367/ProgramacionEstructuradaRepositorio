import javax.swing.*;

public class CalificacioneSentinel {
    public static void main(String[] args) {

        final int SENTINEL =-1;
        double calif = 0.0;
        int numReprobados= 0;
        int numAprobados= 0;

        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero de calificaciones " +
                "aprobatorias y reprobatorias" +
                "\n Para terminar el programa introduce una calificaion con -1");

        int x=1;
        while (calif != SENTINEL){

            calif =Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + x));
            if (calif!=SENTINEL){
            if (calif>=7.0){
                numAprobados++;

             }else{
                numReprobados++;
            }
            x++;
             }
        }
        JOptionPane.showMessageDialog(null, "El numero de aprovados es: " +numAprobados+ "\n El numero de reprovados es: " + numReprobados);
    }
}

