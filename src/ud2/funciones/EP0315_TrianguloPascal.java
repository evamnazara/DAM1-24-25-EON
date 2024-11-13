/* EP0315_Triangulo_Pascal. Diseña una aplicación que dibuje el triángulo de Pascal, para n
filas. Numerando las filas y elementos desde 0, la fórmula para obtener el m-ésimo
elemento de la n-ésima fila es
E(n, m) = n! / m!(n - m)!
Donde n! es el factorial de n.
Un ejemplo de triángulo de Pascal con 5 filas (n = 4) es :1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */

package ud2.funciones;

public class EP0315_TrianguloPascal {

    public static void trianguloPascal (int num) {
        for (int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                long valor = factorial(i) / factorial(j) * factorial (i -j);
                //j <= que 0 porque necesitas que entre en el bucle al menos 1 vez 
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static long factorial (int n) {
       if (n == 0) {
            return 1;
       } else {
        return n * factorial (n-1);
       }
    }

    public static void main(String[] args) {
        trianguloPascal(10);
    }
}
