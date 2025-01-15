/*Los siguientes términos corresponden a conceptos que el alumnado de programación en 
Java debe conocer:  
 
"Algoritmo", 
"Lenguaje de programación", "Entorno de desarrollo", 
"Compilación", 
"Ejecución", 
"Código fuente", 
"Bytecode", 
"Código objeto" 
 
Realiza un programa que almacene los términos anteriores en un array de datos de tipo 
String y que muestre uno de ellos por pantalla elegido al azar.  
 
Para ello implementa una función que devuelva uno de los términos del array elegido al 
azar, con el siguiente prototipo: 
 
static String fraseAleatoria(String[] t)  */

package arraysejercicios;

import java.util.*;

public class ConceptosProgramacion {

    public static String[] conceptos = { 
            "Algoritmo", 
            "Lenguaje de programación", 
            "Entorno de desarrollo", 
            "Compilación", 
            "Ejecución", 
            "Código fuente", 
            "Bytecode", 
            "Código objeto" };
    
    public static void main(String[] args) {
            desordenar(conceptos);
            for (int i = 0; i < conceptos.length; i++) {
                    System.out.println((i + 1) + ". " + conceptos[i]);
                }

            System.out.println("Te ha " + conceptos[3]);
    }

        

    

    static void desordenar(String t[]) {
        Random rnd = new Random(10);
            for (int i = 0; i < t.length; i++) {
                int nuevaPosicion = rnd.nextInt(t.length);
                if (i != nuevaPosicion) {
                    String aux = t[i];
                        t[i] = t[nuevaPosicion];
                        t[nuevaPosicion] = aux;
                    }
                }
            }

}
    



