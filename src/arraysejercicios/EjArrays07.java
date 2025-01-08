//autora: Eva María Otero Názara 

/* EjArrays07. 
Leer N alturas y calcular la altura media. Calcular cuántas hay superiores a la media y cuántas inferiores.
*/
package arraysejercicios;

import java.util.Scanner;

public class EjArrays07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int alturas[];
        alturas = new int [n];

        System.out.println("Introduce" + n + "alturas en centímetros:");
        leerAlturas(alturas);

        System.out.println("Has introducido " + n + " alturas.");
        
        //cálculo de media:
        int sumaAlturas = 0;
        int mediaAlturas = 0;

        for (int altura : alturas) { //for -each
            sumaAlturas += altura; 
        }
        mediaAlturas = sumaAlturas / n;

        //
        int altSuperiorMedia = 0;
        int altInferiorMedia = 0;

        for (int altura : alturas) {
            if (altura > mediaAlturas) {
                altSuperiorMedia++; 
            } else if (altura < mediaAlturas) {
                altInferiorMedia++;
            }
        }

        System.out.println("La media de las alturas introducidas es de " + mediaAlturas + " centímetros.");
        System.out.println("Hay un total de " + altInferiorMedia + " alturas inferiores a la media, y " + altSuperiorMedia + " superiores a ella.");
        sc.close();
    }

    private static void leerAlturas(int[] altura) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < altura.length; i++) {
            altura[i] = sc.nextInt();
        }
        sc.close();
    }
}
