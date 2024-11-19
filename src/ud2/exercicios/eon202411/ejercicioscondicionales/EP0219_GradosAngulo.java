/* EP0219. Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y 
muestre el equivalente en radianes. Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a
 360°, hay que transformarlo a dicho rango. 
 
 Nota: El operador módulo (%) puede ayudarnos a convertir un ángulo a su equivalente en el rango 
 comprendido de 0 a 360°.
 */

package ud2.exercicios.eon202411.ejercicioscondicionales;

import java.util.Scanner;

public class EP0219_GradosAngulo {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de grados del ángulo:");
        double gradosAngulo = sc.nextDouble();
        sc.close();
        
        double moduloAngulo = gradosAngulo%360;
        double radianesAngulo   = Math.PI/180 * moduloAngulo;

        System.out.printf("%.2f° son %.2f radianes\n",moduloAngulo,radianesAngulo);
        
    }
    
}
