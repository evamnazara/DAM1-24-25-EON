/*
 * BuscarFilaMayorSuma Escribe un programa en Java que reciba una matriz de enteros y 
 * determine devuelva la fila que tiene la mayor suma de sus elementos. 
 * 
 * recibe matriz > devuelve array (equipo vs puntuaciones de los miembros)
 */
package arraysejercicios;
import java.util.*;

public class Buscarfilamayor {

    public static void main(String[] args) {
        int [][] matriz1;
        
        matriz1 = generarMatrizAleatori_0a9(3,4);

        mostrarMatriz(matriz1);

        int [] fila = buscarFilaMayorSuma(matriz1);

        /* */
        System.out.println("La fila mayor es: ");
        System.out.println(Arrays.toString(fila));
    }

    
    
    static int[][] generarMatrizAleatori_0a9(int numFilas, int numColumnas) {
        int[][] matriz = new int[numFilas] [numColumnas];

        for(int i = 0; i < matriz.length; i++) 
        for (int j = 0; j < matriz[i].length; j++)  
            matriz[i][j] =(int) (Math.random() * 10) + 1; 
        

        return matriz;
    }

    static void mostrarMatriz(int [][] tabla) {
        for(int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++)
            System.out.print(tabla[i][j] + " ");
            System.out.println(" ");
        }

    }
    static int[] buscarFilaMayorSuma(int [][] m) {
        if (m ==null)
            return null;
        if (m.length == 0)
         return new int[0];

         //EVALUACION POR CORTOCIRCUITO: 
            /*
            if (m ==null ||m.length == 0)
                return null;
            */

            //recorrer la matriz fil a fila 
        int sumaMaxima = 0;
        int filaMaxima = 0;
        for(int i = 0; i < m.length; i++){
            int suma=0;
            for(int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }

            System.out.println("Suma fila " + i + " = " + suma );
            if (i ==0 && suma > sumaMaxima) {
                sumaMaxima = suma;
                filaMaxima = i;
                } 

        }

        //array que apunta a la fila
        return m[filaMaxima];
    }


}
    

