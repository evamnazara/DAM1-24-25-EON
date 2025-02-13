/* RegistroTiempos.java 
Crea un programa que registre y almacene los segundos transcurridos desde el inicio del 
programa hasta cada vez que se pulsa la tecla Enter. La entrada de tiempos finalizará 
cuando se introduzca la letra “F” o “f”, contabilizando también esta entrada en el registro. 
 
Imagina que se trata del cronómetro utilizado por un profesor de Educación física para 
cronometrar los segundos que tarda el alumnado en dar 5 vueltas al campo. 
 
Al terminar la introducción de datos, el programa imprimirá los tiempos recogidos (en 
segundos), calculará la media y contabilizará el número de tiempos registrados por encima 
de la media, imprimiendo los resultados. 
 
Ejemplos:  
1.  Se inicia el programa y el usuario pulsa Enter al cabo de 3, 7, y 12 segundos, e 
introduce una “F” 20 segundos después de iniciado el programa.  
El programa imprimirá lo siguiente: 
 
[3, 7, 12, 20] 
Media = 10.5 
Número de registros por encima de la media: 2 
 
2.  Se inicia el programa y el usuario introduce una “F” al cabo de 5 segundos.  
El programa imprimirá lo siguiente: 
 
[5] 
Media = 5 
Número de registros por encima de la media: 0 
 
Notas:  
●  Usa el método now() de la clase LocalTime para obtener la hora del sistema. 
●  Puedes usar el método equalsIgnoreCase() de la clase String. */ 

package arraysejercicios.UD04Practica;

import java.time.LocalTime;
import java.util.Scanner;

public class tiempos {
    public static void main(String[] args) {
       /*  Scanner sc = new Scanner(System.in);
        
        LocalTime tiempoInicio = LocalTime.now();
        int [] tiempos = new int [0];
        String salida = "F";
        salida.equalsIgnoreCase(salida); 
        */

        //while (condition) {}

        /*Notas:  
        ●  Usa el método now() de la clase LocalTime para obtener la hora del sistema. 
        ●  Puedes usar el método equalsIgnoreCase() de la clase String. */
    }
}
