/**
 * 
 * EP0511.  
 * Realiza la función: int[] buscarTodos(int t[], int clave), que crea y devuelve
 *  una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda. 
 * En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
 */

package arraysejercicios.apuntes;

import java.util.Arrays;

public class EP0511 {
    public static void main(String[] args) {
        int[] tablaBuscar = {1, 6, 3, 5, 6, 7, 1, 7, 0, 6, 0};

        int clave = 6;

        int[]tablaIndices = buscarTodos(tablaBuscar, clave);

        System.out.println("El numero clave " + clave + " se encuentra en las posiciones: " + Arrays.toString(tablaIndices));

    }

    public static int[] buscarTodos(int t[], int clave) {

        int contadorClave = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contadorClave++;
            }
        }

        // array auxiliar 
        int[] tablaIndices = new int[contadorClave];
        int j = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                tablaIndices[j] = i; // guarda el valor en el array
                j++;
            }
        }
        return tablaIndices;
    }
}

