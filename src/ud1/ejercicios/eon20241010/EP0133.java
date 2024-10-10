/* EP0133_ConversionAlmacenamientoDatos
 Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes,
 kilobytes (KB), megabytes (MB) y gigabytes (GB). Solicita al usuario la cantidad de datos y
 la unidad de origen y destino.
 ● 1KB=1024bytes
 ● 1MB=1024KB
 ● 1GB=1024MB
 El programa deberá realizar la conversión correspondiente y mostrar el resultado */

package ud1.ejercicios.eon20241010;

import java.util.*;

public class EP0133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //igualamos a bytes 
        double kbEnBytes = 1024;
        double mbEnBytes = kbEnBytes * 1024;
        double gbEnBytes = mbEnBytes * 1024;

        System.out.println("Programa de conversión de unidades de almacenamiento en bytes.");
        System.out.println("Introduce la cantidad de datos, sin unidades:");
        double cantidad = sc.nextDouble();

        System.out.println("Ahora entre");


        sc.close();

        
    }
    
}
