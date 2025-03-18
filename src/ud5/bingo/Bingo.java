package ud5.bingo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Realiza un programa que simule un Bingo.
El bombo contendrá números entre 1 y 99.
Podrán jugar un número indeterminado de jugadores.
Cada jugador podrá jugar hasta 5 cartones.
Cada cartón está compuesto por 3 filas por 5 columnas de números aleatorios no repetidos.
 */
public class Bingo {
   
    static final int NUMERO_MAXIMO= 99;
    static Jugador [] jugadores;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BINGO");

        System.out.println("Introduce el número de jugadores:");
        int numJugadores = sc.nextInt();
        System.out.println("Jugarán " + numJugadores + " jugadores.");
        jugadores = new Jugador[numJugadores];
        sc.nextLine(); //limpiar el bufer de entrada



        System.out.println("\nIntroduce los datos de los jugadores:");
        for (int i = 0; i < numJugadores; i++) {
            sc.nextLine(); //limpiar el bufer de entrada
            System.out.println("Nombre jugador: " );
            String nombre = sc.nextLine();
    
            System.out.println("Número de cartones: ");
            int numeroCartones = sc.nextInt();
            System.out.println("Nombre: " + nombre + "\nCartones jugados: " + numJugadores);
            sc.nextLine(); //limpiar el bufer de entrada

            Jugador jugador = new Jugador(nombre, numeroCartones);
            jugadores[i - 1] = jugador;
            System.out.println(jugador);
        }
        System.out.println("\nJUEGO: ");
        System.out.println("Escoge modalidad: \n(N: Número a número) \n(A: Automática)");
        int opcion = sc.nextLine().toUpperCase().charAt(0);

        switch (opcion) {
            case 'A': 
                //modoAutomatico();

                break;
        
            case 'N':
                //modoNumeroANumero();

                break;

            default: 
            System.out.println("La opción es incorrecta");
        }

    }



}

class Carton {
    static final int MAXIMO_FILAS = 3;
    static final int MAXIMO_COLUMNAS = 5;

    int[][] numerosCarton;

    public int [][] generarCarton() {
        //FALTA QUE LOS NUMEROS NOE STEN REPETIDOS
        Random rnd = new Random();
        this.numerosCarton = new int [MAXIMO_FILAS][MAXIMO_COLUMNAS];

        for (int i = 0; i < MAXIMO_FILAS; i++) {
            for (int j = 0; j < MAXIMO_COLUMNAS; j++) {
                numerosCarton[i][j] = rnd.nextInt(Bingo.NUMERO_MAXIMO) + 1;
            }
        }
        System.out.println(Arrays.deepToString(numerosCarton));
        return numerosCarton;
    }

}

class Jugador {
    String nombre;
    int cartonesJugados;
    Carton[] cartones;


    public Jugador(String nombre, int cartonesJugados) {
        this.nombre = nombre;
        this.cartonesJugados = cartonesJugados;

    }


    @Override
    public String toString() {
        return "Jugador: " + nombre + "(" + cartonesJugados + " cartones.)"
                + Arrays.toString(cartones) + "]";
    }


}