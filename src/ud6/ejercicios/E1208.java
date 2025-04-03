/*E1208. Implementar un programa en el que se insertan 20 números aleatorios en una colección. Ésta se ordenará de menor a mayor convirtiéndola antes en table y volviéndola 
a convertir en colección. Repetir el proceso para ordenarla de mayor a menor.  */

package ud6.ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1208 {
    public static void main(String[] args) {
        Collection <Integer> numeros = new ArrayList<>();
    Random rnd = new Random();

    for (int i = 0; i < 20; i++) {
            numeros.add(rnd.nextInt());
        }
        System.out.println(numeros);
    }

}

       

