/** 
    operadores aritméticos (pueden ser enteros o reales):
    + - * / % (resto de division) 

    operadores lógicos:
    && AND - verdadero si ambos se complen
    || OR - verdadero si alguno se cumple
    ! NOT - invierte el valor pasado

    incrementacion: 
    + - ++ -- ~ !

    tiene que coincidir el tipo de dato
*/

package Identificadores;

public class operaciones {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.0; /* si no se pone el .0, java lo interpreta como entero */

        System.out.println(a / b);
    }
    
}
