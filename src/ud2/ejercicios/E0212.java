/* E0212. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos). */

package ud2.ejercicios;

import java.util.*;

public class E0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.println("Introduce el anho: ");
        int anho = sc.nextInt();
        sc.close();

        if (anho > 0 && anho < 2025) {
            switch (mes) {
                case 1, 3, 5, 7, 10, 12: 
                    if (dia > 0 && dia < 32) {
                        System.out.println("Fecha válida.");
                    }

                break;

                case 2: 
                    if (dia > 0 && dia < 28 ) {
                        System.out.println("Fecha válida");
                    }
                
                case 4, 6, 8, 11: 
                    if (dia > 0 && dia < 31) {
                        System.out.println("Fecha válida");
                    }    
                default:
                    break;
            }
        } else {
            System.out.println("La fecha no es válida");
        }
        

    }
}
