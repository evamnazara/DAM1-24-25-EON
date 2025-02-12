/*
E0614. Implementar el juego del anagrama, que consiste en que un jugador escribe una 
palabra y la aplicación muestra un anagrama (cambio del orden de los caracteres) 
generado al azar. 
A continuación, otro jugador tiene que acertar cuál es el texto original. La aplicación no 
debe permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por ejemplo, 
si el jugador 1 escribe “teclado”, la aplicación muestra como pista un anagrama al azar, 
como por ejemplo: “etcloda”. 
 
 
E0615. Modificar la Actividad E0614 para que el programa indique al jugador 2 cuántas 
letras coinciden (son iguales y están en la misma posición) entre el texto introducido por 
él y el original.  */

package arraysejercicios.paraninfo;
import java.util.Random;
import java.util.Scanner;
    
public class E0614_JuegoAnagramas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String palabra;
            
        do {
            System.out.println("Escribe tu palabra: ");
            palabra = sc.nextLine();
            if (palabra.isEmpty()) {
                 System.out.println("La palabra no puede estar vacía. Inténtalo de nuevo.");
            }
        } while (palabra.isEmpty());
            
            char[] palabraDesordenada = desordenarPalabra(palabra);

            System.out.println(String.valueOf(palabraDesordenada));

            System.out.println("Introduce tu propuesta de palabra: ");
            String propuestaUsuario = sc.nextLine();
    
            if (propuestaUsuario.equals(palabra)) {
                System.out.println("¡Acertaste!");
            } else {
                System.out.println("¡Has fallado! La palabra correcta era: " + palabra);
            }
        
            sc.close();
        }
           
        private static char[] desordenarPalabra(String palabra) {
            Random rnd = new Random();
            char[] palabraDesordenada = palabra.toCharArray();
    
            for (int i = 0; i < palabraDesordenada.length; i++) {
                int nuevaPosicion = rnd.nextInt(palabraDesordenada.length);            
                // Intercambia letras
                char auxiliar = palabraDesordenada[i];
                palabraDesordenada[i] = palabraDesordenada[nuevaPosicion];
                palabraDesordenada[nuevaPosicion] = auxiliar;
            }
            return palabraDesordenada;
        }
    }
