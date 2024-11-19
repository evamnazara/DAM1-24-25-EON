// E0310. Diseñar un programa que muestre la suma de los 10 primeros números impares.

package ud2.exercicios.eon202411.ejerciciosbucles;

public class E0310_SumaImpar {
    public static void main(String[] args) {
        int num_repeticiones = 10;
        int n = 2;

        for (int i = 0; i < num_repeticiones; i++ ) {
            System.out.println(n);
            n += 3; //multiplos de 3 
        }
    }
    
}
