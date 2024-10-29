/* Ejemplo:  programa  que  muestra  una  tabla  con  temperaturas  expresadas  en  grados  Fahrenheit  y  su  equivalente  en
grados Celsius. Los valores de las temperatura en grados Fahrenheit estarán comprendidas entre 10 ºF y 100 ºF y se
mostrarán con un incremento de 10º entre ellas (10, 20, 30 ...).
Fórmula para pasar de ºF a ºC:     ºC = (ºF – 32) * 5 / 9  */

package ud2.ejemplos;

public class Ejemplo3While {
    public static void main(String[] args) {
        int fahrenheit = 10; //contiene las temperaturas fahrenheit                                         
        double celsius;      //contiene las temperaturas celsius
        System.out.printf(" ºF \t  ºC \n");
        System.out.println("---------------");
        while (fahrenheit <= 100 ){ //inicio del bucle while
               celsius = (fahrenheit - 32)*5/9.0;
               System.out.printf("%3d\t%6.2f \n", fahrenheit, celsius); 
                                        //salida de formateado

               fahrenheit += 10;
        }  //fin del bucle while
    }
}
