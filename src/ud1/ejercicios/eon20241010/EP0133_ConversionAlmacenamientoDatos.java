/* EP0133_ConversionAlmacenamientoDatos
 Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes,
 kilobytes (KB), megabytes (MB) y gigabytes (GB). Solicita al usuario la cantidad de datos y
 la unidad de origen y destino.
 ● 1KB=1024bytes
 ● 1MB=1024KB
 ● 1GB=1024MB
 El programa deberá realizar la conversión correspondiente y mostrar el resultado */

package ud1.ejercicios.eon20241010;
import java.util.Scanner;

public class EP0133_ConversionAlmacenamientoDatos {
    public static void main(String[] args) {
        // Datos
        double cantidadOrigen, cantidadDestino;
        char udMedidaOrigen, udMedidaDestino;
        final int MULTIPLO_KB = 1024;
        final int MULTIPLO_MB = 1024 * 1024;
        final int MULTIPLO_GB = 1024 * 1024 * 1024;

        // Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la cantidad de datos a convertir: ");
        cantidadOrigen = sc.nextDouble(); sc.nextLine();
        System.out.print("Unidad de medida de Origen (b=bytes; k=kilobytes; m=megabytes; g=gigabytes):");
        udMedidaOrigen = sc.nextLine().charAt(0);
        System.out.print("Unidad de medida de Destino:");
        udMedidaDestino = sc.nextLine().charAt(0);
        sc.close();

        // Proceso
        // Convierto la cantidad de Origen a bytes
        double bytes = udMedidaOrigen == 'b' ? cantidadOrigen : udMedidaOrigen == 'k' ? cantidadOrigen * MULTIPLO_KB : udMedidaOrigen == 'm' ? cantidadOrigen * MULTIPLO_MB : cantidadOrigen * MULTIPLO_GB;

        // Convierto los bytes a la cantidad de Destino
        cantidadDestino = udMedidaDestino == 'g' ? bytes / MULTIPLO_GB : udMedidaDestino == 'm' ? bytes / MULTIPLO_MB : udMedidaDestino == 'k' ? bytes / MULTIPLO_KB : bytes;

        // Salida
        System.out.printf("La cantidad resultante es de %.2f ", cantidadDestino);
        String medida = udMedidaDestino == 'b' ? "bytes" : 
                        udMedidaDestino == 'k' ? "kilobytes" : 
                        udMedidaDestino == 'm' ? "megabytes" : 
                        "gigabytes";
        System.out.println(medida);
        
    }
}
