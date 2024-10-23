package ud2.ejercicios;

import java.util.Scanner;

/**
 * Haz un programa que pida por teclado un número de año y que muestre un mensaje indicando si el año es bisiesto o no.
Investiga el agoritmo para calcular si un año es bisiesto o no.

“Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100, en cuyo caso también ha de ser divisible entre 400.”

Ejemplos:
Son bisiestos: 4, 40, 120, 144, 400, 800, 2024. 
No son bisiestos: 3, 100, 2100

 */
public class Bisiesto {
    public static void main(String[] args) {
        int anho;
        boolean esBisiesto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Año: ");
        anho = sc.nextInt();
        sc.close();

        boolean div4 = anho % 4 == 0;
        boolean div100 = anho % 100 == 0;
        boolean div400 = anho % 400 == 0;

        esBisiesto = div400 || div4 && !div100;

        /*
        if (div400 || div4 && !div100) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }
 */
   /*
        if (div4) {
            if (div100) {
                if (div400) {
                    esBisiesto = true;
                } else {
                    esBisiesto = false;
                }
            } else {
                esBisiesto = true;
            }
        } else {
            esBisiesto = false;
        }
 */     
        if (esBisiesto) {
            System.out.println("El año " + anho + " es bisiesto.");
        } else {
            System.out.println("El año " + anho + " NO es bisiesto.");
        }

    }
}
