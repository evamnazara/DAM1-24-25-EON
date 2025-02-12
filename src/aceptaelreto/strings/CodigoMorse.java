package strings;
import java.util.Scanner;

public class CodigoMorse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tabla de código Morse según la primera letra
        String[] morseAlfabeto = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        while (scanner.hasNextLine()) {
            String palabra = scanner.nextLine();
            if (palabra.isEmpty()) {
                break;
            }

            // Convertimos la palabra a código Morse siguiendo las reglas
            String codigoGenerado = generarCodigoMorse(palabra);

            // Identificar el índice de la primera letra en el alfabeto (A-Z)
            char primeraLetra = Character.toUpperCase(palabra.charAt(0));
            int indice = primeraLetra - 'A';
            String codigoEsperado = morseAlfabeto[indice];

            // Comparar el código generado con el esperado
            if (codigoGenerado.equals(codigoEsperado)) {
                System.out.println(palabra + " OK");
            } else {
                System.out.println(palabra + " X");
            }
        }

        scanner.close();
    }

    // Genera el código Morse según la palabra dada
    public static String generarCodigoMorse(String palabra) {
        String resultado = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));
            if (letra == 'o') {
                resultado += "-";  // 'o' se convierte en raya
            } else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'u') {
                resultado += ".";  // Otras vocales se convierten en punto
            }
        }

        return resultado;
    }
}



/* 
 * CODIGO MORSE

Aprendiendo el código Morse
Tiempo máximo: 1,000 s Memoria máxima: 4096 KiB
Todos hemos oído hablar del código o alfabeto Morse, que antiguamente servía para transmitir mensajes de telégrafo. El código consiste en la codificación de cada letra del abecedario con una sucesión de puntos y rayas que se traducen a señales auditivas cortas (puntos) o largas (rayas), siguiendo las transformaciones que se indican en la tabla.

Letra	Código		Letra	Código
A	.-		N	-.
B	-...		O	---
C	-.-.		P	.--.
D	-..		Q	--.-
E	.		R	.-.
F	..-.		S	...
G	--.		T	-
H	....		U	..-
I	..		V	...-
J	.---		W	.--
K	-.-		X	-..-
L	.-..		Y	-.--
M	--		Z	--..
El código, no obstante, es bastante complicado de aprender y utilizar. Por una parte hay que aprenderse los códigos de cada letra. Por otra, hay que añadir pausas entre cada símbolo, al existir codificaciones de letras que son prefijos de otras, y pausas más largas entre cada palabra, pues el "espacio" no tiene ningún código asociado.

Una guía de ayuda para aprenderse la tabla de codificación consiste en tener una palabra de referencia para cada letra. Así, por ejemplo, para la letra 'A' podemos memorizar Arco. La palabra elegida para cada letra debe comenzar por esa letra y ser tal que si cada vocal 'o' se sustituye por una raya, y el resto de vocales por un punto, el resultado final sea la codificación de la letra en cuestión.

A continuación aparecen algunos ejemplos de palabras que pueden utilizarse como palabras de referencia:

Letra	Palabra de referencia	Código
A	Arco	.-
B	Bogavante	-...
C	Corazones	-.-.
Ahora estamos haciendo una tabla nueva y tenemos que comprobar si, dada una palabra, podemos o no utilizarla como palabra de referencia.
Entrada

La entrada consiste en una serie de palabras de no más de 20 letras, cada una en una línea independiente. Cada palabra contendrá únicamente símbolos del alfabeto inglés ya sea en mayúscula o en minúscula. Las palabras no contendrán tildes (aunque eso implique no escribir correctamente la palabra).

Salida

Para cada palabra se mostrará en una línea independiente si puede ser utilizada como palabra de referencia según la descripción dada. En caso afirmativo se escribirá la palabra leída seguida de "OK". En caso negativo, tras la palabra se escribira "X".

Entrada de ejemplo

Arco
Corazones
ARBOLES
Salida de ejemplo

Arco OK
Corazones OK
ARBOLES X

*/