//ordenacion por selección 

package ud4.apuntes;

import java.util.Arrays;

import ud4.utiles.ArraysUtil;

public class EjemploOrdenar2 {

    public static void seleccion(Integer A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
              menor = A[i];                       // de los elementos que quedan por ordenar                    
              pos = i;                            // y guardamos su posición
              for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                    if (A[j] < menor) {           // del array algún elemento
                        menor = A[j];             // menor que el actual
                        pos = j;
                    }
              }
              if (pos != i){                      // si hay alguno menor se intercambia                         
                  tmp = A[i];
                  A[i] = A[pos];
                  A[pos] = tmp;
              }
        }
}

    public static void main(String[] args) {
        Integer [] t = ArraysUtil.arrayAleatorio(10, 1, 10);
        System.out.println(Arrays.toString(t)); // impresion del string a pelo 

        seleccion(t); // funcion con el array
        System.out.println(Arrays.toString(t)); // impresion del string ordenado 
    }
}
