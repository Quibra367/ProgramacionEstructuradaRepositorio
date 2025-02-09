import javax.swing.*;

public class Expreciones {
    public static void main(String [] args){
        //declaracion de variables
        String salida;
        double r =0 , r2=0 , r3=0 , r4=0, r5=0;
        double a= 0, y= 0, z= 0, x= 0;
        a= Double.parseDouble(JOptionPane.showInputDialog("Intruduce el valor de a"));
        y= Double.parseDouble(JOptionPane.showInputDialog("Intruduce el valor de y"));
        z= Double.parseDouble(JOptionPane.showInputDialog("Intruduce el valor de z"));
        x= Double.parseDouble(JOptionPane.showInputDialog("Intruduce el valor de x"));

        r= Math.pow(a* Math.pow(y,z+1)/(x+1),2);
        double b = 0;
        r2 = Math.pow(Math.sqrt(Math.pow(a-b,2)) /(4*x), z-1);

        r3 = 1.0 /Math.sqrt(Math.pow(x,2) -(4*x));

        r4 = Math.pow(a + Math.pow(y,z+1),2);

        r5= (y-3) / Math.pow(x,5);
        salida = "El resultado de la expreción1: " + r +"\n El resultodo de la exprecion 2 es:" + r2 + "\n El resultado de la exprecion 3 es:" + r3 + "\n El resultado de la exprecion 4 es: " + r4 + "\n El resultado de la exprecion 5 es: " + r5;
        JOptionPane.showMessageDialog(null,"El resultado de la exprecion 1: " + r+"\n El resultodo de la exprecion 2 es:" + r2 + "\n El resultado de la exprecion 3 es:" + r3 + "\n El resultado de la exprecion 4 es: " + r4 + "\n El resultado de la exprecion 5 es: " + r5);


    }
}
