/*Año Bisiesto (Bisiesto.java). Haz un programa que pida por teclado un número de año y que
muestre un mensaje indicando si el año es bisiesto o no.
Investiga el agoritmo para calcular si un año es bisiesto o no.
“Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100, en cuyo
caso también ha de ser divisible entre 400.”
Ejemplos:
● Son bisiestos: 4, 40, 120, 144, 400, 800, 2024.
● No son bisiestos: 3, 100, 2100 */
package ud2.ejemplos;
import java.util.*;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esBisiesto; //declarar identificadores detallados
        System.out.println("Año: ");

        int anho = sc.nextInt();

        boolean div4 = anho % 4 == 0;
        boolean div100 = anho % 100 == 0;
        boolean div400 = anho % 400 == 0;

        if (div4) { 
            if (div100) {
                if (div400) {
                    esBisiesto = true;    
                } else {
                    esBisiesto = false;
                }} else {
                    esBisiesto = false;
            }
        } 

        if (esBisiesto = true) {
            System.out.println("El seño es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto");
        }

    }
}
