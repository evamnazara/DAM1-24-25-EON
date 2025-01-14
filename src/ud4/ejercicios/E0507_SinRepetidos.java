/*E0507. Implementar la función int[] sinRepetidos(int t[]) que construye y devuelve una tabla de la longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos.

Implementa una función que genere y devuelva un array de n números enteros aleatorios usando el siguiente prototipo: 

int[] tablaRandom(int n)

*/

package ud4.ejercicios;

import java.util.Arrays;

public class E0507_SinRepetidos {

    static int [] sinRepetidos(int t[]) {

        int [] tOrdenado = t.clone(); 
        Arrays.sort(tOrdenado);
        
        int[] sinRepetidos = new int [0]; //a priori no sabemos la longitud del array que nos pasan

        for (int i = 0; i < t.length; i++) {
            boolean repetido = false;
                for (int j =0; j < sinRepetidos.length; j++) {
                    if (t[i] == sinRepetidos[j]) {
                        repetido = true;
                    }
                    if (!repetido) {
                        sinRepetidos = Arrays.copyOf(sinRepetidos, sinRepetidos.length + 1);
                    }

                }
        }

        return t;

    }

    public static void main(String[] args) {
        
    }

    
}
