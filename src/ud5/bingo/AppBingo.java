package ud5.bingo;

import java.util.Scanner;

public class AppBingo {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BINGO");

        System.out.println("Introduce el número de jugadores:");
        int numJugadores = sc.nextInt();
        System.out.println("Jugarán " + numJugadores + " jugadores.");
        Jugador[] jugadores = new Jugador[numJugadores];

        System.out.println("\nIntroduce los datos de los jugadores:");
        
        for (int i = 1; i <= numJugadores; i++) {
            sc.nextLine(); //limpiar el bufer de entrada
            System.out.print("Nombre jugador " + i + ": ");
            String nombre = sc.nextLine();
            System.out.print("Número de cartones: ");
            int numCartones = sc.nextInt();
            System.out.println();

            Jugador jugador = new Jugador(nombre, numCartones);
            jugadores[i - 1] = jugador;
            System.out.println(jugador);
        }

        System.out.println("\nJUEGO: ");
        System.out.println("Escoge modalidad: \n(N: Número a número) \n(A: Automática)");
        int opcion = sc.nextLine().toUpperCase().charAt(0);

        switch (opcion) {
            case 'A': 
               // modoAutomatico();

                break;
        
            case 'N':
            //    modoNumeroANumero();

                break;

            default: 
            System.out.println("La opción es incorrecta");
        }

        sc.close();
    }

    
}
