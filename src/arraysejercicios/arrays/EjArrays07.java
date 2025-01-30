//autora: Eva María Otero Názara 

/* EjArrays07. 
Leer N alturas y calcular la altura media. 
Calcular cuántas hay superiores a la media y cuántas inferiores.
*/
package arraysejercicios.arrays;

import java.util.Scanner;

public class EjArrays07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de alturas que vas a calcular: ");
        int n = sc.nextInt();
        int alturas[];
        alturas = new int [n];

        System.out.println("Introduce las " + n + " alturas en centímetros:");
        leerAlturas(alturas);

        System.out.println("Has introducido correctamente las " + n + " alturas.");
        
        //cálculo de media:
        int sumaAlturas = 0;
        int mediaAlturas = 0;

        for (int altura : alturas) { //for -each
            sumaAlturas += altura; 
        }
        mediaAlturas = sumaAlturas / n;

        //superiores e inferiores 
        //contadores
        int altSuperiorMedia = 0;
        int altInferiorMedia = 0;

        for (int altura : alturas) {
            if (altura > mediaAlturas) {
                altSuperiorMedia++; 
            } else if (altura < mediaAlturas) {
                altInferiorMedia++;
            }
        }

        System.out.println("Media de las alturas introducidas: " + mediaAlturas + " cm.");
        System.out.println("Total de alturas inferiores a la media: " + altInferiorMedia ); 
        System.out.println("Total de alturas superiores a la media: " + altSuperiorMedia );
        
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

