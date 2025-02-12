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

package clase;

import java.util.Random;

public class ConceptosProgramacion {

    public static String[] conceptos = {
        "Algoritmo",
        "Lenguaje de programación",
        "Entorno de desarrollo",
        "Compilación",
        "Ejecución",
        "Código fuente",
        "Bytecode",
        "Código objeto"
    };

    public static void main(String[] args) {
        String conceptoAleatorio = fraseAleatoria(conceptos);
        System.out.println("Define el siguiente concepto: " + conceptoAleatorio);
    }


    static String fraseAleatoria(String[] t) {
        Random rnd = new Random(); 
        int indiceAleatorio = rnd.nextInt(t.length); 
        //ALTERNATIVA: indiceAleatorio = (int) (Math.random() * t.length);

        return t[indiceAleatorio]; 
        //RESUMIDA: return t[(int) (Math.random() * t.length)];
    }

}
    



