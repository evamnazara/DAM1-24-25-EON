package ud4.apuntes;

import java.util.Arrays;

public class InsertarOrdenado {
    public static void main(String[] args) {
        int [] t = {5, 2, 7, 9, 4, 1, 8, 5, 4, 2, 8}; //array aleatorio
        
        Arrays.sort(t);

        System.out.println(Arrays.toString(t));

        int valor = -12;
        t = insertarOrdenado(t, valor);
        System.out.println(Arrays.toString(t));

    }

    static public int[] insertarOrdenado(int[] t, int num) {

        int[] tResultante = new int[t.length + 1]; 
        
        int posicion = Arrays.binarySearch(t, num);

        if (posicion < 0 ){
            posicion = -posicion -1; 
                //comprueba si el numero no está
                //nos lo tenemos que creer
                //si pasas el -12, hace 12 - 1 = 11 
            }

                        //le pasas t, empieza en 0, copia en tabla resultante, posicion +1 en la t2
                        //si pasas el 3, copia las posiciones 0 1 2, y lo inserta en la posicion 3
        System.arraycopy(t, 0, tResultante, 0, posicion);
        tResultante[posicion] = num; 
        System.arraycopy(t, posicion, tResultante, posicion + 1, t.length - posicion);


        return tResultante;
    }
}
