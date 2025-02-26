public class DescuentoComputadoras {
    public static void main(String[] args) {

        // Precio por computadora
        int precioComputadora = 11000;

        // Cantidad de computadoras (valor predefinido en lugar de usar Scanner)
        int cantidad = 7; // Puedes cambiar este valor manualmente

        // Determinar el porcentaje de descuento
        double descuento;
        if (cantidad < 5) {
            descuento = 0.10;
        } else if (cantidad < 10) {
            descuento = 0.20;
        } else {
            descuento = 0.40;
        }

        // Calcular el total a pagar con descuento
        double totalSinDescuento = cantidad * precioComputadora;
        double totalConDescuento = totalSinDescuento * (1 - descuento);

        // Mostrar resultados
        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: $" + totalConDescuento);

    }
}
