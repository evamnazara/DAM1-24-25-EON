/* Diseñar un programa que simule el lanzamiento de un dado de 6 caras un número de veces
codificado como una constante NUM_LANZAMIENTOS.
El programa mostrará una estadística final que recoja el número de veces que ha salido cada cara
del dado y el porcentaje sobre el total de lanzamientos.
El porcentaje se mostrará como un número entero o como un número real con un máximo de 2
decimales, con una salida por pantalle similar a la siguiente: */

package ud2.practicas;

import java.util.Random;

public class Dado {

    // Constante para el número de lanzamientos
    private static final int NUM_LANZAMIENTOS = 1000;

    public static void main(String[] args) {
        System.out.println("=== SIMULACIÓN DE LANZAMIENTO DE DADO ===");

        int[] resultados = simularLanzamientos();
        mostrarEstadisticas(resultados);
    }

    // Función que simula los lanzamientos del dado
    private static int[] simularLanzamientos() {
        Random random = new Random();
        int[] conteo = new int[6]; // Array para almacenar el conteo de cada cara (1 a 6)

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int cara = random.nextInt(6) + 1; // Generar un número aleatorio entre 1 y 6
            conteo[cara - 1]++; // Incrementar el conteo correspondiente
        }

        return conteo;
    }

    // Función que muestra las estadísticas de los lanzamientos
    private static void mostrarEstadisticas(int[] resultados) {
        System.out.println("=== ESTADÍSTICAS DE LOS LANZAMIENTOS ===");
        for (int i = 0; i < resultados.length; i++) {
            int conteo = resultados[i];
            double porcentaje = ((double) conteo / NUM_LANZAMIENTOS) * 100;

            System.out.printf("Cara %d: %d veces (%.2f%%)%n", i + 1, conteo, porcentaje);
        }
        System.out.println("========================================");
    }
}

