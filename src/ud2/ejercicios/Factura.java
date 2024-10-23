/* Escribe un programa para emitir la factura de compra de un producto,
introduciendo el precio del producto y el número de unidades compradas. 
La factura deberá añadir al total un IVA (Impuesto del Valor Añadido) del 21%. 
Si el precio final con IVA es superior a 100 euros se aplicará un descuento del 5%.
Ejemplos para pruebas:
● Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
● Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €  */

package ud2.ejercicios;
import java.util.*;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio");
        double precio = sc.nextDouble();

        System.out.println("Unidades");
        double unidades = sc.nextDouble();
        sc.close();

        double iva = precio * unidades * 0.21 ;

        System.out.println(iva + precio + unidades ); //para q salga en verde






        
        

        
    }
}
