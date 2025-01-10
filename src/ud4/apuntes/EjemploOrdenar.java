//burbuja 
package ud4.apuntes;

import java.util.Arrays;
import ud4.ArraysUtil;

public class EjemploOrdenar {
    public static void burbuja(Integer[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) //el +1 compara ese elemento y el siguiente
                {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer [] t = ArraysUtil.arrayAleatorio(10, 1, 10);
        System.out.println(Arrays.toString(t)); // impresion del string a pelo 

        burbuja(t); // funcion con el array
        System.out.println(Arrays.toString(t)); // impresion del string ordenado 


    }
}
