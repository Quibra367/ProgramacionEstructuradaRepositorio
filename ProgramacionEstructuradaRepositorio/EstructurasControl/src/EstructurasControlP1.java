//import javax.swing.*;
//public class EstructurasControlP1 {
//    public static void main(String[] args) {
//        //Declaracion de variables
//        String opcion = "";
//        String menu = "a) juego\n" +
//                "b)Fruteria\n" +
//                "c) Laboratorio\n" +
//                "d) Salir\n" +
//                "Elegir una opcion: ";
//
//        opcion = JOptionPane.showInputDialog(menu);
//
//        opcion = opcion.toUpperCase();
//        String pregunta = "¿Colon descubrio america?";
//        String resp = JOptionPane.showInputDialog(pregunta + "Si/No");
//        if (resp.equalsIgnoreCase("Si")) {
//            resp = JOptionPane.showInputDialog("La independencia de mexico fue en 1810");
//            if (resp.equalsIgnoreCase("Si")) ;
//            resp = JOptionPane.showInputDialog(("The door fue un grupo de rock Americano?"));
//            if (resp.equalsIgnoreCase("si")) ;
//            JOptionPane.showMessageDialog(null, "Has ganado");
//        } else {
//            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
//
//            switch (opcion) {
//                case "A":
//                    jugar();
//                    break;
//                case "B":
//                    double precio= 0.0;
//                    double canKilos= 0.0;
//                    precio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de las manzanas"));
//                    canKilos = Double.parseDouble(JOptionPane.showInputDialog("introduce el total de kilos de manzanas"));
//
//                    if( canKilos>0)
//                    if(canKilos>=0.0 && canKilos<=2.0){
//                        double descuento= (canKilos + precio) *0.15;
//                        resultado = "El total a pagar con un descuento(15%)"
//                        +descuento + "es" + (canKilos+precio - descuento);
//
//                    }
//
//                    break;
//                case "C":
//
//                    break;
//                case "D":
//
//                default:
//                    JOptionPane.showMessageDialog(null, "Opcion no valida");
//
//            }
//
//        }
//    }
//}
