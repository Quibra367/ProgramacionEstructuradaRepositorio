import javax.swing.*;
import java.awt.*;

public class CalificacionesContador {

    public static void main(String[] args) {

        int numreprobados = 0;
        int numaprobados= 0;
        double calif = 0;
        int numerodeCalificacion = 0;

        numerodeCalificacion= Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaiones se van a evaluar?"));
//El i++ es un contador, algo asi como:
        //con forme se regresa el codigo va generando una lista
        for (int i = 1; i <= numerodeCalificacion ; i++){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: "));

            if (calif>= 7.0) {

                //Contador de numero de aprovados

                numaprobados++;
            }else {
                numreprobados++;
            }

            }//cierra ciclo for

        JOptionPane.showMessageDialog(null, "El numero de aprovados es: " +numaprobados+ "\n El numero de reprovados es: " + numreprobados);


        int i=1;
        numreprobados = 0;
        numaprobados= 0;



        while (i<=numerodeCalificacion) {

                   calif = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion" + i));
           i++;
                    if(calif>=7.0) {
                        numaprobados++;
                    }else {
                    numreprobados++;
                    }
            i++;
            {
                while (1 >= numerodeCalificacion) ;

            }}}}


