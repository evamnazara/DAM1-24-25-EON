package ud4.apuntes;

import java.util.Arrays;

import ud4.utiles.ArraysUtil;

public class EjemploOrdenar4 {
    public static void quicksort(Integer A[], Integer izq, Integer der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
       
        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
           while(A[j] > pivote) j--;           // busca elemento menor que pivote
           if (i < j) {                        // si no se han cruzado                      
               aux= A[i];                      // los intercambia
               A[i]=A[j];
               A[j]=aux;
           }
         }
         
         A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         
         if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho
         
      }

    public static void main(String[] args) {
        Integer [] t = ArraysUtil.arrayAleatorio(10000, 1, 10);
        System.out.println(Arrays.toString(t)); // impresion del string a pelo 

        quicksort(t,0,t.length -1); // funcion con el array
        System.out.println(Arrays.toString(t)); // impresion del string ordenado 
    }
}
