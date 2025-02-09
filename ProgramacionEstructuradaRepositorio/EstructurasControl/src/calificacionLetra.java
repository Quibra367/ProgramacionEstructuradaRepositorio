import javax.swing.*;

public class calificacionLetra {
    public static void main(String[] args) {

        String salida = "";
        double calif = 0.0;
        char letra = ' ';

        //Entradas

        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"));

        //Proceso
        if (calif >= 0.0 && calif <= 10.0) {

            if (calif >= 9.0) ;
            letra = 'A';
        } else if (calif >= 8.0) {
            letra = 'B';
        } else if (calif >= 7.0) {
            letra = 'C';
        } else if (calif >= 6.0) {
            letra = 'D';
        } else {
            letra = 'F';
        }
        salida = "Tu calificacion" + calif + "corresponde a una letra: " + letra;
    }//else{

    {
        //salida = "Calificaion no valida";

    }
   //JOptionPane.showMessageDialog(null, salida);
        }
         //}


