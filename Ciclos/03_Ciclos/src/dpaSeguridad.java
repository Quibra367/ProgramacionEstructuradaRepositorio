import javax.swing.*;

public class dpaSeguridad {
    public static void main(String[] args) {

        int n =0;
        double autos= 0.0;
        String x="";
        String salir=x;
        int contador=0;

        do {
            contador++;
            n = Integer.parseInt(JOptionPane.showInputDialog("Del 0-9, escribe un numero para determinar el color de la placa o escribe x para salir: "));
            x= String.format(salir) ;
            if (n == 0 || n == 9) {
                JOptionPane.showMessageDialog(null, "La calcomania es de color Azul");
            }else if(n==1 || n==2){
                JOptionPane.showMessageDialog(null,"La calcomania es de color Amarilla");
            }else if(n==3 || n==4){
                JOptionPane.showMessageDialog(null,"La calcomania es de color Rosa");
            }else if(n==5 || n==6){
                JOptionPane.showMessageDialog(null,"La calcomania es de color Roja");
            }else if(n==7|| n==8){
                JOptionPane.showMessageDialog(null,"La calcomania es de color verde");
            }else if(n<=0.0) {
                JOptionPane.showMessageDialog(null, "El numero no es valido intente otra vez");
            }
        }while(x==salir);

        contador=Integer.parseInt(JOptionPane.showInputDialog("El comando se uso: " + contador));
        }
    }

