/*MARCADO. EjArrays13. Una matriz diagonal es una matriz cuadrada cuyos elementos fuera de la diagonal principal son todos cero. 
Ejemplo de una matriz de tamaño 3×3:
[ 6 0 0
  0 7 0 
  0 0 4 ]

Crea una función que determine si una matriz dada es una matriz diagonal. La función devolverá true si la matriz de números enteros que se le pasa como parámetro es una matriz diagonal, y false en cualquier otro caso. Utiliza el siguiente prototipo para implementar la función:

        boolean esDiagonal(int[][] t);


        Pruebas que deberá pasar la función:
  */
  package arraysejercicios.arrays;

  import org.junit.Test;
  import static org.junit.Assert.*;
  
  public class EjArrays13 {
      public static void main(String[] args) {
          int[][] matriz = {
              {6, 0, 0},
              {0, 7, 0},
              {0, 0, 4}
          };
          System.out.println("¿Es matriz diagonal? " + esDiagonal(matriz));
      }
  
      public static boolean esDiagonal(int[][] t) {
          if (t == null || t.length == 0 || t.length != t[0].length) {
              return false;
          }
          for (int i = 0; i < t.length; i++) {
              for (int j = 0; j < t[i].length; j++) {
                  if (i != j && t[i][j] != 0) {
                      return false;
                  }
              }
          }
          return true;
      }
  
      @Test
      public void pruebaMatrizDiagonal() {
          int[][] matriz = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}};
          assertTrue(esDiagonal(matriz));
      }
  
      @Test
      public void pruebaMatrizNoDiagonal() {
          int[][] matriz = {{1, 0, 0}, {0, 2, 0}, {0, 1, 3}};
          assertFalse(esDiagonal(matriz));
      }
  
      @Test
      public void pruebaMatrizNoCuadrada() {
          int[][] matriz = {{1, 0, 0}, {0, 2, 0}};
          assertFalse(esDiagonal(matriz));
      }
  
      @Test
      public void pruebaMatrizNoCuadrada2() {
          int[][] matriz = {{1, 0}, {0, 2}, {0, 0}};
          assertFalse(esDiagonal(matriz));
      }
  
      @Test
      public void pruebaMatrizVacia() {
          int[][] matriz = {};
          assertFalse(esDiagonal(matriz));
      }
  
      @Test
      public void pruebaMatrizNull() {
          int[][] matriz = null;
          assertFalse(esDiagonal(matriz));
      }
  }
  