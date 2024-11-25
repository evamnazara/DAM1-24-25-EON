package ud2.practicas;

import java.util.Random;

public class Dado {

    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 1000;

        lanzarDado(NUM_LANZAMIENTOS);
    }

    private static void lanzarDado(int numLanzamientos) {
        Random random = new Random();
        
        int cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;
        
        for (int i = 0; i < numLanzamientos; i++) {
            int caraDado = random.nextInt(6) + 1;

            switch (caraDado) {
                case 1: cara1++; break;
                case 2: cara2++; break;
                case 3: cara3++; break;
                case 4: cara4++; break;
                case 5: cara5++; break;
                case 6: cara6++; break;
            }
            estadisticaResultados(cara1, cara2, cara3, cara4, cara5, cara6, numLanzamientos);

        }
        
    }

    private static void estadisticaResultados(int cara1, int cara2, int cara3, int cara4, int cara5, int cara6, int numLanzamientos) {
        System.out.println("LANZANDO UN DADO 1000 VECES: ");

        System.out.printf("Ha salido 1: %d veces (%.1f%%)%n", cara1, (cara1 * 100.0) / numLanzamientos);
        System.out.printf("Ha salido 2: %d veces (%.2f%%)%n", cara2, (cara2 * 100.0) / numLanzamientos);
        System.out.printf("Ha salido 3: %d veces (%.2f%%)%n", cara3, (cara3 * 100.0) / numLanzamientos);
        System.out.printf("Ha salido 4: %d veces (%.2f%%)%n", cara4, (cara4 * 100.0) / numLanzamientos);
        System.out.printf("Ha salido 5: %d veces (%.2f%%)%n", cara5, (cara5 * 100.0) / numLanzamientos);
        System.out.printf("Ha salido 6: %d veces (%.2f%%)%n", cara6, (cara6 * 100.0) / numLanzamientos);
    }
}
