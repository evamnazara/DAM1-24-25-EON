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


package arraysejercicios.apuntes;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0614_JuegoAnagramas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra; 
        System.out.println("Escribe tu palabra: ");
        palabra = sc.nextLine();

        char[] palabraDesordenada = desordenarPalabra(palabra);

        System.out.println(palabraDesordenada);
        
        char [] propuestaUsuario = leerPalabra(palabra);
                
                
                
                
            sc.close();
        }
                
        
    private static char[] leerPalabra(String palabra) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu propuesta de palabra:"); 


        
        return null; 
    }
        
        
    static char[] desordenarPalabra(String palabra) {
        Random rnd = new Random();
        char [] palabraDesordenada = palabra.toCharArray();

        for (int i = 0; i < palabraDesordenada.length; i++) {
            int nuevaPosicion = rnd.nextInt(palabraDesordenada.length);            
            int auxiliar = palabraDesordenada[i];

            palabraDesordenada[i] = palabraDesordenada[nuevaPosicion];
            palabraDesordenada[nuevaPosicion] = (char) auxiliar;

        }
        return palabraDesordenada;
        
    }

}
