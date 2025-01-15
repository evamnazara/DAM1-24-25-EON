/*E0511. 
Desarrollar el juego “la cámara secreta”, que consiste en abrir una cámara 
mediante su combinación secreta, que está formada por una combinación de dígitos del 1 
al 5. 
Al inicio el jugador especificará la longitud de la combinación, de modo que a mayor 
longitud, mayor será la dificultad del juego.  
La aplicación genera de forma aleatoria una combinación secreta que el usuario tendrá 
que acertar. En cada intento se muestra como pista, para cada dígito de la combinación 
introducido por el jugador, si es mayor, menor o igual que el que se encuentra en el 
mismo puesto en la combinación secreta.  
    CLAVE SECRETA: 3 3 4 4
    USER:          1 2 3 4
    SALIDA:        + + + =

    BUCLE:         2 3 4 4
                   + = = =
*/

package arraysejercicios.apuntes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0511_CamaraSecreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longCombinacion; //se pide por teclado
        
        System.out.println("JUEGO CÁMARA SECRETA: ");
        System.out.println("¿Cuántos dígitos va atener tu combinación?");

        longCombinacion = sc.nextInt();

        int [] combinacionSecreta = generarCombinacion(longCombinacion);
        //bucle controlado x condicion y de lectura adelantada

        int [] combinacionUsuario = leerCombinacion(longCombinacion);
        
        //MIENTRAS nos ean iguales; 
        while ( !Arrays.equals(combinacionSecreta, combinacionUsuario)) {
            mostrarPistas(combinacionSecreta, combinacionUsuario);
            //repite
            combinacionUsuario = leerCombinacion(longCombinacion);

        }

        System.out.println("ENHORABUENA!");

    }


    //metodos

    static int[] generarCombinacion(int longitud) {
        Random rnd = new Random();

        int[] combinacion = new int [longitud]; 

        for (int i = 0; i < combinacion.length ; i++) {
            combinacion[i] = rnd.nextInt(5) + 1; 

        }
        return combinacion;

    }

    static int[] leerCombinacion(int longitud) {
        Scanner sc = new Scanner(System.in);


        int[] combinacion = new int [longitud]; 

        System.out.println("Introduce los " + longitud + "dígitos de la combinación:"); 

        for(int i = 0; i < combinacion.length ; i++) {
            combinacion[i] = sc.nextInt();
            }

        return combinacion; 

    }

    static void mostrarPistas(int [] tSecreto, int [] tUsuario ) {
        for(int i = 0; i < tSecreto.length ; i++) {
            if (tSecreto[i] == tUsuario[i]) {
                System.out.println("=");
                } else if (tSecreto[i] > tUsuario[i]){
                    System.out.println(">");
                } else {
                System.out.println("<");
                }

            }
    
    
    }

}
        

