package ud4.apuntes;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EjemploOrdenar5 {
    public static void mergesort(int A[],int izq, int der){
        if (izq < der){
                int m=(izq+der)/2;
                mergesort(A,izq, m);
                mergesort(A,m+1, der);                                                                                
                merge(A,izq, m, der);                                                                                 
        }
    }

    public static void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar                                       
             B[i]=A[i];
     
        i=izq; j=m+1; k=izq;
          
        while (i<=m && j<=der) //copia el siguiente elemento más grande                                      
               if (B[i]<=B[j])
                   A[k++]=B[i++];
               else
                   A[k++]=B[j++];
             
        while (i<=m)         //copia los elementos que quedan de la
              A[k++]=B[i++]; //primera mitad (si los hay)
     }

     public static void main(String[] args) {
        int [] t = ArraysUtil.arrayAleatorio(10000, 1, 10);
        System.out.println(Arrays.toString(t)); // impresion del string a pelo 

        mergesort(t,0,t.length -1); // funcion con el array
        System.out.println(Arrays.toString(t)); // impresion del string ordenado 
     }
}
