/*
    Definir una función que tome como parámetros dos tablas, la primera con los 6 
    números de una apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la 
    combinación ganadora. La función devolverá el número de aciertos. 
         
        static int numAciertos(int[] apuesta, int[] ganadora) 
         
    Crea un método que devuelve una tabla de números enteros aleatorios entre dos 
    números yu de una longitud especificada. 
         
        static int[] tablaAleatoria(int numInicio, int numFin, int longitud);  */

package arraysejercicios.paraninfo;

import java.util.Arrays;

import ud4.utiles.ArraysUtil;

public class E0506_Primitiva {
    public static void main(String[] args) {
        Integer [] apuesta = ArraysUtil.arrayAleatorio(6, 1, 20);
        Integer [] ganadora = ArraysUtil.arrayAleatorio(6, 1, 20);
        Arrays.sort(ganadora); //ordenamos solo la ganadora.
        System.out.println("Combinación ganadora:");
        System.out.println(Arrays.toString(ganadora));

        System.out.println("Tu combinación:");
        System.out.println(Arrays.toString(apuesta));

        System.out.println("Numero de aciertos: " + numAciertos(apuesta, ganadora));


    }

    static int numAciertos(Integer[] apuesta, Integer[] ganadora) {
        int numAciertos = 0;


        //alternativa: for (int i = 0; i < apuesta.length; i++) {}

        for (int numeroApuesta : apuesta) { //en cada pasada asigna al primer valor al correspondiente 
            if (Arrays.binarySearch(ganadora, numeroApuesta) >= 0) {
                numAciertos++;
            } //busca un valor 
        }
        return numAciertos;

    }

}
