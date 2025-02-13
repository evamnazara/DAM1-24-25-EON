//Eva Otero Názara
package ud4.eonexamen;

public class ComplejidadCiclomatica {
    public static void main(String[] args) {
        int[][] grafo1 = { 
            {1}, 
            {3, 5}, 
            {1}, 
            {2, 4}, 
            {6}, 
            {6}, 
            {} 
        }; 

        int[][] grafo2 = { 
            {1, 6}, 
            {2, 5}, 
            {3, 4}, 
            {4}, 
            {1}, 
            {0}, 
            {} 
        }; 

        System.out.println(complejidadCiclomatica(grafo1));
        System.out.println(complejidadCiclomatica(grafo2));
    }

    static int complejidadCiclomatica(int[][] grafo) {
        int numero = 0;

        return numero;
    };
}