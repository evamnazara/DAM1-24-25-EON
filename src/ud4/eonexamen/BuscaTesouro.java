//Eva Otero Názara


package ud4.eonexamen;

import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;

public class BuscaTesouro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Random random = new Random();

        int filas;
        int columnas;
        
        System.out.println("JUEGO DE BÚSQUEDA DEL TESORO. ");

        System.out.println("Introduce el número de columnas de tablero: ");
        columnas = sc.nextInt();

        System.out.println("Introduce el número de filas del tablero:");
        filas = sc.nextInt();
        
        int [][] mapaTesoro = new int [filas][columnas];
        
        //intentos maximos: 10% de casillas
        int numCasillas = filas * columnas;
        int intentosMaximos = (int) (numCasillas * 0.1);

            

        System.out.println("Hay un total de " + numCasillas + " casillas en tu mapa, así que tienes un máximo de " + intentosMaximos + " intentos para encontrar el tesoro. ¡buena suerte!");
        
        
        //esconder  tesoro en el mapa
        //int posicionTesoro = random.nextInt(numCasillas - 0 + 1) + 1;
        int tesoro = 1;

        System.out.println("Ahora colocaremos el tesoro en una posición aleatoria de tu mapa.");
        System.out.println("Introduce dos números enteros menores que los números de fila y columna que hayas elegido:");
        for (int i = 0; i < tesoro; i++) {
            columnas = sc.nextInt() - 1;
            filas = sc.nextInt() - 1;
            tesoro = mapaTesoro[columnas][filas] = 1;
        }

        for (int[] fila : mapaTesoro) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Introduce la casilla en la que quieras que busque el tesoro.");
        int casillaUsuario = sc.nextInt();
        int numIntentos = 0; 

        //si no acierta, pista de direccion (mas {norte|nordés|leste|sueste|sur|suroeste|oeste|noroeste} 

        
        //termina cuando se acaben los intentos o se encuentre el tesoro
        while (casillaUsuario != tesoro || numIntentos > intentosMaximos) {
            numIntentos--;
            casillaUsuario = sc.nextInt();

        }

        if (casillaUsuario == tesoro) {
            System.out.println("¡Lo encontraste!");
            System.out.println("Numero total de intentos: " + numIntentos);
        }


        //soportar entradas invalidas

        sc.close();
 
    }
    
}
