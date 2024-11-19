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

//import java.util.*;


public class Supermercado {
    public static void main(String[] args) {
         /* Scanner sc = new Scanner(System.in);
        double precioUnidad;
        int cantidad;
        double precioTotalUnidad;
        double precioTotal;

        System.out.println("CAJA DE COBRO: ");

        System.out.println("Precio del producto: ");
        precioUnidad = sc.nextDouble();

        do {    
            System.out.println("Introduce el precio del producto: ");
            precioTotalUnidad = sc.nextDouble();

            System.out.println("Unidades del producto: ");
            cantidad = sc.nextInt();

           precioTotalUnidad = precioUnidad * cantidad;
        //falta precio total
        } while (cantidad != 0);

        System.out.println("El importe total son " + precioTotal);

        System.out.println("MODALIDAD DE PAGO: ");
        System.out.println("Pago con tarjeta [1]");
        System.out.println("Pago en efectivo [2]");
        int pago = sc.nextInt();

        if (pago == 2) {

            System.out.println("Importe pagado: ");
            double ImportePagado = sc.nextDouble();
            
            System.out.println("Cambio a devolver: ");


            double cambioADevolver = ImportePagado;

            System.out.println("El importe a devolver es " + cambioADevolver + "€");
            
            
        } else {
            System.out.println("¡Gracias por su compra!");
        }


        sc.close(); */
    }
    
}