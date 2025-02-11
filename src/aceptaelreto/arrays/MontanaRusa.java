/*Montaña Rusa 
MontanaRusa.java 
En una montaña rusa, llamamos "pico" a un punto del recorrido que está más alto que el 
inmediatamente anterior y el inmediatamente siguiente.  
 
Implementa la siguiente función que acepta como parámetro de entrada un array con el 
registro de las alturas en metros del recorrido de una montaña rusa y devuelve el número de 
picos.  

Ten en cuenta que las montañas rusas son circulares, y el punto de inicio de la entrada 
¡podría ser un pico! 
 
Ejemplos: 
●  [4, 10, 3, 2] => 1 pico 
●  [10, 3, 2, 4] => 1 pico 
●  [4, 10, 10, 3, 2] => 0 picos 
 */

package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MontanaRusa {
    public static void main(String[] args) {
        int [] alturas = {4, 10, 10, 3, 2};
        System.out.println("Numero de picos: " + contarPicos(alturas));
        
    }

    public static int contarPicos(int[] alturas) {
        int pico = 0;

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > alturas[pico]) {
                pico = i;
            }
        }
        return  pico; 
    }


@Test 
void testContarPicos_CasoBase() { 
    int[] alturas = { 1, 2, 3, 2, 1 }; 
    assertEquals(1, contarPicos(alturas)); 
} 
 
@Test 
void testContarPicos_MultiplesPicos() { 
    int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 }; 
    assertEquals(2, contarPicos(alturas)); 
} 
 
@Test 
void testContarPicos_PicoAlFinal() { 
    int[] alturas = { 1, 2, 3, 4, 5 }; 
    assertEquals(1, contarPicos(alturas)); 
} 
 
@Test 
void testContarPicos_PicoEnInicio() { 
    int[] alturas = { 5, 4, 3, 2, 3, 4, 4 }; 
    assertEquals(1, contarPicos(alturas)); 
} 
 
@Test 
void testContarPicos_MontañaCircularSinPicos() { 
    int[] alturas = { 3, 2, 1, 2, 3 }; 
    assertEquals(0, contarPicos(alturas)); 
} 
 
@Test 
void testContarPicos_MontañaCircularConVariosPicos() { 
    int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 }; 
    assertEquals(2, contarPicos(alturas)); 
}
}