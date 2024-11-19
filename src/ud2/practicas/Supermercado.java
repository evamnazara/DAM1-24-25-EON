/* Implementa un programa que simule el proceso de cobro en la caja de un supermercado.
1. Para calcular el importe total que debe pagar cada cliente el programa solicitará
introducir el precio de cada producto, expresado en euros con hasta 2 decimales, y
la cantidad de unidades del mismo, expresado como un número entero.

2. El programa deberá controlar los posibles errores o excepciones en la entrada de
datos por teclado, informando al usuario y permitiendo repetir la entrada.
3. La condición para finalizar la introducción de productos queda a criterio del
programador. Puede ser, por ejemplo, introducir un importe igual a cero o negativo.


4. Una vez terminado de introducir los productos, el programa mostrará el importe total
de la compra y solicitará al usuario el medio de pago elegido por el cliente: “con
tarjeta” o “en efectivo”.
5. Si el método de pago elegido es “con tarjeta”, se dará por finalizada la compra de
ese cliente.
6. Si el método de pago elegido es “en efectivo”, entonces se solicitará el importe
pagado por el cliente y se calculará el cambio a devover, desglosando dicha
cantidad en billetes y monedas de € y de 1 céntimos de euro.
7. Una vez finalizada la compra de un cliente el programa solicitará si se desea repetir
el proceso para un nuevo cliente.
Implementa el programa utilizando programación modular para descomponer el problema
en subproblemas más sencillos implementados con funciones. */

package ud2.practicas;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            double totalCompra = procesarCompra(scanner);
            procesarPago(scanner, totalCompra);

            System.out.println("\n¿Desea atender a un nuevo cliente? (s/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("s"));

        System.out.println("¡Gracias por usar el sistema de cobro!");
        scanner.close();
    }

    // Función para procesar la compra del cliente
    private static double procesarCompra(Scanner scanner) {
        double totalCompra = 0.0;

        System.out.println("=== INICIO DE COMPRA ===");

        while (true) {
            double precio = solicitarDouble(scanner, "Introduce el precio del producto (0 para finalizar): ");
            if (precio <= 0) break;

            int cantidad = solicitarEntero(scanner, "Introduce la cantidad del producto: ");
            totalCompra += precio * cantidad;
        }

        System.out.printf("El importe total de la compra es: %.2f€%n", totalCompra);
        return totalCompra;
    }

    // Función para procesar el pago
    private static void procesarPago(Scanner scanner, double totalCompra) {
        System.out.println("=== MÉTODO DE PAGO ===");
        System.out.println("1. Pago con tarjeta");
        System.out.println("2. Pago en efectivo");

        int metodoPago = solicitarEntero(scanner, "Elige el método de pago (1 o 2): ");

        if (metodoPago == 1) {
            System.out.println("Pago realizado con tarjeta. ¡Gracias por su compra!");
        } else if (metodoPago == 2) {
            double efectivo = solicitarDouble(scanner, "Introduce el importe pagado: ");
            while (efectivo < totalCompra) {
                System.out.println("El importe es insuficiente. Por favor, introduce un valor mayor o igual al total.");
                efectivo = solicitarDouble(scanner, "Introduce el importe pagado: ");
            }

            double cambio = efectivo - totalCompra;
            System.out.printf("El cambio a devolver es: %.2f€%n", cambio);
            desglosarCambio(cambio);
        } else {
            System.out.println("Método de pago no válido. Volviendo al menú.");
        }
    }

    // Función para desglosar el cambio en billetes y monedas
    private static void desglosarCambio(double cambio) {
        int[] billetes = {50, 20, 10, 5};
        int[] monedas = {2, 1, 50, 20, 10, 5, 2, 1}; // En céntimos: desde 50 céntimos hasta 1 céntimo

        System.out.println("Desglose del cambio:");
        cambio = Math.round(cambio * 100); // Convertimos a céntimos para facilitar el cálculo

        // Desglose de billetes
        for (int billete : billetes) {
            int cantidad = (int) (cambio / (billete * 100));
            if (cantidad > 0) {
                System.out.printf("   %d billete(s) de %d€%n", cantidad, billete);
                cambio %= billete * 100;
            }
        }

        // Desglose de monedas
        for (int moneda : monedas) {
            int cantidad = (int) (cambio / moneda);
            if (cantidad > 0) {
                System.out.printf("   %d moneda(s) de %.2f€%n", cantidad, moneda / 100.0);
                cambio %= moneda;
            }
        }
    }

    // Función para solicitar un número decimal con validación
    private static double solicitarDouble(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número válido.");
            }
        }
    }

    // Función para solicitar un número entero con validación
    private static int solicitarEntero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número entero válido.");
            }
        }
    }
}
