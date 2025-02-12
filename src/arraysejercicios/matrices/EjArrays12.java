/*EjArrays12. Crea una función que determine si una matriz dada es una matriz identidad.*/
  package arraysejercicios.matrices;
  import java.util.*;
  
  public class EjArrays12 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int[][] matriz = new int[3][3];
  
          System.out.println("Introduce los elementos de una matriz 3x3:");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print("Elemento en posición [" + i + "][" + j + "]: ");
                  matriz[i][j] = sc.nextInt();
              }
          }
  
          if (esMatrizIdentidad(matriz)) {
              System.out.println("La matriz es una matriz identidad.");
          } else {
              System.out.println("La matriz NO es una matriz identidad.");
          }
  
          sc.close();
      }
  
      public static boolean esMatrizIdentidad(int[][] matriz) {
          if (matriz.length != matriz[0].length) {
              return false;
          }
          
          for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[i].length; j++) {
                  if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                      return false;
                  }
              }
          }
          return true;
      }
  }
  