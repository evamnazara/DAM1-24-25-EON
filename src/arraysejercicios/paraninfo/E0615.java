/* E0615. Modificar la Actividad E0614 para que el programa indique al jugador 2 cuántas 
letras coinciden (son iguales y están en la misma posición) entre el texto introducido por 
él y el original.  */



package arraysejercicios.paraninfo;
//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
    
public class E0615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String palabra;
            
        do {
            System.out.println("Escribe tu palabra: ");
            palabra = sc.nextLine();

            if (palabra == "") {
                 System.out.println("La palabra no puede estar vacía. Introduce tu palabra de nuevo.");
                }

        } while (palabra.isEmpty());


        //anagrama 
        char[] anagrama = desordenarPalabra(palabra);
        System.out.println(String.valueOf(anagrama));

        System.out.println("Introduce tu propuesta de palabra: ");
        String propuestaUsuario = sc.nextLine();
    
        while (! propuestaUsuario.equals(palabra)) {
            System.out.println("Has fallado! Te ofrecemos una pista a continuación:");
            System.out.println(pista(palabra, propuestaUsuario)); 
            propuestaUsuario = sc.nextLine();
            
        }

        if (propuestaUsuario.equals(palabra)) 
            System.out.println("¡Has acertado!");
            
                
        
        sc.close();

        }
           
        private static char[] desordenarPalabra(String palabra) {
            Random rnd = new Random();
            //Random rnd = new Random(0); 
            //si hace falta para pruebas, poniendo semilla se desordena siempre igual

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

         
        private static int pista (String palabraOriginal, String propuestaUsuario) {
            char[] original = palabraOriginal.toCharArray();
            char[] propuesta = propuestaUsuario.toCharArray();
            int coincidencias = 0;

            int repeticiones = Math.min(palabraOriginal.length(),propuestaUsuario.length());
            System.out.println(original);
            System.out.println(propuesta); 

            if (palabraOriginal.length() != palabraOriginal.length()) {
                System.out.println("Las palabras deben tener la misma longitud.");
            } 

            for(int i = 0; i < repeticiones; i++){
                if (palabraOriginal.charAt(i) == propuestaUsuario.charAt(i)) {
                    coincidencias++;
                }

            }
            System.out.println("Numero de coincidencias: ");
        return coincidencias;
        }
    }
