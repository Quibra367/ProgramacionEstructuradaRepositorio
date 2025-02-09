import javax.swing.JOptionPane;
public class Distancia {
    public static void main(String[] args) {
        //Definicion de valores
        double cm= 0.0;
        double numpies= 0.0;
        double yarda= 0.0;
        double pulgada= 0.0;
        double metro= 0.0;
        // Entradas
        numpies = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de pies"));
               //proceso

        yarda= numpies / 3.0;
        pulgada=numpies * 1.2;
        cm = pulgada*2.54;
        metro= cm / 100 ;

        //salida

        String salida = "Resultados\n" +
                "Las converciones para " + numpies + "pies son:" +
                "Yardas =" + yarda +
                "Las pulgados =" + pulgada +
                "En centimetro =" + cm +
                "En metros : " + metro;

        JOptionPane.showMessageDialog(null, salida);

    }
}
