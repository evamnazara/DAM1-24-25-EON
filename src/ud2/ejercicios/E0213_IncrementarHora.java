/* E0213. Escribir un programa que pida una hora de la siguiente forma: hora, minutos y
segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
hora actual (10:41:59) => hora actual + 1 segundo (10:42:00) */

package ud2.ejercicios;

import java.util.Scanner;

public class E0213_IncrementarHora {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el segundo: ");
        int segundo = sc.nextInt();

        System.out.println("Introduce el minuto: ");
        int minuto = sc.nextInt();

        System.out.println("Introduce la hora: ");
        int hora = sc.nextInt();
        sc.close();

        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;

            if (minuto == 60) {
                minuto = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                    
                }

            }

        }

        // if (minuto > 0 && minuto < 60) {
        //     if (minuto == 59) {
        //         hora++;
        //         minuto = 0;
        //     }
        //     else {
        //      minuto++;
        //     }
        // }

        


        System.out.println("Hora: " + hora + " Minuto: " + minuto + " Segundo: " + segundo);
        
    }
    
    
}