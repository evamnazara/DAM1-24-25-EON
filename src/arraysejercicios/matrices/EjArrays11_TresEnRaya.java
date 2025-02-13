/* EjArrays11. 
Escribe un programa en Java que implemente 
un juego de tres en raya. 
El programa debe permitir a dos jugadores jugar
 al juego turnándose para colocar fichas en un tablero de 3x3. 
El juego termina cuando un jugador consigue tres fichas en línea (horizontal, vertical o diagonal)
*/

package arraysejercicios.matrices;
import java.util.Scanner;


public class EjArrays11_TresEnRaya {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        inicializarTablero(tablero);

        boolean juegoTerminado = false; 
        char jugadorActual = 'X';
        Scanner sc = new Scanner(System.in); 

        while (!juegoTerminado) {
            imprimirTablero(tablero);

            System.out.println("Turno del jugador " + jugadorActual);

            System.out.println("Ingresa fila (0, 1, 2): ");
            int fila = sc.nextInt();
            System.out.println("Ingresa columna (0, 1, 2): ");
            int columna = sc.nextInt();

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                tablero[fila][columna] = jugadorActual;

                if (verificarGanador(tablero, jugadorActual)) {
                    imprimirTablero(tablero); 
                    System.out.println("El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true; 
                } 

                else if (esEmpate(tablero)) {
                    imprimirTablero(tablero); 
                    System.out.println("¡empate!");
                    juegoTerminado = true; 
                } 
                else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }

        sc.close(); // Cerrar el scanner
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-'; 
            }
        }
    }

    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " "); // Imprime cada casilla separada por un espacio
            }
            System.out.println();
        }
    }

    public static boolean verificarGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) || 
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) || 
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true; 
        }

        return false; 
    }

    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true; 
    }
}