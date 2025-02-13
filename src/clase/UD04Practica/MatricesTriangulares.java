/*Una matriz cuadrada, es decir que tiene el mismo número de ﬁlas que de columnas, es 
triangular cuando todos los valores que están por encima o por debajo de la diagonal principal son cero. También son triangulares aquellas matrices que cumplen estas dos condiciones a la 
vez. 
 
Implementa la siguiente función que indique si una matriz es triangular: 
 
public static Boolean esTriangular(int[][] t);  */

package clase.UD04Practica;

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
 
public class MatricesTriangulares { 
 
    // Método estático que estamos probando 
    public static Boolean esTriangular(int[][] t) {

        if (t ==null || t.length == 0)
                return false;
        if (t[0].length == 1)
            return true; 


            //COMPRUEBA SI ES CUADRADA > si no es cuadrada no es triangular
            for (int i = 0; i < t.length; i++) {
                if (t[i].length != t.length) {
                    return false;}

                }

            //TRIANGULAR INFERIOR: empieza en la segunda fila de la matriz
            boolean esTriangularSuperior = true;
            for (int i = 1; i < t.length; i++) {
                for (int j = 0; j < i; j++ ) {
                        if (t[i][j] == 0) {
                            esTriangularSuperior = false;
                            break;
                             //OPCIONAL: rompe cuando encuentra un numero que no es 0
                            }
                    }

             }
            
            if (esTriangularSuperior) {
                return true;
                }
                //PERO SI NO LO ES, CONTINUA EL ALGORITMO >> AUN PUEDE SER TRIANGULAR SUPERIOR


            //empieza en la segunda fila de la matriz
            boolean esTriangularInferior = true;
            for (int i = 1; i < t.length; i++) {
                for (int j = 0; j < t.length; j++ ) {
                        if (t[i][j] != 0) {
                            esTriangularInferior = false;
                            break; //OPCIONAL: rompe en el momento en que encuentra un numero que no es 0    
                        }
                }

            }
            return esTriangularInferior;

        } 
 
    // 1. Matriz triangular superior 
    @Test 
    public void testMatrizTriangularSuperior() { 
        int[][] matrizTriangularSuperior = { 
            {1, 2, 3}, //i = 0
            {0, 4, 5}, //i = 1
            {0, 0, 6}  //i = 2
        }; 
        assertTrue(esTriangular(matrizTriangularSuperior)); 
    } 
 
    // 2. Matriz triangular inferior 
    @Test 
    public void testMatrizTriangularInferior() { 
        int[][] matrizTriangularInferior = { 
            {1, 0, 0}, 
            {4, 5, 0}, 
            {7, 8, 9} 
        }; 
        assertTrue(esTriangular(matrizTriangularInferior)); 
    } 
 
    // 3. Matriz no triangular (con elementos fuera de la diagonal) 
    @Test 
    public void testMatrizNoTriangular() { 
        int[][] matrizNoTriangular = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        }; 
        assertFalse(esTriangular(matrizNoTriangular)); 
    } 
 
    // 4. Matriz de tamaño 1x1 (triangular trivial) 
    @Test 
    public void testMatriz1x1() { 
        int[][] matriz1x1 = { 
            {1} 
        };         assertTrue(esTriangular(matriz1x1)); 
    } 
 
    // 5. Matriz vacía => false 
    @Test 
    public void testMatrizVacia() { 
        int[][] matrizVacia = {}; 
        assertFalse(esTriangular(matrizVacia));  
    } 
 
    // 6. Matriz con valores nulos (null) = false 
    @Test 
    public void testMatrizNula() { 
        int[][] matrizNula = null; 
        assertFalse(esTriangular(matrizNula));  
    } 
 
    // 7. Matriz rectangular (no cuadrada) 
    @Test 
    public void testMatrizRectangular() { 
        int[][] matrizRectangular = { 
            {1, 2}, 
            {3, 4}, 
            {5, 6} 
        }; 
        assertFalse(esTriangular(matrizRectangular)); 
    } 
 
    // 8. Matriz triangular superior con elementos cero en la diagonal 
    @Test 
    public void testMatrizTriangularSuperiorCero() { 
        int[][] matrizTriangularSuperiorCero = { 
            {0, 2, 3}, 
            {0, 0, 5}, 
            {0, 0, 0} 
        }; 
        assertTrue(esTriangular(matrizTriangularSuperiorCero)); 
    } 
 
    // 9. Matriz triangular inferior con elementos cero en la diagonal 
    @Test 
    public void testMatrizTriangularInferiorCero() { 
        int[][] matrizTriangularInferiorCero = { 
            {0, 0, 0}, 
            {4, 0, 0}, 
            {7, 8, 0} 
        }; 
        assertTrue(esTriangular(matrizTriangularInferiorCero)); 
    } 
 
    // 10. Matriz triangular superior con valores fuera de la diagonal principal 
    @Test 
    public void testMatrizIncorrecta() { 
        int[][] matrizIncorrecta = { 
            {1, 0, 3}, 
            {0, 2, 0}, 
            {0, 0, 4} 
        }; 
        assertFalse(esTriangular(matrizIncorrecta)); 
    } 
} 

/*public class MatricesTriangulares {
    public static void main(String[] args) {
        int [][] matriz1 = {
            {1, 2},
            {5, 6, 7},

        };
        
        int [][] matriz2 = {
            {1, 2, 3},
            {6, 7, 8},
            };

        
        
        System.out.println(esCuadrada(matriz2));
        esTriangular(matriz2);

    }

    public static Boolean esCuadrada(int[][] m) {
        //recorrer la matriz fila fila 
        int longitudFila1 = 0;
        int longitudFila2 = 0;
        
        for(int i = 0; i < m.length; i++){
            longitudFila1 ++;
            for(int j = 0; j < m[i].length; j++) {
                longitudFila2++;
            }
        }
        System.out.println(longitudFila1);
        System.out.println(longitudFila2);
        
        if (longitudFila1 == longitudFila2) {
            System.out.println("Matriz cuadrada."); }
        
        
        if (m ==null || m.length == 0)
                return null;
                return null;
        
       
    }

    public static Boolean esTriangular(int[][] t) {
        if (t ==null || t.length == 0)
            return false;
        
        return null;
    }
    
}


*/