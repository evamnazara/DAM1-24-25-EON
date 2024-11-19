//EP0413. Crea la función muestraPares(int n) que muestre por consola los primeros n números pares.

package ud2.exercicios.eon202411.ejerciciosfunciones;


//spoiler no funciona
public class EP0413_muestraPares {

    public static int muestraPares (int n) {
        for (int i = 1; i < n; i++ ) {
            while ( i % 2 == 0 ) {
                System.out.println(i);
            }
        }
        return n;
    }
    public static void main(String[] args) {

        int n = 6;

        System.out.println(muestraPares(n));
        
    }
}
