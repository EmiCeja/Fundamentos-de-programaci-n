import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Entrada de productos
        System.out.println("Ingrese el primer producto");
        String productoUno = input.nextLine();
        System.out.println("Ingrese el segundo producto");
        String productoDos = input.nextLine();
        System.out.println("Ingrese el tercer producto");
        String productoTres = input.nextLine();
        System.out.println(" ");

        // Entrada de cantidades
        System.out.println("Ingrese la cantidad del primero");
        int cantidadUno = input.nextInt();
        System.out.println("Ingrese la cantidad del segundo");
        int cantidadDos = input.nextInt();
        System.out.println("Ingrese la cantidad del tercero ");
        int cantidadTres = input.nextInt();
        System.out.println(" ");

        // Entrada de precios
        System.out.println("Ingrese el precio del primer producto");
        int precioUno = input.nextInt();
        System.out.println("Ingrese el precio del segundo producto");
        int precioDos = input.nextInt();
        System.out.println("Ingrese el precio del tercer producto");
        int precioTres = input.nextInt();
        System.out.println(" ");

        // Entrada de porcentajes de descuento
        System.out.println("Ingrese el porcentaje de descuento del primer producto");
        int porcUno = input.nextInt();
        System.out.println("Ingrese el porcentaje de descuento del segundo producto");
        int porcDos = input.nextInt();
        System.out.println("Ingrese el porcentaje de descuento del tercer producto");
        int porcTres = input.nextInt();
        System.out.println(" ");

        // Entrada de impuestos
        System.out.println("Ingrese el impuesto del primer producto");
        int impuestoUno = input.nextInt();
        System.out.println("Ingrese el impuesto del segundo producto");
        int impuestoDos = input.nextInt();
        System.out.println("Ingrese el impuesto del tercer producto");
        int impuestoTres = input.nextInt();
        System.out.println(" ");

        // Cálculos de precios sin descuento
        double precioSinDescuentoUno = precioUno * cantidadUno;
        double precioSinDescuentoDos = precioDos * cantidadDos;
        double precioSinDescuentoTres = precioTres * cantidadTres;

        // Cálculos de descuentos
        double descuentoUno = (porcUno / 100.0) * precioSinDescuentoUno;
        double precioConDescuentoUno = precioSinDescuentoUno - descuentoUno;
        double descuentoDos = (porcDos / 100.0) * precioSinDescuentoDos;
        double precioConDescuentoDos = precioSinDescuentoDos - descuentoDos;
        double descuentoTres = (porcTres / 100.0) * precioSinDescuentoTres;
        double precioConDescuentoTres = precioSinDescuentoTres - descuentoTres;

        // Cálculos de impuestos
        double impuestoAplicadoUno = (impuestoUno / 100.0) * precioConDescuentoUno;
        double precioFinalUno = precioConDescuentoUno + impuestoAplicadoUno;
        double impuestoAplicadoDos = (impuestoDos / 100.0) * precioConDescuentoDos;
        double precioFinalDos = precioConDescuentoDos + impuestoAplicadoDos;
        double impuestoAplicadoTres = (impuestoTres / 100.0) * precioConDescuentoTres;
        double precioFinalTres = precioConDescuentoTres + impuestoAplicadoTres;

        // Mostrar resultados
        System.out.println(" ");
        System.out.println("Resumen del pedido:");
        System.out.printf("Producto 1: %s, Cantidad: %d, Precio sin descuento: %.2f, Descuento aplicado: %.2f, Impuestos: %.2f, TOTAL: %.2f\n",
                productoUno, cantidadUno, precioSinDescuentoUno, descuentoUno, impuestoAplicadoUno, precioFinalUno);
        System.out.printf("Producto 2: %s, Cantidad: %d, Precio sin descuento: %.2f, Descuento aplicado: %.2f, Impuestos: %.2f, TOTAL: %.2f\n",
                productoDos, cantidadDos, precioSinDescuentoDos, descuentoDos, impuestoAplicadoDos, precioFinalDos);
        System.out.printf("Producto 3: %s, Cantidad: %d, Precio sin descuento: %.2f, Descuento aplicado: %.2f, Impuestos: %.2f, TOTAL: %.2f\n",
                productoTres, cantidadTres, precioSinDescuentoTres, descuentoTres, impuestoAplicadoTres, precioFinalTres);

        // Suma final de los precios de los tres productos
        System.out.println(" ");
        double Total = precioFinalUno + precioFinalDos + precioFinalTres;
        System.out.printf("TOTAL GENERAL: %.2f\n", Total);
    }
}