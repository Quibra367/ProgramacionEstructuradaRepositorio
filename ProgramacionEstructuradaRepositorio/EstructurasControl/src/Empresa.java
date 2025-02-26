import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables

        double saldo = 0.0;
        double prestamo = 0.0;
        double equipoComputo= 0.0;
        double mobiliario= 2000;
        double compraInsumos= 0.0;
        double insentivos= 0.0;
        String salida = "";
        //solicitar el saldo
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo: "));

        if (saldo>0.0){
            prestamo= 10000.0;

        }else if (saldo>0.0 && saldo<20000) {
            prestamo = (20000.0 - saldo);

        }else {
            prestamo = saldo;


        }
        equipoComputo=5000;
        prestamo-=equipoComputo;
        prestamo-=mobiliario;
        compraInsumos = prestamo/2.0;
        prestamo -= compraInsumos;
        insentivos = prestamo;

        salida = "resultados\n" + "Compra de insumos : " + compraInsumos + "\nIncentivos del Personal: " + insentivos + "\nEquipo computo: " + equipoComputo + "\nMobiliario: " + mobiliario;

        JOptionPane.showMessageDialog(null, salida);

    }
}
