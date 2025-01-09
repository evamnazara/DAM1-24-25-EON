//insercion directa 
package ud4.apuntes;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EjemploOrdenar3 {
    public static void insercionDirecta(int A[]){                                            
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
                  aux = A[p];           // el final, guardamos el elemento y
                  j = p - 1;            // empezamos a comprobar con el anterior
                  while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
                                                    // valor de aux sea menor que los
                                 A[j + 1] = A[j];   // de la izquierda, se desplaza a
                                 j--;               // la derecha
                  }
                  A[j + 1] = aux;       // colocamos aux en su sitio
        }
    }

    public static void main(String[] args) {
        int [] t = ArraysUtil.arrayAleatorio(10, 1, 10);
        System.out.println(Arrays.toString(t)); // impresion del string a pelo 

        insercionDirecta(t); // funcion con el array
        System.out.println(Arrays.toString(t)); // impresion del string ordenado 
    }
}
