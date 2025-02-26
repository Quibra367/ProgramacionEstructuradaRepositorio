//import javax.swing.*;
//
//public class ProgramaCiclos {
//    public static void main(String[] args) {
//
//        //Declaracion de variables
//
//        String menu = "";
//        String opcion = "";
//        boolean sentinel= true;
//        //Creacionde del menu
//
//        menu = "Menu principal \n" +
//                "1) Promedio Calificaciones (For)\n" +
//                "2) Vendedores (while)\n" +
//                "3) Tienda (de- while0)\n" +
//                "4) Salir\n" +
//                "Elegir una opcion: ";
//do {
//    opcion = JOptionPane.showInputDialog(menu);
//    switch (opcion) {
//        case "1":
//            int numCalif = 0;
//            double calif = 0.0;
//            double promedio = 0.0;
//            //Solicitar el numero de calificaciones
//
//            numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones"));
//            for (int i = 1; i <= numCalif; i++) {
//                //Solicitar calificacion
//
//                calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion" + i));
//
//                //Acumular calificaciones
//
//                promedio += calif;
//
//            }
//            promedio /= numCalif;
//            JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + promedio);
//            break;
//        case "2":
//            String nombre = "";
//            int numeroVenderdores = 0;
//            double sueldoBase = 0.0;
//            double comision = 0.0;
//            double sueldoTotal = 0.0;
//            String salida = "";
//            double v1 = 0.0, v2 = 0.0, v3 = 0.0;
//            numeroVenderdores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de vendedores"));
//            sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo base: "));
//            salida = "Nombre       Comision      Sueldo total: \n";
//            sueldoTotal = sueldoBase + comision;
//            int i = 1;
//            while (i <= numeroVenderdores) {
//                nombre = JOptionPane.showInputDialog("Introduce el nombre del venderdor");
//                v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la primera venta: "));
//                v2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la segunda venta: "));
//                v3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tercera venta: "));
//                comision = (v1 + v2 + v3) * .10;
//                salida += nombre + "            " + comision + "         " + sueldoTotal + "\n";
//                i++;
//            }
//            JOptionPane.showMessageDialog(null, salida);
//            break;
//        case "3":
//            //Tienda de Bolitas
//            String menuBolitas = "Tombola\n" + "a)Bolita roja\n " + " b)Bolita amarilla\n" + "c) Bolita blanca\n " + " Elegir opccion: ";
//            String respuesta = " ", resultado = "";
//            boolean sentinel2 = true;
//            String tipoBolita = "";
//            double totalcompra = 0.0, descuento = 0.0, importe = 0.0, total = 0.0;
//            resultado = "total de ventas \n" + "descuento" + importe;
//
//            do {
//                totalcompra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de la compra"));
//                tipoBolita = JOptionPane.showInputDialog(menuBolitas);
//
//                if (tipoBolita.equalsIgnoreCase("a")
//                        || tipoBolita.equalsIgnoreCase("b")
//                        || tipoBolita.equalsIgnoreCase("c")
//                )
//                {
//                } else if (tipoBolita.equalsIgnoreCase("b")) {
//                    descuento = totalcompra * 0.25;
//
//                } else if{
//                    descuento = 0.0;
//                    importe = totalcompra - descuento;
//                     total += importe;
//                    resultado += totalcompra + "       " + descuento + "     " + importe + "\n";
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "Bolita no valida");
//                }
//
//            salida=JOptionPane.showInputDialog("Desea cerrar la caja? si/no      ");
//    if(salida.equalsIgnoreCase("si"));
//    sentinel2=false;
//    } while (sentinel2) ;
//
//    respuesta="Total: " + total;
//    JOptionPane.showMessageDialog(null,"Adios el programa");
//
//
//
//
//                break;
//
//            case "4":
//
//                JOptionPane.showMessageDialog(null,"Adios ");
//
//                break;
//            default:
//                JOptionPane.showMessageDialog(null,"Introduce una opcion valida");
//        }
//
//    }while(sentinel);
//    }
//}