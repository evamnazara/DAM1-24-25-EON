//EjArrays04. Guardar en un array los 20 primeros números pares.

package arraysejercicios.arrays;


public class EjArrays04 {
    public static void main(String[] args) {

        int[] numerosEnteros = new int[20];
        
        System.out.println("Primeros 20 números pares:");

        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = (i + 1) * 2; 
            System.out.println(numerosEnteros[i]);

        }

    }
}