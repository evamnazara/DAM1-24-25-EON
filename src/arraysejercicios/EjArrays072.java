
// Autora: Eva María Otero Názara

/* EjArrays07. 
Leer N alturas y calcular la altura media. Calcular cuántas hay superiores a la media y cuántas inferiores.
*/
package arraysejercicios;

import java.util.Scanner;

public class EjArrays072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de alturas: ");
        int n = sc.nextInt();
        int[] alturas = new int[n];

        System.out.println("Introduce " + n + " alturas en centímetros:");
        leerAlturas(alturas, sc);

        System.out.println("Has introducido " + n + " alturas.");

        // Cálculo de la media
        int sumaAlturas = 0;
        for (int altura : alturas) { // for-each
            sumaAlturas += altura; 
        }
        double mediaAlturas = (double) sumaAlturas / n; // Calcular la media como un valor decimal

        // Contar cuántas alturas son superiores o inferiores a la media
        int altSuperiorMedia = 0;
        int altInferiorMedia = 0;

        for (int altura : alturas) {
            if (altura > mediaAlturas) {
                altSuperiorMedia++; 
            } else if (altura < mediaAlturas) {
                altInferiorMedia++;
            }
        }

        // Mostrar los resultados
        System.out.println("La media de las alturas introducidas es de " + mediaAlturas + " centímetros.");
        System.out.println("Hay un total de " + altInferiorMedia + " alturas inferiores a la media, y " + altSuperiorMedia + " superiores a ella.");

        // Cerrar el Scanner
        sc.close();
    }

    // Método para leer las alturas
    private static void leerAlturas(int[] altura, Scanner sc) {
        for (int i = 0; i < altura.length; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            altura[i] = sc.nextInt();
        }
    }
}
