/* E0307.
    Escribir todos los múltiplos de 7 menores que 100
*/

package ud2.exercicios.eon202411.ejerciciosbucles;

public class E0307_Multiplos7 {
    public static void main(String[] args) {
        int i = 1;
        int multiplo = i * 7 % 0;

        while (multiplo < 100) {
            System.out.println(multiplo);          
        }
    }
}
