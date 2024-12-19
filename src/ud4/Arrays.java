/* TresTablas. 
Crea tres tablas de cinco elementos: la primera de números enteros, la segunda de double y la tercera de booleanos. Muestra las referencias en las que se encuentra almacenada cada una de las tablas. */

package ud4;

public class Arrays {
    public static void main(String[] args) {
        //o tablaInt[] = {valor1,2,3...}

        int tablaInt[] = new int[5];
        
        tablaInt[0] = 4;
        tablaInt[1] = 9;
        tablaInt[2] = 7;
        tablaInt[3] = 3;
        tablaInt[4] = 1;

        System.out.println(tablaInt[0]);

    }
}
