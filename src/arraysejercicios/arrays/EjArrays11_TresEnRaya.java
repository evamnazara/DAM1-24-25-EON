/* EjArrays11. 
Escribe un programa en Java que implemente 
un juego de tres en raya. 
El programa debe permitir a dos jugadores jugar
 al juego turnándose para colocar fichas en un tablero de 3x3. 
El juego termina cuando un jugador consigue tres fichas en línea (horizontal, vertical o diagonal)
*/

package arraysejercicios.arrays;
import java.util.Scanner;


public class EjArrays11_TresEnRaya {
    public static void main(String[] args) {
        // Crear un tablero 3x3 representado como un arreglo bidimensional
        char[][] tablero = new char[3][3];
        // Inicializamos el tablero con valores vacíos ('-')
        inicializarTablero(tablero);

        boolean juegoTerminado = false; 
        char jugadorActual = 'X'; //primer jugador empieza con 'X'
        Scanner sc = new Scanner(System.in); // Para leer la entrada del usuario

        // Bucle principal del juego
        while (!juegoTerminado) {
            // Mostrar el tablero actual
            imprimirTablero(tablero);

            // Indicar de quién es el turno
            System.out.println("Turno del jugador " + jugadorActual);
            // Pedir al usuario la fila y columna donde desea jugar
            System.out.println("Ingresa fila (0, 1, 2): ");
            int fila = sc.nextInt();
            System.out.println("Ingresa columna (0, 1, 2): ");
            int columna = sc.nextInt();

            // Validar si la posición es válida y está disponible
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                // Colocar la ficha del jugador actual en el tablero
                tablero[fila][columna] = jugadorActual;

                // Verificar si el jugador actual ha ganado
                if (verificarGanador(tablero, jugadorActual)) {
                    imprimirTablero(tablero); // Mostrar el tablero final
                    System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true; // Terminar el juego
                } 
                // Verificar si el tablero está lleno y es un empate
                else if (esEmpate(tablero)) {
                    imprimirTablero(tablero); // Mostrar el tablero final
                    System.out.println("¡Es un empate!");
                    juegoTerminado = true; // Terminar el juego
                } 
                // Si nadie gana, cambiar el turno al otro jugador
                else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                // Si la posición no es válida, mostrar un mensaje de error
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }

        sc.close(); // Cerrar el scanner
    }

    // Función para inicializar el tablero con valores vacíos ('-')
    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-'; // Cada posición del tablero se llena con '-'
            }
        }
    }

    // Función para imprimir el tablero actual
    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " "); // Imprime cada casilla separada por un espacio
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    // Función para verificar si un jugador ha ganado
    public static boolean verificarGanador(char[][] tablero, char jugador) {
        // Verificar todas las filas y columnas
        for (int i = 0; i < 3; i++) {
            // Si alguna fila tiene las 3 fichas del mismo jugador
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) || 
                // Si alguna columna tiene las 3 fichas del mismo jugador
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true; // Hay un ganador
            }
        }

        // Verificar las diagonales
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) || 
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true; // Hay un ganador
        }

        return false; // No hay ganador aún
    }

    // Función para verificar si el tablero está lleno (empate)
    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false; // Si hay al menos una casilla vacía, no es empate
                }
            }
        }
        return true; // Si no hay casillas vacías, es un empate
    }
}