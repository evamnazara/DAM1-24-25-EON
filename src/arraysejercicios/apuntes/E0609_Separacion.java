/*E0609. Introducir por teclado una frase, palabra a palabra, y mostrar la frase completa 
separando las palabras introducidas con espacios en blanco. Terminar de leer la frase 
cuando alguna de las palabras introducidas sea la cadena “fin” escrita con cualquier 
combinación de mayúsculas y minúsculas. La cadena “fin” no aparecerá en la frase final.  */

package arraysejercicios.apuntes;

import java.util.Scanner;

public class E0609_Separacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";

        System.out.println("Introduce palabras separadas por ENTER para componer una frase.");
        System.out.println("Escribe \"fin\" para terminar.");
        
        String palabra = sc.nextLine();

        while (!palabra.toUpperCase().equals("FIN")) {
            frase += palabra + " ";

            palabra = sc.nextLine();
            
        }
        frase.stripTrailing(); //quita el ultimo " " 
        System.out.println(frase);
        sc.close();
    }
}
